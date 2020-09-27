
package Sistema.model.dao;

import java.sql.SQLException;
import java.util.Vector;


public interface RecepcionDao {
      public Vector obtenerListaRecepcion() throws SQLException;
//    public Vector obtenerListaComboClientes() throws SQLException;
    public Vector obtenerListaRecepcion(String nombre)throws SQLException;
    public Vector buscarRecepcion(int codigo)throws SQLException;

}
