
package Sistema.model.bo;

import Sistema.model.bean.Derivacion;
import Sistema.model.dao.Conexion;
import Sistema.model.dao.DerivacionDaoImp;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class DerivacionBo {
    public static boolean grabarDerivacion(Derivacion oDerivacion) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            DerivacionDaoImp DerivacionDao = new DerivacionDaoImp(con);
            DerivacionDao.grabar(oDerivacion);
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

    public static boolean modificarDerivacion(Derivacion oDerivacion) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            DerivacionDaoImp DerivacionDao = new DerivacionDaoImp(con);
            DerivacionDao.modificar(oDerivacion);
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

    public static boolean eliminarDerivacion(Derivacion oDerivacion) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            DerivacionDaoImp DerivacionDao = new DerivacionDaoImp(con);
            DerivacionDao.eliminar(oDerivacion);
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

    public static DefaultTableModel obtenerListaDerivacion() throws Exception {
        DefaultTableModel derivacionTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            DerivacionDaoImp DerivacionDao = new DerivacionDaoImp(con);
            Vector datosDerivacion = DerivacionDao.obtenerListaDerivacion();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("DERIVACION");
            columnas.add("FECHA");
            columnas.add("IDDOCUMENTO");
            columnas.add("REMITENTE");
            columnas.add("MOTIVO DERIVACION");
            columnas.add("PRIORIDAD");
            columnas.add("OBSERVACION");
            derivacionTableModel = new DefaultTableModel(datosDerivacion, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return derivacionTableModel;
    }

    public static DefaultTableModel obtenerListaDerivacionBuscar(String MotivoDerivacion) throws Exception {
        DefaultTableModel derivacionTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            DerivacionDaoImp DerivacionDao = new DerivacionDaoImp(con);
            Vector datosDerivacion = DerivacionDao.obtenerListaDerivacionBuscar(MotivoDerivacion);
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("DERIVACION");
            columnas.add("FECHA");
            columnas.add("IDDOCUMENTO");
            columnas.add("REMITENTE");
            columnas.add("MOTIVO DERIVACION");
            columnas.add("PRIORIDAD");
            columnas.add("OBSERVACION");
            derivacionTableModel = new DefaultTableModel(datosDerivacion, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return derivacionTableModel;
    }

    public static DefaultComboBoxModel obtenerModeloDerivacion() throws Exception {
        DefaultComboBoxModel derivacionComboModel = null;
        Connection con = Conexion.getConexion();
        try {
            DerivacionDaoImp DerivacionDao = new DerivacionDaoImp(con);
//            Vector vectorEmpleado = empleadoDao.obtenerListaComboEmpleado();
            Vector columnas = new Vector();
//            empleadoComboModel = new DefaultComboBoxModel(vectorCliente);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return derivacionComboModel;
    }

    public static DefaultTableModel obtenerListaDerivacion(String nombre) throws Exception {
        DefaultTableModel derivacionTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            DerivacionDaoImp DerivacionDao = new DerivacionDaoImp(con);
            Vector datosDerivacion = DerivacionDao.obtenerListaDerivacion();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("DERIVACION");
            columnas.add("FECHA");
            columnas.add("IDDOCUMENTO");
            columnas.add("REMITENTE");
            columnas.add("MOTIVO DERIVACION");
            columnas.add("PRIORIDAD");
            columnas.add("OBSERVACION");
            derivacionTableModel = new DefaultTableModel(datosDerivacion, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return derivacionTableModel;
    }

    public static DefaultTableModel buscarDerivacion(int codigo) throws Exception {
        DefaultTableModel DerivacionTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            DerivacionDaoImp derivacionDao = new DerivacionDaoImp(con);
            Vector datosDerivacion = derivacionDao.obtenerListaDerivacion();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("DERIVACION");
            columnas.add("FECHA");
            columnas.add("IDDOCUMENTO");
            columnas.add("REMITENTE");
            columnas.add("MOTIVO DERIVACION");
            columnas.add("PRIORIDAD");
            columnas.add("OBSERVACION");
            DerivacionTableModel = new DefaultTableModel(datosDerivacion, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return DerivacionTableModel;
    }
}


