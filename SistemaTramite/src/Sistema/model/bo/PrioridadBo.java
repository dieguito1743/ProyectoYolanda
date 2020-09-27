
package Sistema.model.bo;

import Sistema.model.bean.Prioridad;
import Sistema.model.dao.Conexion;
import Sistema.model.dao.PrioridadDaoImp;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class PrioridadBo {
  public static boolean grabarPrioridad(Prioridad oPrioridad) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
          PrioridadDaoImp PrioridadDao = new PrioridadDaoImp(con);
           PrioridadDao.grabar(oPrioridad);
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

    public static boolean modificarPrioridad(Prioridad oPrioridad) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
           PrioridadDaoImp PrioridadDao = new PrioridadDaoImp(con);
            PrioridadDao.modificar(oPrioridad);
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

    public static boolean eliminarPrioridad(Prioridad oPrioridad) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
          PrioridadDaoImp PrioridadDao = new PrioridadDaoImp(con);
           PrioridadDao.eliminar(oPrioridad);
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

    public static DefaultTableModel obtenerListaPrioridad() throws Exception {
        DefaultTableModel PrioridadTableModel = null;
        Connection con = Conexion.getConexion();
        try {
           PrioridadDaoImp PrioridadDao = new PrioridadDaoImp(con);
            Vector datosPrioridad = PrioridadDao.obtenerListaPrioridad();
            Vector columnas = new Vector();
            columnas.add("IDPrioridad");
            columnas.add("Prioridad");
            columnas.add("Fecha");
        
          PrioridadTableModel = new DefaultTableModel(datosPrioridad,columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return  PrioridadTableModel;
    }

    public static DefaultTableModel obtenerListaPrioridadBuscar(String Prioridad) throws Exception {
        DefaultTableModel PrioridadTableModel = null;
        Connection con = Conexion.getConexion();
        try {
          PrioridadDaoImp PrioridadDao = new PrioridadDaoImp(con);
            Vector datosEntidad = PrioridadDao. obtenerListaPrioridadBuscar(Prioridad);
            Vector columnas = new Vector();
            columnas.add("IDPrioridad");
            columnas.add("Prioridad");
            columnas.add("Fecha");
            
           PrioridadTableModel = new DefaultTableModel(datosEntidad, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return  PrioridadTableModel;
    }

    public static DefaultComboBoxModel obtenerModeloPrioridad() throws Exception {
        DefaultComboBoxModel PrioridadComboModel = null;
        Connection con = Conexion.getConexion();
        try {
            PrioridadDaoImp  PrioridadDao = new  PrioridadDaoImp(con);
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
        return  PrioridadComboModel;
    }

    public static DefaultTableModel obtenerListaPrioridad(String nombre) throws Exception {
      DefaultTableModel  PrioridadTableModel = null;
        Connection con = Conexion.getConexion();
        try {
          PrioridadDaoImp  PrioridadDao = new  PrioridadDaoImp(con);
            Vector datosEntidad =  PrioridadDao.obtenerListaPrioridad();
            Vector columnas = new Vector();
            columnas.add("IDPrioridad");
            columnas.add("Prioridad");
            columnas.add("Fecha");
            
          PrioridadTableModel = new DefaultTableModel(datosEntidad, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        
        return   PrioridadTableModel;
    }
 }
    public static DefaultTableModel buscarPrioridad(int codigo) throws Exception {
        DefaultTableModel  PrioridadTableModel = null;
        Connection con = Conexion.getConexion();
        try {
          PrioridadDaoImp  PrioridadDao = new  PrioridadDaoImp(con);
            Vector datosEntidad =  PrioridadDao.obtenerListaPrioridad();
            Vector columnas = new Vector();
           columnas.add("IDPrioridad");
            columnas.add("Prioridad");
            columnas.add("Fecha");
            
          PrioridadTableModel = new DefaultTableModel(datosEntidad, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        
        return   PrioridadTableModel;
    }   
}  
}
