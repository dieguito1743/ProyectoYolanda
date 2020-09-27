package Sistema.model.dao;

import Sistema.model.bean.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class TipoDocumentoDaoImp implements TipoDocumentoDao {

    private PreparedStatement pst;
    private Statement st;
    private Connection con;
    private TipoDocumento oTipoDocumento;

    public TipoDocumentoDaoImp(Connection con) {
        this.con = con;
    }

    public Vector obtenerListaTipoDocumento() throws SQLException {
        Vector listaTipoDocumento = new Vector();
        String sql = "select idTipoDocumento,tipoDocumento, estado"
                + " from TipoDocumento";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector TipoDocumento = new Vector();
            TipoDocumento.add(rs.getInt(1));
            TipoDocumento.add(rs.getString(2));
            TipoDocumento.add(rs.getInt(3));
            listaTipoDocumento.add(TipoDocumento);
        }
        return listaTipoDocumento;
    }

    public Vector obtenerListaTipoDocumentoBuscar(String texto) throws SQLException {
        Vector listaTipoDocumento = new Vector();
        String sql = "select idTipoDocumento,tipoDocumento, estado from TipoDocumento WHERE TipoDocumento LIKE '%" + texto + "%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector TipoDocumento = new Vector();
            TipoDocumento.add(rs.getInt(1));
            TipoDocumento.add(rs.getString(2));
            TipoDocumento.add(rs.getInt(3));
            listaTipoDocumento.add(TipoDocumento);
        }
        return listaTipoDocumento;
    }

    public Vector obtenerModeloListaTipoDocumento() throws SQLException {
        Vector listaTipoDocumento = new Vector();
        String sql = "select t.idTipoDocumento, t.tipoDocumento, t.estado FROM TipoDocumento t Where t.estado = 0";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            TipoDocumento tipoDocumento = new TipoDocumento();
            tipoDocumento.setIdTipoDocumento(rs.getInt(1));
            tipoDocumento.setTipoDocumento(rs.getString(2));
            tipoDocumento.setEstado(rs.getInt(3));
            listaTipoDocumento.add(tipoDocumento);
        }
        return listaTipoDocumento;
    }

    public Vector buscarTipoDocumento(int codigo) throws SQLException {
        Vector listaTipoDocumento = new Vector();
        String sql = "Select idTipoDocumento,tipoDocumento, estado"
                + " from TipoDocumento where idTipoDocumento= " + codigo;
        pst = con.prepareStatement(sql);
        pst.setInt(0, codigo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Vector TipoDocumento = new Vector();
            TipoDocumento.add(rs.getInt(1));
            TipoDocumento.add(rs.getString(2));
            TipoDocumento.add(rs.getInt(3));
            listaTipoDocumento.add(TipoDocumento);
        }
        pst.close();
        rs.close();
        return listaTipoDocumento;
    }

    public boolean grabar(Object object) throws SQLException {
        oTipoDocumento = (TipoDocumento) object;
        try {
            String sql = "insert into TipoDocumento(idTipoDocumento,Descripcion, estado) "
                    + "values(NULL,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, oTipoDocumento.getIdTipoDocumento());
            pst.setString(2, oTipoDocumento.getTipoDocumento());
            pst.setInt(3, oTipoDocumento.getEstado());
            pst.execute();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean eliminar(Object object) throws SQLException {
        oTipoDocumento = (TipoDocumento) object;
        try {
            String sql = "Delete from TipoDocumento where idTipoDocumento = " + oTipoDocumento.getIdTipoDocumento();
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean modificar(Object object) throws SQLException {
        oTipoDocumento = (TipoDocumento) object;
        try {
            String sql = "UPDATE cliente SET Descripcion=?, estado=? WHERE idTipoDocumento= ? ";
            pst = con.prepareStatement(sql);
            pst.setString(1, oTipoDocumento.getTipoDocumento());
            pst.setInt(2, oTipoDocumento.getEstado());
            pst.setInt(3, oTipoDocumento.getIdTipoDocumento());
            pst.executeUpdate();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public Vector obtenerTipoDocumento() throws SQLException {
        Vector listaTipoDocumento = new Vector();
        String sql = "select select idTipoDocumento,Descripcion, estado order by TipoDocumento";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            oTipoDocumento = new TipoDocumento();
            oTipoDocumento.setIdTipoDocumento(rs.getInt(1));
            oTipoDocumento.setTipoDocumento(rs.getString(2));
            oTipoDocumento.setEstado(rs.getInt(3));
            listaTipoDocumento.add(oTipoDocumento);
        }
        return listaTipoDocumento;
    }

    @Override
    public Vector obtenerListaTipoDocumento(String nombre) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
