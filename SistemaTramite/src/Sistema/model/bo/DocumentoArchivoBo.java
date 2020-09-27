package Sistema.model.bo;

import Sistema.model.bean.DocumentoArchivo;
import Sistema.model.dao.Conexion;
import Sistema.model.dao.DocumentoArchivoDaoImp;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class DocumentoArchivoBo {

    public static boolean grabarDocumentoArchivo(DocumentoArchivo oDocumentoArchivo) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            DocumentoArchivoDaoImp DocumentoArchivoDao = new DocumentoArchivoDaoImp(con);
            DocumentoArchivoDao.grabar(oDocumentoArchivo);
            con.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }

        }
    }

    public static DefaultTableModel buscarDocumentoArchivo(int idTipoArchivo, String NroDoc) throws Exception {
        DefaultTableModel DocumentoArchTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            DocumentoArchivoDaoImp documentoArchivoDao = new DocumentoArchivoDaoImp(con);
            Vector datosDocumentoArchivo = documentoArchivoDao.obtenerlistaDocumentoArchivo(idTipoArchivo, NroDoc);
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("TIPO-DOC");
            columnas.add("NRO-DOC");
            columnas.add("ORIGEN");
            columnas.add("DESTINO");
            DocumentoArchTableModel = new DefaultTableModel(datosDocumentoArchivo, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return DocumentoArchTableModel;
    }
}
