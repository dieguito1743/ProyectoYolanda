package Sistema.model.bo;

import Sistema.model.dao.Conexion;
import Sistema.model.dao.PermisosProgramaDaoImp;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class PermisosProgramaBo {

    public static DefaultTableModel obtenerListaPermisosPrograma() throws Exception {
        DefaultTableModel empleadoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            PermisosProgramaDaoImp PermisosProgramaDao = new PermisosProgramaDaoImp(con);
            Vector datosPermisosPrograma = PermisosProgramaDao.obtenerListaPermisosPrograma();
            Vector columnas = new Vector();
            columnas.add("IDPERMISOS");
            columnas.add("IDPROGRAMA");
            columnas.add("PROGRAMA");
            columnas.add("DESCRIPCION");
            columnas.add("IDUSUARIO");
            columnas.add("USERNAME");
            columnas.add("REGISTRO");
            columnas.add("ACTUALIZA");
            columnas.add("ELIMINA");
            empleadoTableModel = new DefaultTableModel(datosPermisosPrograma, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return empleadoTableModel;
    }

    public static DefaultTableModel obtenerListaPermisosProgramaBuscar(String texto) throws Exception {
        DefaultTableModel empleadoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            PermisosProgramaDaoImp PermisosProgramaDao = new PermisosProgramaDaoImp(con);
            Vector datosPermisosPrograma = PermisosProgramaDao.obtenerListaPermisosProgramaBuscar(texto);
            Vector columnas = new Vector();
            columnas.add("IDPERMISOS");
            columnas.add("IDPROGRAMA");
            columnas.add("PROGRAMA");
            columnas.add("DESCRIPCION");
            columnas.add("IDUSUARIO");
            columnas.add("USERNAME");
            columnas.add("REGISTRO");
            columnas.add("ACTUALIZA");
            columnas.add("ELIMINA");
            empleadoTableModel = new DefaultTableModel(datosPermisosPrograma, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return empleadoTableModel;
    }

//    public static DefaultComboBoxModel obtenerModeloPermisosPrograma() throws Exception {
//        DefaultComboBoxModel empleadoComboModel = null;
//        Connection con = Conexion.getConexion();
//        try {
//            PermisosProgramaDaoImp empleadoDao = new PermisosProgramaDaoImp(con);
//            Vector vectorPermisosPrograma = empleadoDao.obtenerListaComboPermisosPrograma();
//            Vector columnas = new Vector();
//            empleadoComboModel = new DefaultComboBoxModel(vectorCliente);
//        } catch (Exception e) {
//            throw e;
//        } finally {
//            if (con != null) {
//                con.close();
//            }
//        }
//        return empleadoComboModel;
//    }
    public static DefaultTableModel obtenerListaPermisosPrograma(String nombre) throws Exception {
        DefaultTableModel empleadoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            PermisosProgramaDaoImp empleadoDao = new PermisosProgramaDaoImp(con);
            Vector datosPermisosPrograma = empleadoDao.obtenerListaPermisosPrograma();
            Vector columnas = new Vector();
            columnas.add("IDPERMISOS");
            columnas.add("IDPROGRAMA");
            columnas.add("PROGRAMA");
            columnas.add("DESCRIPCION");
            columnas.add("IDUSUARIO");
            columnas.add("USERNAME");
            columnas.add("REGISTRO");
            columnas.add("ACTUALIZA");
            columnas.add("ELIMINA");
            empleadoTableModel = new DefaultTableModel(datosPermisosPrograma, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return empleadoTableModel;
    }

    public static DefaultTableModel buscarPermisosPrograma(int codigo) throws Exception {
        DefaultTableModel PermisosProgramaTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            PermisosProgramaDaoImp empleadoDao = new PermisosProgramaDaoImp(con);
            Vector datosPermisosPrograma = empleadoDao.obtenerListaPermisosPrograma();
            Vector columnas = new Vector();
            columnas.add("IDPERMISOS");
            columnas.add("IDPROGRAMA");
            columnas.add("PROGRAMA");
            columnas.add("DESCRIPCION");
            columnas.add("IDUSUARIO");
            columnas.add("USERNAME");
            columnas.add("REGISTRO");
            columnas.add("ACTUALIZA");
            columnas.add("ELIMINA");
            PermisosProgramaTableModel = new DefaultTableModel(datosPermisosPrograma, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return PermisosProgramaTableModel;
    }
}
