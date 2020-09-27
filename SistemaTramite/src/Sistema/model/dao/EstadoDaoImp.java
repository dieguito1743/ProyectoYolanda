package Sistema.model.dao;

import Sistema.model.bean.Estado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class EstadoDaoImp {

    private PreparedStatement pst;
    private Statement st;
    private Connection con;
    private Estado oEstado;

    public EstadoDaoImp(Connection con) {
        this.con = con;
    }

    public Vector obtenerListaEstado() throws SQLException {
        Vector listaEstado = new Vector();

        String sql = "SELECT idEstado ,Estado ,Ubicacion FROM Estados";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector Estado = new Vector();
            Estado.add(rs.getInt(1));
            Estado.add(rs.getString(2));
            Estado.add(rs.getString(3));
        }
        return listaEstado;
    }

    public Vector obtenerListaEstadoBuscar(String texto) throws SQLException {
        Vector listaEstado = new Vector();
        String sql = "select idEstado, Estado, Ubicacion FROM Estado WHERE Estado LIKE '%" + texto + "%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector Estado = new Vector();
            Estado.add(rs.getInt(1));
            Estado.add(rs.getString(2));
            Estado.add(rs.getString(3));
            listaEstado.add(Estado);
        }
        return listaEstado;
    }

    public Vector buscarEstado(int codigo) throws SQLException {
        Vector listaEstado = new Vector();
        String sql = "Select idEstado,Estado, Ubicacion from Estados where IdEstado = " + codigo;
        pst = con.prepareStatement(sql);
        pst.setInt(0, codigo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Vector Estado = new Vector();
            Estado.add(rs.getInt(1));
            Estado.add(rs.getString(2));
            Estado.add(rs.getString(3));
        }
        pst.close();
        rs.close();
        return listaEstado;
    }

    public boolean grabar(Object object) throws SQLException {
//        oEstado = (Estado) object;
//        try {
//            String sql = "insert into correlativos(idCorrelativo,idDocumento,correlativo,anio,estado) "
//                    + "values(NULL,?,?,?,?,?,?)";
//            pst = con.prepareStatement(sql);
//            pst.setInt(1, oEstado.getIdCorrelativo());
//            pst.setInt(2, oEstado.getIdDocumento());
//            pst.setString(3, oEstado.getCorrelativo());
//            pst.setInt(4, oEstado.getAnio());
//            pst.setInt(5, oEstado.getEstado());
//            pst.execute();
//            pst.close();
        return true;
//        } catch (SQLException e) {
//            throw e;
//        }
    }

    public boolean eliminar(Object object) throws SQLException {
//        oEstado = (Estado) object;
//        try {
//            String sql = "Delete from Estado where idCorrelativo = " + oEstado.getIdCorrelativo();
//            st = con.createStatement();
//            st.executeUpdate(sql);
//            st.close();
        return true;
//        } catch (SQLException e) {
//            throw e;
//        }
    }

    public boolean modificar(Object object) throws SQLException {
//        oEstado = (Estado) object;
//        try {
//            String sql = "UPDATE cliente SET idDocumento=?,correlativo=?,anio=?,estado=? WHERE idCorrelativo = ? ";
//            pst = con.prepareStatement(sql);
//            pst.setInt(1, oEstado.getIdDocumento());
//            pst.setString(2, oEstado.getCorrelativo());
//            pst.setInt(3, oEstado.getAnio());
//            pst.setInt(4, oEstado.getEstado());
//            pst.setInt(5, oEstado.getIdCorrelativo());
//            pst.executeUpdate();
//            pst.close();
        return true;
//        } catch (SQLException e) {
//            throw e;
//        }
    }

    public Vector obtenerListaComboEstado() throws SQLException {
        Vector listaEstado = new Vector();
//        String sql = "select select idCorrelativo,idDocumento,correlativo,anio,estado from correlativo order by correlativo";
//        st = con.createStatement();
//        ResultSet rs = st.executeQuery(sql);
//        while (rs.next()) {
//            Estado correlativos = new Estado();
//            correlativos.setIdCorrelativo(rs.getInt(1));
//            correlativos.setIdDocumento(rs.getInt(2));
//            correlativos.setCorrelativo(rs.getString(3));
//            correlativos.setAnio(rs.getInt(4));
//            correlativos.setEstado(rs.getInt(5));
//          
//            listaEstado.add(correlativos);
//        }
        return listaEstado;
    }
}
