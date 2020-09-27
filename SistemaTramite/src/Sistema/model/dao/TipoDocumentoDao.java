package Sistema.model.dao;

import java.sql.SQLException;
import java.util.Vector;

public interface TipoDocumentoDao extends GeneralDao {

    public Vector obtenerListaTipoDocumento() throws SQLException;
    public Vector obtenerModeloListaTipoDocumento() throws SQLException;
    public Vector obtenerListaTipoDocumento(String nombre) throws SQLException;
    public Vector buscarTipoDocumento(int codigo) throws SQLException;
}
