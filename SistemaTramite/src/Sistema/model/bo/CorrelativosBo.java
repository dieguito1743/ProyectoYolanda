package Sistema.model.bo;

import Sistema.model.bean.Correlativos;
import Sistema.model.dao.Conexion;
import Sistema.model.dao.CorrelativosDaoImp;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class CorrelativosBo {

    public static boolean grabarCorrelativos(Correlativos oCorrelativos) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            CorrelativosDaoImp CorrelativosDao = new CorrelativosDaoImp(con);
            CorrelativosDao.grabar(oCorrelativos);
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

    public static boolean modificarCorrelativos(Correlativos oCorrelativos) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            CorrelativosDaoImp CorrelativosDao = new CorrelativosDaoImp(con);
            CorrelativosDao.modificar(oCorrelativos);
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

    public static boolean eliminarCorrelativos(Correlativos oCorrelativos) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            CorrelativosDaoImp CorrelativosDao = new CorrelativosDaoImp(con);
            CorrelativosDao.eliminar(oCorrelativos);
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

    public static DefaultTableModel obtenerListaCorrelativo() throws Exception {
        DefaultTableModel correlativosTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            CorrelativosDaoImp CorrelativosDao = new CorrelativosDaoImp(con);
            Vector datosCorrelativos = CorrelativosDao.obtenerListaCorrelativos();
            Vector columnas = new Vector();
            columnas.add("IDCORRELATIVO");
            columnas.add("IDDOCUMENTO");
            columnas.add("CORRELATIVO");
            columnas.add("ANIOS");
            columnas.add("ESTADO");
            correlativosTableModel = new DefaultTableModel(datosCorrelativos, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return correlativosTableModel;
    }

    public static DefaultTableModel obtenerListaCorrelativosBuscar(String texto) throws Exception {
        DefaultTableModel correlativosTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            CorrelativosDaoImp CorrelativosDao = new CorrelativosDaoImp(con);
            Vector datosCorrelativos = CorrelativosDao.obtenerListaCorrelativos();
            Vector columnas = new Vector();
            columnas.add("IDCORRELATIVO");
            columnas.add("IDDOCUMENTO");
            columnas.add("CORRELATIVO");
            columnas.add("ANIOS");
            columnas.add("ESTADO");
            correlativosTableModel = new DefaultTableModel(datosCorrelativos, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return correlativosTableModel;
    }

    public static DefaultComboBoxModel obtenerModeloCorrelativos() throws Exception {
        DefaultComboBoxModel correlativosComboModel = null;
        Connection con = Conexion.getConexion();
        try {
            CorrelativosDaoImp correlativosDao = new CorrelativosDaoImp(con);
//            Vector vectorCARGO = cargoDao.obtenerListaComboCargo();
            Vector columnas = new Vector();
//            cargoComboModel = new DefaultComboBoxModel(vectorCliente);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return correlativosComboModel;
    }

    public static DefaultTableModel obtenerListaCorrelativos(String nombre) throws Exception {
        DefaultTableModel correlativosTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            CorrelativosDaoImp CorrelativosDao = new CorrelativosDaoImp(con);
            Vector datosCorrelativos = CorrelativosDao.obtenerListaCorrelativos();
            Vector columnas = new Vector();
            columnas.add("IDCORRELATIVO");
            columnas.add("IDDOCUMENTO");
            columnas.add("CORRELATIVO");
            columnas.add("ANIOS");
            columnas.add("ESTADO");
            correlativosTableModel = new DefaultTableModel(datosCorrelativos, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return correlativosTableModel;
    }

    public static String buscarCorrelativos(int codigo) throws Exception {
        String datosCorrelativos;
        Connection con = Conexion.getConexion();
        try {
            CorrelativosDaoImp correlativosDao = new CorrelativosDaoImp(con);
            datosCorrelativos = correlativosDao.obtenerCorrelativosPorIdTipoDocumento(codigo);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return datosCorrelativos;
    }

    public static String obtenerListaUltimoCorrelativo(int idDocumento) throws Exception {
        String datosCorrelativos;
        Connection con = Conexion.getConexion();
        try {
            CorrelativosDaoImp CorrelativosDao = new CorrelativosDaoImp(con);
            datosCorrelativos = CorrelativosDao.obtenerCorrelativosPorIdTipoDocumento(idDocumento);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return datosCorrelativos;
    }

    public static String obtenerIdDocumento() throws Exception {
        String liIdDoc;
        Connection con = Conexion.getConexion();
        try {
            CorrelativosDaoImp CorrelativosDao = new CorrelativosDaoImp(con);
            liIdDoc = CorrelativosDao.obtenerIdSiguienteDocumento();
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return liIdDoc;
    }

    public static String obtenerCargoCorrelativo() throws Exception {
        String liIdDoc;
        Connection con = Conexion.getConexion();
        try {
            CorrelativosDaoImp CorrelativosDao = new CorrelativosDaoImp(con);
            liIdDoc = CorrelativosDao.obtenerIdSiguienteCargo();
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return liIdDoc;
    }
    
    public static String obtenerRecepcionCorrelativo() throws Exception {
        String liIdDoc;
        Connection con = Conexion.getConexion();
        try {
            CorrelativosDaoImp CorrelativosDao = new CorrelativosDaoImp(con);
            liIdDoc = CorrelativosDao.obtenerIdSiguienteRecepcion();
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return liIdDoc;
    }
}
