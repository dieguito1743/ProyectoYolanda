package Sistema.model.bo;

import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import Sistema.model.bean.Usuario;
import Sistema.model.dao.*;

public class UsuarioBo {
    public static Usuario validarUsuario(String user, String clave) throws Exception {
        Connection con = null;
        Usuario usuario = null;
        try {
            con = Conexion.getConexion();
            UsuarioDaoImp usuarioDao = new UsuarioDaoImp(con);
            usuario = usuarioDao.ValidarUsuario(user, clave);
            if (usuario == null) {
                throw new Exception("Usuario y/o Clave Incorrecta");
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return usuario;
    }
    
        public static boolean grabarUsuario(Usuario usuario)throws Exception{
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            UsuarioDaoImp usuarioDao = new UsuarioDaoImp(con);
            usuarioDao.grabar(usuario);
            //Finalizar la transaccion
            con.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
            throw e;
        }finally{
            if(con!=null)
                con.close();
        }
    }

    public static boolean modificarUsuario(Usuario usuario)throws Exception{
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            UsuarioDaoImp usuarioDao = new UsuarioDaoImp(con);
            usuarioDao.modificar(usuario);
            con.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
            throw e;
        }finally{
            if(con!=null)
                con.close();
        }
    }

    public static boolean eliminarUsuario(Usuario usuario)throws Exception{
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            UsuarioDaoImp usuarioDao = new UsuarioDaoImp(con);
            usuarioDao.eliminar(usuario);
            con.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
            throw e;
        }finally{
            if(con!=null)
                con.close();
        }
    }

    public static DefaultTableModel obtenerListaUsuarios() throws Exception{
        DefaultTableModel autorTableModel = null;
        Connection con = Conexion.getConexion();
        try{
        UsuarioDao usuarioDao  = (UsuarioDao) new UsuarioDaoImp(con);
        Vector datosUser = usuarioDao.obtenerListaUsuario();
        Vector columnas = new Vector();
          columnas.add("CODIGO");
          columnas.add("USUARIO");
          columnas.add("CLAVE");
          columnas.add("FECHA");
       autorTableModel = new DefaultTableModel(datosUser,columnas);

        }catch(Exception e){
            throw e;
        }finally{
          if(con!=null)
              con.close();
        }
        return autorTableModel;
    }
    public static DefaultTableModel obtenerListaUsuariosBuscar(String texto) throws Exception{
        DefaultTableModel autorTableModel = null;
        Connection con = Conexion.getConexion();
        try{
        UsuarioDaoImp usuarioDao  = new UsuarioDaoImp(con);
        Vector datosUser = usuarioDao.obtenerListaUsuario(texto);
        Vector columnas = new Vector();
          columnas.add("CODIGO");
          columnas.add("USUARIO");
          columnas.add("CLAVE");
          columnas.add("FECHA");
       autorTableModel = new DefaultTableModel(datosUser,columnas);

        }catch(Exception e){
            throw e;
        }finally{
          if(con!=null)
              con.close();
        }
        return autorTableModel;
    }
}