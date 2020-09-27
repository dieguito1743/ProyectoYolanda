package Sistema.model.bo;

import Sistema.model.bean.DocumentoEstado;
import Sistema.model.dao.Conexion;
import Sistema.model.dao.DocumentoEstadoDao;
import Sistema.model.dao.DocumentoEstadoDaoImp;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class DocumentoEstadoBo {
    public static DefaultComboBoxModel obtenerModeloDocumentoEstado() throws Exception {
        DefaultComboBoxModel EstadoDocumentoComboModel = null;
        Connection con = Conexion.getConexion();
        try {
            DocumentoEstadoDao documentoEstadoDao = new DocumentoEstadoDaoImp(con);
            Vector vectorDocumentoEstado = documentoEstadoDao.obtenerModeloListaDocumentoEstado();
            EstadoDocumentoComboModel = new DefaultComboBoxModel(vectorDocumentoEstado);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return EstadoDocumentoComboModel;
    }

    public static boolean grabarDocumentoEstado(DocumentoEstado oDocumentoEstado) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            DocumentoEstadoDao TipoDocumentoDao = new DocumentoEstadoDaoImp(con);
            TipoDocumentoDao.grabar(oDocumentoEstado);
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

    public static boolean modificarTipoDocumento(DocumentoEstado oDocumentoEstado) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            DocumentoEstadoDao TipoDocumentoDao = new DocumentoEstadoDaoImp(con);
            TipoDocumentoDao.modificar(oDocumentoEstado);
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

    public static boolean eliminarDocumentoEstado(DocumentoEstado oDocumentoEstado) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            DocumentoEstadoDao TipoDocumentoDao = new DocumentoEstadoDaoImp(con);
            TipoDocumentoDao.eliminar(oDocumentoEstado);
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

    public static DefaultTableModel obtenerDocumentoEstado() throws Exception {
        DefaultTableModel documentoEstadoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            DocumentoEstadoDao documentoEstadoDao = new DocumentoEstadoDaoImp(con);
            Vector datosDocumentoEstado = documentoEstadoDao.obtenerListaDocumentoEstado();
            Vector columnas = new Vector();
            columnas.add("IDTIPODOCUMENTO");
            columnas.add("DESCRIPCION");

            documentoEstadoTableModel = new DefaultTableModel(datosDocumentoEstado, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return documentoEstadoTableModel;
    }

    public static DefaultTableModel obtenerListaDocumentoEstadoBuscar(String texto) throws Exception {
        DefaultTableModel TipoDocumentoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            DocumentoEstadoDao documentoEstadoDao = new DocumentoEstadoDaoImp(con);
            Vector datosDocumentoEstado = documentoEstadoDao.obtenerListaDocumentoEstado();
            Vector columnas = new Vector();
            columnas.add("IDTIPODOCUMENTO");
            columnas.add("DESCRIPCION");
            TipoDocumentoTableModel = new DefaultTableModel(datosDocumentoEstado, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return TipoDocumentoTableModel;
    }

    public static DefaultTableModel obtenerListaDocumentoEstado(String nombre) throws Exception {
        DefaultTableModel TipoDocumentoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            DocumentoEstadoDao documentoEstadoDao = new DocumentoEstadoDaoImp(con);
            Vector datosDocumentoEstado = documentoEstadoDao.obtenerListaDocumentoEstado();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("DESCRIPCION");
            columnas.add("ESTADO");
            TipoDocumentoTableModel = new DefaultTableModel(datosDocumentoEstado, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return TipoDocumentoTableModel;
    }

    public static DefaultTableModel buscarDocumentoEstado(int codigo) throws Exception {
        DefaultTableModel TipoDocumentoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            DocumentoEstadoDao documentoEstadoDao = new DocumentoEstadoDaoImp(con);
            Vector datosDocumentoEstado = documentoEstadoDao.obtenerListaDocumentoEstado();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("DESCRIPCION");
            columnas.add("ESTADO");
            TipoDocumentoTableModel = new DefaultTableModel(datosDocumentoEstado, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return TipoDocumentoTableModel;
    }
}
