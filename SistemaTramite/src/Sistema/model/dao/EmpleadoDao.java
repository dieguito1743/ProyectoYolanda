
package Sistema.model.dao;
import java.sql.SQLException;
import java.util.Vector;

public interface EmpleadoDao {
    public Vector obtenerListaEmpleado() throws SQLException;
//    public Vector obtenerListaComboClientes() throws SQLException;
    public Vector obtenerListaEmpleado(String nombre)throws SQLException;
    public Vector buscarEmpleado(int codigo)throws SQLException;

  
    
}
