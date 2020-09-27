
package Sistema.model.bo;

import Sistema.model.bean.Programa;
import Sistema.model.dao.Conexion;
import Sistema.model.dao.ProgramaDaoImp;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class ProgramaBo {
  public static boolean grabarPrograma(Programa oPrograma) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
           ProgramaDaoImp ProgramaDao = new ProgramaDaoImp(con);
            ProgramaDao.grabar(oPrograma);
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

    public static boolean modificarPrograma(Programa oPrograma) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            ProgramaDaoImp ProgramaDao = new ProgramaDaoImp(con);
             ProgramaDao.modificar(oPrograma);
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

    public static boolean eliminarPrograma(Programa oPrograma) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
           ProgramaDaoImp ProgramaDao = new ProgramaDaoImp(con);
           ProgramaDao.eliminar(oPrograma);
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

    public static DefaultTableModel obtenerListaPrograma() throws Exception {
        DefaultTableModel ProgramaTableModel = null;
        Connection con = Conexion.getConexion();
        try {
           ProgramaDaoImp ProgramaDao = new ProgramaDaoImp(con);
            Vector datosPrograma = ProgramaDao.obtenerListaPrograma();
            Vector columnas = new Vector();
            columnas.add("IDPROGRAMA");
            columnas.add("PROGRAMA");
            columnas.add("DESCRIPCION");
            columnas.add("ESTADO");
            columnas.add("FECHA");
          ProgramaTableModel = new DefaultTableModel(datosPrograma,columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return  ProgramaTableModel;
    }

    public static DefaultTableModel obtenerListaProgramaBuscar(String Programa) throws Exception {
        DefaultTableModel ProgramaTableModel = null;
        Connection con = Conexion.getConexion();
        try {
           ProgramaDaoImp ProgramaDao = new ProgramaDaoImp(con);
            Vector datosPrograma = ProgramaDao. obtenerListaProgramaBuscar(Programa);
            Vector columnas = new Vector();
            columnas.add("IDPROGRAMA");
            columnas.add("PROGRAMA");
            columnas.add("DESCRIPCION");
            columnas.add("ESTADO");
            columnas.add("FECHA");
            
           ProgramaTableModel = new DefaultTableModel(datosPrograma, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return   ProgramaTableModel;
    }

    public static DefaultComboBoxModel obtenerModeloPrograma() throws Exception {
        DefaultComboBoxModel ProgramaComboModel = null;
        Connection con = Conexion.getConexion();
        try {
           ProgramaDaoImp ProgramaDao = new ProgramaDaoImp(con);
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
        return ProgramaComboModel;
    }

    public static DefaultTableModel obtenerListaPrograma(String nombre) throws Exception {
      DefaultTableModel ProgramaTableModel = null;
        Connection con = Conexion.getConexion();
        try {
           ProgramaDaoImp ProgramaDao = new ProgramaDaoImp(con);
            Vector datosPrograma = ProgramaDao.obtenerListaPrograma();
            Vector columnas = new Vector();
            columnas.add("IDPROGRAMA");
            columnas.add("PROGRAMA");
            columnas.add("DESCRIPCION");
            columnas.add("ESTADO");
            columnas.add("FECHA");
            
          ProgramaTableModel = new DefaultTableModel(datosPrograma, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        
        return  ProgramaTableModel;
    }
 }
    public static DefaultTableModel buscarPrograma(int codigo) throws Exception {
        DefaultTableModel ProgramaTableModel = null;
        Connection con = Conexion.getConexion();
        try {
          ProgramaDaoImp ProgramaDao = new ProgramaDaoImp(con);
            Vector datosPrograma = ProgramaDao.obtenerListaPrograma();
            Vector columnas = new Vector();
            columnas.add("IDPROGRAMA");
            columnas.add("PROGRAMA");
            columnas.add("DESCRIPCION");
            columnas.add("ESTADO");
            columnas.add("FECHA");
            
          ProgramaTableModel = new DefaultTableModel(datosPrograma, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        
        return  ProgramaTableModel;
    }   
}  
}
