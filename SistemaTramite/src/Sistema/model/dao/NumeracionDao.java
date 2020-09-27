
package Sistema.model.dao;

import java.sql.SQLException;
import java.util.Vector;
public interface NumeracionDao {
     public Vector obtenerListaNumeracion() throws SQLException;
//    public Vector obtenerListaComboClientes() throws SQLException;
    public Vector obtenerListaNumeracion(String nombre)throws SQLException;
    public Vector buscarNumeracion(int codigo)throws SQLException;
}

