
package Sistema.model.bo;

import Sistema.model.bean.Documento;
import Sistema.model.dao.Conexion;
import Sistema.model.dao.DocumentoDao;
import Sistema.model.dao.DocumentoDaoImp;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class DocumentoBo {
      public static boolean grabarDocumento(Documento oDocumento) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            DocumentoDaoImp DocumentoDao = new DocumentoDaoImp(con);
            DocumentoDao.grabar(oDocumento);
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

    public static boolean eliminarDocumento(Documento oDocumento) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            DocumentoDaoImp DocumentoDao = new DocumentoDaoImp(con);
            DocumentoDao.eliminar(oDocumento);
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

    public static boolean modificarDocumento(Documento oDocumento) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            DocumentoDaoImp DocumentoDao = new DocumentoDaoImp(con);
            DocumentoDao.modificar(oDocumento);
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

    public static DefaultTableModel obtenerListaDocumento() throws Exception {
        DefaultTableModel documentoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            DocumentoDaoImp DocumentoDao = new DocumentoDaoImp(con);
            Vector datosDocumento = DocumentoDao.obtenerListaDocumento();
            Vector columnas = new Vector();
          columnas.add("CODIGO");
            columnas.add("TIPO DE DOCUMENTO");
            columnas.add("NUMERODOCUMENTO");
            columnas.add("DESTINATARIO");
            columnas.add("ANIOS");
            columnas.add("FECHA");
            columnas.add("DOCUMENTO");
            columnas.add("FOLIOS");
            columnas.add("ASUNTO");
            columnas.add("AREA");
            columnas.add("INSTITUCION");
            columnas.add("ARCHIVO");
            columnas.add("ESTADO");
           documentoTableModel = new DefaultTableModel(datosDocumento,columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return documentoTableModel;
    }

    public static DefaultTableModel obtenerListaDocumentoBuscar(String texto) throws Exception {
        DefaultTableModel documentoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            DocumentoDaoImp DocumentoDao = new DocumentoDaoImp(con);
            Vector datosDocumento = DocumentoDao.obtenerListaDocumentoBuscar(texto);
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("IDRIPODOC");
            columnas.add("NRODOC");
            columnas.add("FECHA");
            columnas.add("ANIO");
            columnas.add("DOCUMENTO");
            columnas.add("FOLIOS");
            columnas.add("ASUNTO");
            columnas.add("AREA");
            columnas.add("INSTITUCION");
            columnas.add("ESTADO");

            documentoTableModel = new DefaultTableModel(datosDocumento, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return documentoTableModel;
    }

    public static DefaultComboBoxModel obtenerModeloDocumento() throws Exception {
        DefaultComboBoxModel documentoComboModel = null;
        Connection con = Conexion.getConexion();
        try {
            DocumentoDaoImp documentoDao = new DocumentoDaoImp(con);
//            Vector vectorRremitente = remitenteDao.obtenerListaComboRemitente();
            Vector columnas = new Vector();
//            empleadoComboModel = new DefaultComboBoxModel(vectorCliente);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return documentoComboModel;
    }

    public static DefaultTableModel obtenerListaDocumento(String nombre) throws Exception {
        DefaultTableModel documentoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            DocumentoDaoImp documentoDao = new DocumentoDaoImp(con);
            Vector datosDocumento = documentoDao.obtenerListaDocumento();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("TIPO DE DOCUMENTO");
            columnas.add("NUMERODOCUMENTO");
            columnas.add("DESTINATARIO");
            columnas.add("ANIOS");
            columnas.add("FECHA");
            columnas.add("DOCUMENTO");
            columnas.add("FOLIOS");
            columnas.add("ASUNTO");
            columnas.add("AREA");
            columnas.add("INSTITUCION");
            columnas.add("ARCHIVO");
            columnas.add("ESTADO");
            documentoTableModel = new DefaultTableModel(datosDocumento, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return documentoTableModel;
    }

    public static DefaultTableModel buscarDocumento(int codigo) throws Exception {
        DefaultTableModel DocumentoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            DocumentoDaoImp documentoDao = new DocumentoDaoImp(con);
            Vector datosDocumento = documentoDao.obtenerListaDocumento();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("TIPO DE DOCUMENTO");
            columnas.add("NUMERODOCUMENTO");
            columnas.add("DESTINATARIO");
            columnas.add("ANIOS");
            columnas.add("FECHA");
            columnas.add("DOCUMENTO");
            columnas.add("FOLIOS");
            columnas.add("ASUNTO");
            columnas.add("AREA");
            columnas.add("INSTITUCION");
            columnas.add("ARCHIVO");
            columnas.add("ESTADO");
            DocumentoTableModel = new DefaultTableModel(datosDocumento, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return DocumentoTableModel;
    }
}


