package Sistema.model.bo;

import Sistema.model.bean.Estado;
import Sistema.model.dao.Conexion;
import Sistema.model.dao.EstadoDaoImp;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class EstadoBo {
     public static boolean grabarEstado(Estado oEstado) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            EstadoDaoImp EstadoDao = new EstadoDaoImp(con);
            EstadoDao.grabar(oEstado);
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

    public static boolean modificarEstado(Estado oEstado) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            EstadoDaoImp EstadoDao = new EstadoDaoImp(con);
            EstadoDao.modificar(oEstado);
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

    public static boolean eliminarEstado(Estado oEstado) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            EstadoDaoImp EstadoDao = new EstadoDaoImp(con);
            EstadoDao.eliminar(oEstado);
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

    public static DefaultTableModel obtenerListaEstado() throws Exception {
        DefaultTableModel estadoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            EstadoDaoImp EstadoDao = new EstadoDaoImp(con);
            Vector datosEstado = EstadoDao.obtenerListaEstado();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("ESTADO");
            columnas.add("UBICACION");
            estadoTableModel = new DefaultTableModel(datosEstado, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return estadoTableModel;
    }

    public static DefaultTableModel obtenerListaEstadoBuscar(String texto) throws Exception {
        DefaultTableModel estadoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            EstadoDaoImp EstadoDao = new EstadoDaoImp(con);
            Vector datosEstado = EstadoDao.obtenerListaEstado();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("ESTADO");
            columnas.add("UBICACION");
           estadoTableModel = new DefaultTableModel(datosEstado, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return estadoTableModel;
    }

    public static DefaultComboBoxModel obtenerModeloEstado() throws Exception {
        DefaultComboBoxModel estadoComboModel = null;
        Connection con = Conexion.getConexion();
        try {
            EstadoDaoImp estadoDao = new EstadoDaoImp(con);
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
        return estadoComboModel;
    }

    public static DefaultTableModel obtenerListaEstado(String nombre) throws Exception {
        DefaultTableModel estadoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            EstadoDaoImp EstadoDao = new EstadoDaoImp(con);
            Vector datosEstado = EstadoDao.obtenerListaEstado();
            Vector columnas = new Vector();
            columnas.add("IDESTADO");
            columnas.add("ESTADO");
            columnas.add("UBICACION");
            estadoTableModel = new DefaultTableModel(datosEstado, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return estadoTableModel;
    }
    public static DefaultTableModel buscarEstado(int codigo) throws Exception{
        DefaultTableModel EstadoTableModel = null;
        Connection con = Conexion.getConexion();
        try{
       EstadoDaoImp estadoDao = new EstadoDaoImp(con);
         Vector datosEstado = estadoDao.obtenerListaEstado();
        Vector columnas = new Vector();
            columnas.add("IDESTADO");
            columnas.add("ESTADO");
            columnas.add("UBICACION");
          EstadoTableModel = new DefaultTableModel(datosEstado, columnas);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return EstadoTableModel;
    }
}
