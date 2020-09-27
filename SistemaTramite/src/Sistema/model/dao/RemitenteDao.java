package Sistema.model.dao;

import Sistema.model.bean.Remitente;
import java.sql.SQLException;
import java.util.Vector;
public interface RemitenteDao {

    public Vector obtenerListaRemitente() throws SQLException;
//    public Vector obtenerListaComboClientes() throws SQLException;
    public Vector obtenerListaRemitente(String nombre) throws SQLException;
     public Vector buscarRemitente(int codigo) throws SQLException;

    public void grabar(Remitente oRemitente);

}
