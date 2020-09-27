package Sistema.model.dao;

import Sistema.model.bean.Cargo;
import Sistema.model.bean.Documento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

public class CargoDaoImp {

    private PreparedStatement pst;
    private Statement st;
    private Connection con;
    private Cargo oCargo;

    public CargoDaoImp(Connection con) {
        this.con = con;
    }

    public Vector obtenerListaCargo() throws SQLException {
        Vector listaCargo = new Vector();
        String sql = "SELECT idCargo,idDocumento,Fecha,Hora,Area,Recepcionista FROM dbo.Cargo";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oCargo = new Vector();
            oCargo.add(rs.getInt(1));
            oCargo.add(rs.getInt(2));
            oCargo.add(rs.getString(3));
            oCargo.add(rs.getString(4));
            oCargo.add(rs.getString(5));
            oCargo.add(rs.getString(6));
            listaCargo.add(oCargo);
        }
        return listaCargo;

    }

    public Vector obtenerListaCargoBuscar(String texto) throws SQLException {
        Vector listaCargo = new Vector();
        String sql = "SELECT idCargo,idDocumento,Fecha,Hora,Area,Recepcionista  WHERE Cargo LIKE '%" + texto + "%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oCargo = new Vector();
            oCargo.add(rs.getInt(1));
            oCargo.add(rs.getInt(2));
            oCargo.add(rs.getString(3));
            oCargo.add(rs.getString(4));
            oCargo.add(rs.getString(5));
            oCargo.add(rs.getString(6));
            listaCargo.add(oCargo);
        }
        return listaCargo;
    }

    public Vector buscarCargo(int codigo) throws SQLException {
        Vector listaCargo = new Vector();
        String sql = "SELECT idCargo,idDocumento,Fecha,Hora,Area,Recepcionista"
                + " from Cargo where idCargo = " + codigo;
        pst = con.prepareStatement(sql);
        pst.setInt(1, codigo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Vector oCargo = new Vector();
            oCargo.add(rs.getInt(1));
            oCargo.add(rs.getString(2));
            oCargo.add(rs.getString(3));
            oCargo.add(rs.getString(4));
            oCargo.add(rs.getString(5));
            listaCargo.add(oCargo);
        }
        pst.close();
        rs.close();

        return listaCargo;

    }

    public boolean grabar(Object object) throws SQLException {
        oCargo = (Cargo) object;
        try {
            String sql = "insert into Cargo (idDocumento,Fecha,Hora,Area,Recepcionista,numeroCargo,estadoCargo,usuarioEstadoCargo,obs,UsuarioRegistra, FechaRegistro) "
                    + "values(?,?,?,?,?,?,?,?,?,?,?)";
            JOptionPane.showMessageDialog(null, "idDocumento:" +oCargo.getIdDocumento()+"Fecha:"+oCargo.getFecha()+"Hora:"+oCargo.getHora()+"Area:"+oCargo.getArea()+"Recepcionista:"+oCargo.getRecepcionista()+"numeroCargo:"+oCargo.getNumeroCargo()+"estadoCargo:"+oCargo.getEstadoCargo()+ "usuarioEstadoCargo:"+oCargo.getUsuarioEstadoCargo()+"obs:"+oCargo.getObs()+"UsuarioRegistra:"+oCargo.getUsuarioRegistra()+"FechaRegistro:"+oCargo.getFechaRegistro());
            pst = con.prepareStatement(sql);
            pst.setInt(1, oCargo.getIdDocumento());
            JOptionPane.showMessageDialog(null, "Fecha: " + oCargo.getFecha());
            pst.setString(2, oCargo.getFecha());
            pst.setString(3, oCargo.getHora());
            pst.setString(4, oCargo.getArea());
            pst.setString(5, oCargo.getRecepcionista());
            pst.setString(6, oCargo.getNumeroCargo());    
            pst.setInt(7, oCargo.getEstadoCargo());
            pst.setString(8, oCargo.getUsuarioEstadoCargo());
            pst.setString(9, oCargo.getObs());
            pst.setString(10, oCargo.getUsuarioRegistra());
            pst.setString(11, oCargo.getFechaRegistro());
            pst.execute();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean eliminar(Object object) throws SQLException {
        oCargo = (Cargo) object;
        try {
            String sql = "Delete from Cargo where idcargo = " + oCargo.getIdCargo();
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean validarDocumentoEnCargo(Object object) throws SQLException {
        oCargo = (Cargo) object;
        try {
            String sql = "Select Count(*) From Cargo c Where c.idDocumento = " + oCargo.getIdDocumento();
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean modificar(Object object) throws SQLException {
        oCargo = (Cargo) object;
        int codigo = oCargo.getIdCargo();
        try {
            String sql = "UPDATE Cargo SET idDocumento=?,Fecha=?,Hora=?,Area=?,Recepcionista=? WHERE idCargo = ? ";
            pst = con.prepareStatement(sql);
            pst.setInt(1, oCargo.getIdDocumento());
            pst.setString(2, oCargo.getFecha());
            pst.setString(3, oCargo.getHora());
            pst.setString(4, oCargo.getArea());
            pst.setString(5, oCargo.getRecepcionista());
            pst.setInt(6, oCargo.getIdCargo());
            pst.executeUpdate();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public Vector obtenerListasCargo() throws SQLException {
        Vector listaCargo = new Vector();
        String sql = "select idCargo,idDocumento,Fecha,Hora,Area,Recepcionista from cargo order by Cargo";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            oCargo = new Cargo();
            oCargo.setIdCargo(rs.getInt(1));
            oCargo.setIdDocumento(rs.getInt(2));
            oCargo.setFecha(rs.getString(3));
            oCargo.setHora(rs.getString(4));
            oCargo.setArea(rs.getString(5));
            oCargo.setRecepcionista(rs.getString(6));
            listaCargo.add(oCargo);
        }
        return listaCargo;
    }
//Busqueda para Cargo de documento

    public Vector obtenerListaCagoBuscarIdCargo(int idCargo) throws SQLException {
        Vector listaCargo = new Vector();
        String sql = "Select idCargo, idDocumento, numeroDocumento, Documento, Fecha FechaCargo,  Hora HoraCargo, Area AreaCargo, Asunto, Institucion, Recepcionista, estadoCargo From vCargoDocumento Where idCargo = " + idCargo;
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector ovCargo = new Vector();
            ovCargo.add(rs.getInt(1));
            ovCargo.add(rs.getInt(2));
            ovCargo.add(rs.getString(3));
            ovCargo.add(rs.getString(4));
            ovCargo.add(rs.getString(5));
            ovCargo.add(rs.getString(6));
            ovCargo.add(rs.getString(7));
            ovCargo.add(rs.getString(8));
            ovCargo.add(rs.getString(9));
            ovCargo.add(rs.getString(10));
            ovCargo.add(rs.getInt(11));
            System.out.println(rs.getInt(1));
            System.out.println(rs.getInt(2));
            System.out.println(rs.getInt(3));
            System.out.println(rs.getInt(4));
            System.out.println(rs.getInt(5));
            System.out.println(rs.getInt(6));
            System.out.println(rs.getInt(7));
            System.out.println(rs.getInt(8));
            System.out.println(rs.getInt(9));
            System.out.println(rs.getInt(10));
            System.out.println(rs.getInt(11));
            listaCargo.add(ovCargo);
        }
        return listaCargo;
    }

    public Vector obtenerListaCagoBuscarIdDocumento(int idDocumento) throws SQLException {
        Vector listaCargo = new Vector();
        String sql = "Select idCargo, idDocumento, numeroDocumento, Documento, "
                + "Fecha FechaCargo,  Hora HoraCargo, Area AreaCargo, Asunto, Institucion, Recepcionista, estadoCargo From vCargoDocumento Where idDocumento = " + idDocumento;
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector ovCargo = new Vector();
            ovCargo.add(rs.getInt(1));
            ovCargo.add(rs.getInt(2));
            ovCargo.add(rs.getString(3));
            ovCargo.add(rs.getString(4));
            ovCargo.add(rs.getString(5));
            ovCargo.add(rs.getString(6));
            ovCargo.add(rs.getString(7));
            ovCargo.add(rs.getString(8));
            ovCargo.add(rs.getString(9));
            ovCargo.add(rs.getString(10));
            ovCargo.add(rs.getInt(11));
            listaCargo.add(ovCargo);
        }
        return listaCargo;
    }

    public Vector obtenerListaCagoBuscarDocumento(String documento) throws SQLException {
        Vector listaCargo = new Vector();
        String sql = "Select idCargo, idDocumento, numeroDocumento, Documento, "
                + "Fecha FechaCargo,  Hora HoraCargo, Area AreaCargo, Asunto, Institucion, Recepcionista, estadoCargo From vCargoDocumento Where Documento like '%" + documento + "%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector ovCargo = new Vector();
            ovCargo.add(rs.getInt(1));
            ovCargo.add(rs.getInt(2));
            ovCargo.add(rs.getString(3));
            ovCargo.add(rs.getString(4));
            ovCargo.add(rs.getString(5));
            ovCargo.add(rs.getString(6));
            ovCargo.add(rs.getString(7));
            ovCargo.add(rs.getString(8));
            ovCargo.add(rs.getString(9));
            ovCargo.add(rs.getString(10));
            ovCargo.add(rs.getInt(11));
            listaCargo.add(ovCargo);
        }
        return listaCargo;
    }

    public Vector obtenerListaCagoBuscarDestinatario(String destinatario) throws SQLException {
        Vector listaCargo = new Vector();
        String sql = "Select idCargo, idDocumento, numeroDocumento, Documento, "
                + "Fecha FechaCargo,  Hora HoraCargo, Area AreaCargo, Asunto, Institucion, Recepcionista, estadoCargo From vCargoDocumento Where Destinatario like '%" + destinatario + "%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector ovCargo = new Vector();
            ovCargo.add(rs.getInt(1));
            ovCargo.add(rs.getInt(2));
            ovCargo.add(rs.getString(3));
            ovCargo.add(rs.getString(4));
            ovCargo.add(rs.getString(5));
            ovCargo.add(rs.getString(6));
            ovCargo.add(rs.getString(7));
            ovCargo.add(rs.getString(8));
            ovCargo.add(rs.getString(9));
            ovCargo.add(rs.getString(10));
            ovCargo.add(rs.getInt(11));
            listaCargo.add(ovCargo);
        }
        return listaCargo;
    }
}
