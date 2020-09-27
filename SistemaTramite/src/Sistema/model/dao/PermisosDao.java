
package Sistema.model.dao;

import java.sql.SQLException;
import java.util.Vector;


public interface PermisosDao {
    public Vector obtenerListaPermisos() throws SQLException;
    public Vector obtenerListaPermisosBuscar(String nombre) throws SQLException;
    public Vector obtenerListaPermisos(String nombre)throws SQLException;
    public Vector buscarPermisos(int codigo)throws SQLException;
}
