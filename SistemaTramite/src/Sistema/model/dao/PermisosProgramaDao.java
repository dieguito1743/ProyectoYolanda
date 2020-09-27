
package Sistema.model.dao;

import java.sql.SQLException;
import java.util.Vector;

public interface PermisosProgramaDao {
    public Vector obtenerListaPermisosPrograma() throws SQLException;
    public Vector obtenerListaPermisosProgramaBuscar(String texto) throws SQLException;
    public Vector buscarPermisosPrograma(int codigo)throws SQLException; 
}
