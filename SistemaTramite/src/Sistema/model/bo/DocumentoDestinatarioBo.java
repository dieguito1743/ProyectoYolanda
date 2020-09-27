package Sistema.model.bo;

import Sistema.model.bean.DocumentoDestinatario;
import Sistema.model.dao.Conexion;
import Sistema.model.dao.DocumentoArchivoDaoImp;
import Sistema.model.dao.DocumentoDaoImp;
import Sistema.model.dao.DocumentoDestinatarioDaoImp;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class DocumentoDestinatarioBo {
    public static boolean grabarDocumentoDestinatario(DocumentoDestinatario oDocumentoDestinatario) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            DocumentoDestinatarioDaoImp DocumentoDestinatarioDao = new DocumentoDestinatarioDaoImp(con);
            DocumentoDestinatarioDao.grabar(oDocumentoDestinatario);
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
    
    public static DefaultTableModel buscarDocumentoDestinatario(int idTipoArchivo, String NroDoc) throws Exception {
        DefaultTableModel DocumentoDestTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            DocumentoDestinatarioDaoImp documentoDestinatarioDao = new DocumentoDestinatarioDaoImp(con);
            Vector datosDocumentoDestinatario = documentoDestinatarioDao.obtenerlistaDocumentoDestinatario(idTipoArchivo, NroDoc);
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("TIPO-DOC");
            columnas.add("NRO-DOC");
            columnas.add("ORIGEN");
            columnas.add("DESTINO");
            DocumentoDestTableModel = new DefaultTableModel(datosDocumentoDestinatario, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return DocumentoDestTableModel;
    }
}
