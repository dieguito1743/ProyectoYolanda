package Sistema.model.dao;

import Sistema.model.bean.Usuario;
import java.sql.SQLException;
import java.util.Vector;

public interface UsuarioDao extends GeneralDao {
    public Usuario validarUsuario(String user, String clave) throws SQLException;
    public Vector obtenerListaUsuario() throws SQLException;
    public Vector obtenerListaUsuario(String nombre)throws SQLException;
}
