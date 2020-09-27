
package Sistema.model.dao;

import java.sql.SQLException;
import java.util.Vector;

public interface PrioridadDao {
   public Vector obtenerListaPrioridad() throws SQLException;
//    public Vector obtenerListaComboClientes() throws SQLException;
    public Vector obtenerListaPrioridad(String nombre)throws SQLException;
    public Vector buscarPrioridad(int codigo)throws SQLException;   
}
