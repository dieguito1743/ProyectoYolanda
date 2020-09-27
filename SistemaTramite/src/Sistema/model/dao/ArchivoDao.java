
package Sistema.model.dao;

import java.sql.SQLException;
import java.util.Vector;
 public interface ArchivoDao {
    public Vector obtenerListaArchivo() throws SQLException;
//    public Vector obtenerListaComboClientes() throws SQLException;
    public Vector obtenerListaArchivo(String nombre)throws SQLException;
    public Vector buscarArchivo(int codigo)throws SQLException;
}
