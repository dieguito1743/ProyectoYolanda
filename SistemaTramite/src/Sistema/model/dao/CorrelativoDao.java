
package Sistema.model.dao;

import java.sql.SQLException;
import java.util.Vector;

public interface CorrelativoDao extends GeneralDao{
    public Vector obtenerListaCorrelativo() throws SQLException;
//    public Vector obtenerListaComboClientes() throws SQLException;
    public Vector obtenerListaCorrelativo(String nombre)throws SQLException;
    public Vector buscarCorrelativo(int codigo)throws SQLException;
}
