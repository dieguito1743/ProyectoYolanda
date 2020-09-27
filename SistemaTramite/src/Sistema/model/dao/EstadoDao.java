package Sistema.model.dao;

import java.sql.SQLException;
import java.util.Vector;

public interface EstadoDao {
    public Vector obtenerListaEstado() throws SQLException;
//    public Vector obtenerListaComboClientes() throws SQLException;
    public Vector obtenerListaEstado(String nombre)throws SQLException;
    public Vector buscarEstado(int codigo)throws SQLException;
}
