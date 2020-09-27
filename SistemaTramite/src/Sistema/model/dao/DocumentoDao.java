
package Sistema.model.dao;

import java.sql.SQLException;
import java.util.Vector;

public interface DocumentoDao {
    public Vector obtenerListaDocumento() throws SQLException;
//    public Vector obtenerListaComboClientes() throws SQLException;
    public Vector obtenerListaDocumento(String nombre)throws SQLException;
    public Vector buscarDocumento(int codigo)throws SQLException;
}
