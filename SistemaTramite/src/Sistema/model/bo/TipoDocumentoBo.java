package Sistema.model.bo;

import Sistema.model.bean.TipoDocumento;
import Sistema.model.dao.Conexion;
import Sistema.model.dao.TipoDocumentoDao;
import Sistema.model.dao.TipoDocumentoDaoImp;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class TipoDocumentoBo {

    public static DefaultComboBoxModel obtenerModeloTipoDocumento() throws Exception {
        DefaultComboBoxModel TipoDocumentoComboModel = null;
        Connection con = Conexion.getConexion();
        try {
            TipoDocumentoDao tipoDocumentoDao = new TipoDocumentoDaoImp(con);
            Vector vectorTipoDocumento = tipoDocumentoDao.obtenerModeloListaTipoDocumento();
            TipoDocumentoComboModel = new DefaultComboBoxModel(vectorTipoDocumento);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return TipoDocumentoComboModel;
    }

    public static boolean grabarTipoDocumento(TipoDocumento oTipoDocumento) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            TipoDocumentoDaoImp TipoDocumentoDao = new TipoDocumentoDaoImp(con);
            TipoDocumentoDao.grabar(oTipoDocumento);
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

    public static boolean modificarTipoDocumento(TipoDocumento oTipoDocumento) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            TipoDocumentoDaoImp TipoDocumentoDao = new TipoDocumentoDaoImp(con);
            TipoDocumentoDao.modificar(oTipoDocumento);
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

    public static boolean eliminarTipoDocumento(TipoDocumento oTipoDocumento) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            TipoDocumentoDaoImp TipoDocumentoDao = new TipoDocumentoDaoImp(con);
            TipoDocumentoDao.eliminar(oTipoDocumento);
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

    public static DefaultTableModel obtenerTipoDocumento() throws Exception {
        DefaultTableModel TipoDocumentoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            TipoDocumentoDaoImp TipoDocumentoDao = new TipoDocumentoDaoImp(con);
            Vector datosTipoDocumento = TipoDocumentoDao.obtenerListaTipoDocumento();
            Vector columnas = new Vector();
            columnas.add("IDTIPODOCUMENTO");
            columnas.add("DESCRIPCION");

            TipoDocumentoTableModel = new DefaultTableModel(datosTipoDocumento, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return TipoDocumentoTableModel;
    }

    public static DefaultTableModel obtenerListaTipoDocumentoBuscar(String texto) throws Exception {
        DefaultTableModel TipoDocumentoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            TipoDocumentoDaoImp TipoDocumentoDao = new TipoDocumentoDaoImp(con);
            Vector datosTipoDocumento = TipoDocumentoDao.obtenerListaTipoDocumento();
            Vector columnas = new Vector();
            columnas.add("IDTIPODOCUMENTO");
            columnas.add("DESCRIPCION");
            TipoDocumentoTableModel = new DefaultTableModel(datosTipoDocumento, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return TipoDocumentoTableModel;
    }

    public static DefaultTableModel obtenerListaTipoDocumento(String nombre) throws Exception {
        DefaultTableModel TipoDocumentoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            TipoDocumentoDaoImp TipoDocumentoDao = new TipoDocumentoDaoImp(con);
            Vector datosTipoDocumento = TipoDocumentoDao.obtenerListaTipoDocumento();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("DESCRIPCION");
            columnas.add("ESTADO");
            TipoDocumentoTableModel = new DefaultTableModel(datosTipoDocumento, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return TipoDocumentoTableModel;
    }

    public static DefaultTableModel buscarTipoDocumento(int codigo) throws Exception {
        DefaultTableModel TipoDocumentoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            TipoDocumentoDaoImp TipoDocumentoDao = new TipoDocumentoDaoImp(con);
            Vector datosTipoDocumento = TipoDocumentoDao.obtenerListaTipoDocumento();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("DESCRIPCION");
            columnas.add("ESTADO");
            TipoDocumentoTableModel = new DefaultTableModel(datosTipoDocumento, columnas);

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
