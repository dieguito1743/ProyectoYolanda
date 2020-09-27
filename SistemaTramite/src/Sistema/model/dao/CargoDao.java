
package Sistema.model.dao;

import java.sql.SQLException;
import java.util.Vector;


public interface CargoDao extends GeneralDao{
    public Vector obtenerListaCargo() throws SQLException;
//    public Vector obtenerListaCargo() throws SQLException;
//    public Vector obtenerListaComboClientes() throws SQLException;
    public Vector obtenerListaCargo(String nombre)throws SQLException;
    public Vector buscarCargo(int codigo)throws SQLException;
    public Vector buscarCargosIdCargo(int codigo)throws SQLException;

}
