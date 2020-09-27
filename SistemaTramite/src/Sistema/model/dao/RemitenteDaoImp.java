package Sistema.model.dao;

import Sistema.model.bean.Remitente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

public class RemitenteDaoImp {

    private PreparedStatement pst;
    private Statement st;
    private Connection con;
    private Remitente oRemitente;

    public RemitenteDaoImp(Connection con) {
        this.con = con;
    }

    public Vector obtenerListaRemitente() throws SQLException {
        Vector listaRemitente = new Vector();
        String sql = "SELECT idRemitente,DNI,Remitente,Direccion,Telefono,Email FROM dbo.Remitente";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oRemitente = new Vector();
            oRemitente.add(rs.getInt(1));
            oRemitente.add(rs.getString(2));
            oRemitente.add(rs.getString(3));
            oRemitente.add(rs.getString(4));
            oRemitente.add(rs.getString(5));
            oRemitente.add(rs.getString(6));
            listaRemitente.add(oRemitente);
        }
        return listaRemitente;

    }

    public Vector obtenerListaRemitenteBuscar(String texto) throws SQLException {
        Vector listaRemitente = new Vector();
        String sql = "SELECT idRemitente,DNI,Remitente,Direccion,Telefono,Email from Remitente WHERE Remitente LIKE '%" + texto + "%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oRemitente = new Vector();
            oRemitente.add(rs.getInt(1));
            oRemitente.add(rs.getString(2));
            oRemitente.add(rs.getString(3));
            oRemitente.add(rs.getString(4));
            oRemitente.add(rs.getString(5));
            oRemitente.add(rs.getString(6));
            listaRemitente.add(oRemitente);
        }
        return listaRemitente;
    }

    public Vector obtenerListaRemitenteBuscarDNI(String dni) throws SQLException {
        Vector listaRemitente = new Vector();
        String sql = "SELECT idRemitente,DNI,Remitente,Direccion,Telefono,Email from Remitente WHERE DNI ='" + dni+"'";
        JOptionPane.showMessageDialog(null, sql);
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oRemitente = new Vector();
            oRemitente.add(rs.getInt(1));
            oRemitente.add(rs.getString(2));
            oRemitente.add(rs.getString(3));
            oRemitente.add(rs.getString(4));
            oRemitente.add(rs.getString(5));
            oRemitente.add(rs.getString(6));
            listaRemitente.add(oRemitente);
        }
        return listaRemitente;
    }

    public Vector buscarRemitente(int codigo) throws SQLException {
        Vector listaRemitente = new Vector();
        String sql = "SELECT idRemitente,DNI,Remitente,Direccion,Telefono,Email"
                + " from Remitente where idRemitente = " + codigo;
        pst = con.prepareStatement(sql);
        pst.setInt(1, codigo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Vector oRemitente = new Vector();
            oRemitente.add(rs.getInt(1));
            oRemitente.add(rs.getString(2));
            oRemitente.add(rs.getString(3));
            oRemitente.add(rs.getString(4));
            oRemitente.add(rs.getString(5));
            oRemitente.add(rs.getString(6));
            listaRemitente.add(oRemitente);
        }
        pst.close();
        rs.close();

        return listaRemitente;

    }

    public boolean grabar(Object object) throws SQLException {
        oRemitente = (Remitente) object;
        try {
            String sql = "insert into Remitente (DNI,Remitente,Direccion,Telefono,Email) "
                    + "values(?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, oRemitente.getDNI());
            pst.setString(2, oRemitente.getRemitente());
            pst.setString(3, oRemitente.getDireccion());
            pst.setString(4, oRemitente.getTelefono());
            pst.setString(5, oRemitente.getEmail());
            pst.execute();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean eliminar(Object object) throws SQLException {
        oRemitente = (Remitente) object;
        try {
            String sql = "Delete from Remitente where idremitente = " + oRemitente.getIdRemitente();
//            remitente SET remitente=1 where idRemitente
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean modificar(Object object) throws SQLException {
        oRemitente = (Remitente) object;
        int codigo = oRemitente.getIdRemitente();
        try {
            String sql = "UPDATE Remitente SET DNI=?,Remitente=?,Direccion=?,Telefono=?,Email=? WHERE idRemitente = ? ";
            pst = con.prepareStatement(sql);
            pst.setString(1, oRemitente.getDNI());
            pst.setString(2, oRemitente.getRemitente());
            pst.setString(3, oRemitente.getDireccion());
            pst.setString(4, oRemitente.getTelefono());
            pst.setString(5, oRemitente.getEmail());
            pst.setInt(6, oRemitente.getIdRemitente());
            pst.executeUpdate();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public Vector obtenerListasRemitente() throws SQLException {
        Vector listaRemitente = new Vector();
        String sql = "select selectidRemitente,DNI,Remitente,Direccion,Telefono,Email from remitente order by Remitente";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            oRemitente = new Remitente();
            oRemitente.setIdRemitente(rs.getInt(1));
            oRemitente.setDNI(rs.getString(2));
            oRemitente.setRemitente(rs.getString(3));
            oRemitente.setDireccion(rs.getString(4));
            oRemitente.setTelefono(rs.getString(5));
            oRemitente.setEmail(rs.getString(6));
            listaRemitente.add(oRemitente);
        }
        return listaRemitente;
    }

}
