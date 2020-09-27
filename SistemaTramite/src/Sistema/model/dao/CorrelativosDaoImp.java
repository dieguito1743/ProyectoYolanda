package Sistema.model.dao;

import Sistema.model.bean.Correlativos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

public class CorrelativosDaoImp {

    private PreparedStatement pst;
    private Statement st;
    private Connection con;
    private Correlativos oCorrelativos;

    public CorrelativosDaoImp(Connection con) {
        this.con = con;
    }

    public Vector obtenerListaCorrelativos() throws SQLException {
        Vector listaCorrelativos = new Vector();
        String sql = "select idCorrelativo,idDocumento,correlativo,anio,estado"
                + " from correlativos";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector Correlativos = new Vector();
            Correlativos.add(rs.getInt(1));
            Correlativos.add(rs.getInt(2));
            Correlativos.add(rs.getString(3));
            Correlativos.add(rs.getInt(4));
            Correlativos.add(rs.getInt(5));
            listaCorrelativos.add(Correlativos);
        }
        return listaCorrelativos;
    }

    public Vector obtenerListaCorrelativosBuscar(String texto) throws SQLException {
        Vector listaCorrelativos = new Vector();
        String sql = "select idCorrelativo,idDocumento,correlativo,anio,estado FROM dbo.Correlativos WHERE idCorrelativo LIKE '%" + texto + "%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector Correlativos = new Vector();
            Correlativos.add(rs.getInt(1));
            Correlativos.add(rs.getInt(2));
            Correlativos.add(rs.getString(3));
            Correlativos.add(rs.getInt(4));
            Correlativos.add(rs.getInt(5));
            listaCorrelativos.add(Correlativos);
        }
        return listaCorrelativos;
    }
//Select Right('000000'+cast(cast(correlativo as int)+1 as varchar(6)),6) From Correlativos Where idDocumento = 11

    public Vector buscarCorrelativos(int codigo) throws SQLException {
        Vector listaCorrelativos = new Vector();
        String sql = "Select idCorrelativo, idDocumento, correlativo, anio, estado from correlativos where idDocumento = " + codigo;
        pst = con.prepareStatement(sql);
        pst.setInt(1, codigo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Vector Correlativos = new Vector();
            Correlativos.add(rs.getInt(1));
            Correlativos.add(rs.getInt(2));
            Correlativos.add(rs.getString(3));
            Correlativos.add(rs.getInt(4));
            Correlativos.add(rs.getInt(5));
            listaCorrelativos.add(Correlativos);
        }
        pst.close();
        rs.close();
        return listaCorrelativos;
    }

    public Vector obtenerSiguienteCorrelativoCargo(int idDocumento) throws SQLException {
        Vector listaCorrelativos = new Vector();
        String sql = "Select Right('1','1','Cargo','1',000000'+cast(cast(max(correlativo) as int)+1 as varchar(6)),6) From Correlativos Where idDocumento = " + idDocumento;
        pst = con.prepareStatement(sql);
        pst.setInt(0, idDocumento);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Vector Correlativos = new Vector();
            Correlativos.add(rs.getInt(1));
            Correlativos.add(rs.getInt(2));
            Correlativos.add(rs.getString(3));
            Correlativos.add(rs.getInt(4));
            Correlativos.add(rs.getInt(5));
            listaCorrelativos.add(Correlativos);
        }
        pst.close();
        rs.close();
        return listaCorrelativos;
    }

    public boolean grabar(Object object) throws SQLException {
        oCorrelativos = (Correlativos) object;
        try {
            String sql = "insert into correlativos(idCorrelativo,idDocumento,correlativo,anio,estado) "
                    + "values(NULL,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, oCorrelativos.getIdCorrelativo());
            pst.setInt(2, oCorrelativos.getIdDocumento());
            pst.setString(3, oCorrelativos.getCorrelativo());
            pst.setInt(4, oCorrelativos.getAnio());
            pst.setInt(5, oCorrelativos.getEstado());
            pst.execute();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean eliminar(Object object) throws SQLException {
        oCorrelativos = (Correlativos) object;
        try {
            String sql = "Delete from Correlativos where idCorrelativo = " + oCorrelativos.getIdCorrelativo();
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean modificar(Object object) throws SQLException {
        oCorrelativos = (Correlativos) object;
        try {
            String sql = "UPDATE cliente SET idDocumento=?,correlativo=?,anio=?,estado=? WHERE idCorrelativo = ? ";
            pst = con.prepareStatement(sql);
            pst.setInt(1, oCorrelativos.getIdDocumento());
            pst.setString(2, oCorrelativos.getCorrelativo());
            pst.setInt(3, oCorrelativos.getAnio());
            pst.setInt(4, oCorrelativos.getEstado());
            pst.setInt(5, oCorrelativos.getIdCorrelativo());
            pst.executeUpdate();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public String obtenerCorrelativosPorIdTipoDocumento(int idTipoDoc) throws SQLException {
        String lsSecuencia = "";
        String sql = "Select isnull(RIGHT('000000'+cast(Cast(max(d.numeroDocumento) as int) + 1 as varchar(6)),6),'000001') as secuencia From documento d Where d.idtipoDocumento = ? ";
        pst = con.prepareStatement(sql);
        pst.setInt(1, idTipoDoc);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            lsSecuencia = rs.getString("secuencia");
        }
        return lsSecuencia;
    }

    public String obtenerIdSiguienteDocumento() throws SQLException {
        String liIdSiguiente="";
        String sql = "select IDENT_CURRENT('Documento')+1 liDiDoc";
        pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            liIdSiguiente = rs.getString("liDiDoc");
            System.out.println("liIdSiguiente : " + liIdSiguiente);
        }
        return liIdSiguiente;
    }
    
    public String obtenerIdSiguienteCargo() throws SQLException {
        String lsCargoSiguiente="";
        String sql = "Select Right('000000'+Cast(Cast(Max(c.numeroCargo) as int) + 1 as varchar(6)),6) UltimoNumero  From Cargo c";
        pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            lsCargoSiguiente = rs.getString("UltimoNumero");
        }
        return lsCargoSiguiente;
    }
    
    public String obtenerIdSiguienteRecepcion() throws SQLException {
        String lsRecepcionSiguiente="";
        String sql = "Select Right('000000'+Cast(Cast(Max(r.codigoRecepcion) as int) + 1 as varchar(6)),6) UltimoNumero  From Recepcion r";
        pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            lsRecepcionSiguiente = rs.getString("UltimoNumero");
        }
        return lsRecepcionSiguiente;
    }
}
