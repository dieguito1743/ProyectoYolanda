
package Sistema.model.dao;

import java.sql.SQLException;
import java.util.Vector;


public interface DerivacionDao {
      public Vector obtenerListaDerivacion() throws SQLException;
//    public Vector obtenerListaComboClientes() throws SQLException;
    public Vector obtenerListaDerivacion(String nombre)throws SQLException;
    public Vector buscarDerivacion(int codigo)throws SQLException;
}

