
package Sistema.model.bo;

import Sistema.model.bean.Permisos;
import Sistema.model.dao.Conexion;
import Sistema.model.dao.PermisosDaoImp;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class PermisosBo {
 public static boolean grabarPermisos(Permisos oPermisos) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
           PermisosDaoImp PermisosDao = new PermisosDaoImp(con);
            PermisosDao.grabar(oPermisos);
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

    public static boolean modificarPermisos(Permisos oPermisos) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            PermisosDaoImp PermisosDao = new PermisosDaoImp(con);
             PermisosDao.modificar(oPermisos);
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

    public static boolean eliminarPermisos(Permisos oPermisos) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
           PermisosDaoImp PermisosDao = new PermisosDaoImp(con);
           PermisosDao.eliminar(oPermisos);
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

    public static DefaultTableModel obtenerListaPermisos() throws Exception {
        DefaultTableModel PermisosTableModel = null;
        Connection con = Conexion.getConexion();
        try {
           PermisosDaoImp PermisosDao = new PermisosDaoImp(con);
            Vector datosPermisos = PermisosDao.obtenerListaPermisos();
            Vector columnas = new Vector();
            columnas.add("IDPERMISOS");
            columnas.add("IDPROGRAMA");
            columnas.add("IDUSUARIO");
            columnas.add("REGISTRO");
            columnas.add("ACTUALIZA");
            columnas.add("ELIMINA");
        
           PermisosTableModel = new DefaultTableModel(datosPermisos,columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return  PermisosTableModel;
    }

    public static DefaultTableModel obtenerListaPermisosBuscar(String nombre) throws Exception {
        DefaultTableModel PermisosTableModel = null;
        Connection con = Conexion.getConexion();
        try {
           PermisosDaoImp PermisosDao = new PermisosDaoImp(con);
            Vector datosPermisos = PermisosDao.obtenerListaPermisosBuscar(nombre);
            Vector columnas = new Vector();
            columnas.add("IDPERMISOS");
            columnas.add("IDPROGRAMA");
            columnas.add("IDUSUARIO");
            columnas.add("REGISTRO");
            columnas.add("ACTUALIZA");
            columnas.add("ELIMINA");
            
           PermisosTableModel = new DefaultTableModel(datosPermisos, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return   PermisosTableModel;
    }

    public static DefaultComboBoxModel obtenerModeloPermisos() throws Exception {
        DefaultComboBoxModel PermisosComboModel = null;
        Connection con = Conexion.getConexion();
        try {
           PermisosDaoImp PermisosDao = new PermisosDaoImp(con);
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
        return PermisosComboModel;
    }

    public static DefaultTableModel obtenerListaPermisos(String nombre) throws Exception {
      DefaultTableModel PermisosTableModel = null;
        Connection con = Conexion.getConexion();
        try {
           PermisosDaoImp PermisosDao = new PermisosDaoImp(con);
            Vector datosPermisos = PermisosDao.obtenerListaPermisos();
            Vector columnas = new Vector();
           columnas.add("IDPERMISOS");
            columnas.add("IDPROGRAMA");
            columnas.add("IDUSUARIO");
            columnas.add("REGISTRO");
            columnas.add("ACTUALIZA");
            columnas.add("ELIMINA");
            
          PermisosTableModel = new DefaultTableModel(datosPermisos, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        
        return  PermisosTableModel;
    }
 }
    
       public static DefaultTableModel obtenerListaPermisosBP(String nombre) throws Exception {
      DefaultTableModel PermisosTableModel = null;
        Connection con = Conexion.getConexion();
        try {
           PermisosDaoImp PermisosDao = new PermisosDaoImp(con);
            Vector datosPermisos = PermisosDao.obtenerListaPermisos();
            Vector columnas = new Vector();
           columnas.add("IDPERMISOS");
            columnas.add("PROGRAMA");
            columnas.add("DESCRIPCION");
            columnas.add("USUARIO");
            columnas.add("REGISTRO");
            columnas.add("ACTUALIZA");
            columnas.add("ELIMINA");
            columnas.add("IDPROGRAMA");
            columnas.add("IDUSUARIO");
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        
        return  PermisosTableModel;
    }
 } 
    
    public static DefaultTableModel buscarPermisos(int codigo) throws Exception {
        DefaultTableModel PermisosTableModel = null;
        Connection con = Conexion.getConexion();
        try {
          PermisosDaoImp PermisosDao = new PermisosDaoImp(con);
            Vector datosPermisos = PermisosDao.obtenerListaPermisos();
            Vector columnas = new Vector();
           columnas.add("IDPERMISOS");
            columnas.add("IDPROGRAMA");
            columnas.add("IDUSUARIO");
            columnas.add("REGISTRO");
            columnas.add("ACTUALIZA");
            columnas.add("ELIMINA");
            
          PermisosTableModel = new DefaultTableModel(datosPermisos, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        
        return  PermisosTableModel;
    }   
}   
}
