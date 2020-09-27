
package Sistema.model.dao;

import java.sql.SQLException;
import java.util.Vector;


public interface ProgramaDao {
      public Vector obtenerListaPrograma() throws SQLException;
//    public Vector obtenerListaComboClientes() throws SQLException;
    public Vector obtenerListaPrograma(String nombre)throws SQLException;
    public Vector buscarPrograma(int codigo)throws SQLException;
}
