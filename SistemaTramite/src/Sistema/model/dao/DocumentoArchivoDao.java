
package Sistema.model.dao;

import java.sql.SQLException;
import java.util.Vector;


public interface DocumentoArchivoDao extends GeneralDao {
    public Vector obtenerListaDocumentoArchivo() throws SQLException;
    public Vector obtenerListaDocumentoArchivo(String nombre)throws SQLException;
    public Vector obtenerlistaDocumentoArchivo(int idTipoDoc, String nroDoc)throws SQLException;
    public Vector buscarDocumentoArchivo(int codigo)throws SQLException;
}
