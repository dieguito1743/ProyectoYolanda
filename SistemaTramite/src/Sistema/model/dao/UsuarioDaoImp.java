package Sistema.model.dao;

import Sistema.model.bean.Usuario;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;

public class UsuarioDaoImp {

    private PreparedStatement pst;
    private Usuario oUsuario;
    private Connection con;
    private Statement st;
    private ResultSet rs;

    public UsuarioDaoImp(Connection con) {
        this.con = con;
    }

    public Usuario ValidarUsuario(String us, String cla) throws Exception {
        Usuario usuario = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        try {
            String sql = "select idUsuario,Username,Pasword,Fecha  from Usuario Where Username= ? and Pasword=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, us);
            pst.setString(2, cla);
            rs = pst.executeQuery();
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt(1));
                usuario.setUsername(rs.getString(2));
                usuario.setPasword(rs.getString(3));
                usuario.setFecha(rs.getString(4));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (rs != null) {
                rs.close();
            } else {
                pst.close();
            }
        }
        return usuario;
    }

    public boolean grabar(Object object) throws SQLException {
        oUsuario = (Usuario) object;
        try {
            String sql = "insert into usuario(idUsuario,Username,Pasword,Fecha) "
                    + "values(NULL,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, oUsuario.getIdUsuario());
            pst.setString(2, oUsuario.getUsername());
            pst.setString(3, oUsuario.getPasword());
            pst.setString(4, oUsuario.getFecha());
            pst.execute();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean eliminar(Object object) throws SQLException {
        oUsuario = (Usuario) object;
        try {
            String sql = "Delete From Usuario where IdUsuario =" + oUsuario.getIdUsuario();
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean modificar(Object object) throws SQLException {
        oUsuario = (Usuario) object;
        try {
            String sql = "update Usuario Set Pasword=? Where userId = " + oUsuario.getIdUsuario();
            pst = con.prepareStatement(sql);
            pst.setString(1, oUsuario.getPasword());
            pst.executeUpdate();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public Vector obtenerListaUsuario() throws SQLException {
        Vector listaUsuario = new Vector();
        String sql = "select u.IdUsuario,u.username,u.pasword,u.fecha FROM usuario u ";
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            Vector usuario = new Vector();
            usuario.add(rs.getInt(1));
            usuario.add(rs.getString(2));
            usuario.add(rs.getString(3));
            usuario.add(rs.getString(4));
            usuario.add(rs.getString(5));
            usuario.add(rs.getInt(6));
            listaUsuario.add(usuario);
        }
        return listaUsuario;
    }

    public Vector obtenerListaUsuario(String nombre) throws SQLException {
        Vector listaUsuario = new Vector();
        
        String sql = "select u.IdUsuario,u.username,u.pasword,u.fecha FROM usuario u WHERE u.username LIKE '%"+nombre+"%'";
        JOptionPane.showMessageDialog(null, sql);
        st = con.createStatement();
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
//        pst = con.prepareStatement(sql);
//        pst.setString(1, '%' + nombre + '%');
//        ResultSet rs = pst.executeQuery();
//        
//        
//                String sql = "SELECT idEmpleado,RazonSocial,RUCDNI,Telefono,correo,estado FROM dbo.Empleado WHERE RazonSocial LIKE '%"+texto+"%'";
        while (rs.next()) {
            Vector usuario = new Vector();
            usuario.add(rs.getInt(1));
            usuario.add(rs.getString(2));
            usuario.add(rs.getString(3));
            usuario.add(rs.getString(4));
            listaUsuario.add(usuario);
        }
        return listaUsuario;
    }
}
