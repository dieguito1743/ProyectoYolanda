package Sistema.model.dao;

import java.sql.SQLException;
import java.util.Vector;

public interface DocumentoEstadoDao extends GeneralDao{
    public Vector obtenerListaDocumentoEstado() throws SQLException;
    public Vector obtenerModeloListaDocumentoEstado() throws SQLException;
    public Vector obtenerListaDocumentoEstado(String nombre) throws SQLException;
    public Vector buscarDocumentoEstado(int codigo) throws SQLException;
}
