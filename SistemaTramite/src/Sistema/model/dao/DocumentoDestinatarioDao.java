package Sistema.model.dao;

import java.sql.SQLException;
import java.util.Vector;

public interface DocumentoDestinatarioDao extends GeneralDao{
    public Vector obtenerListaDocumentoDestinatario() throws SQLException;
    public Vector obtenerListaDocumentoDestinatario(String nombre)throws SQLException;
    public Vector obtenerlistaDocumentoDestinatario(int idTipoDoc, String nroDoc)throws SQLException;
    public Vector buscarDocumentoDestinatario(int codigo)throws SQLException;
}
