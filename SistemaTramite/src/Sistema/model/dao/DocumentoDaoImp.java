package Sistema.model.dao;

import Sistema.model.bean.Documento;
import Sistema.model.bean.Recepcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

public class DocumentoDaoImp {

    private PreparedStatement pst;
    private Statement st;
    private Connection con;
    private Documento oDocumento;

    public DocumentoDaoImp(Connection con) {
        this.con = con;
    }

    public Vector obtenerListaDocumento() throws SQLException {
        Vector listaDocumento = new Vector();
        String sql = "SELECT idDocumento,idtipoDocumento,numeroDocumento,Fecha,anio,Documento,folios,asunto,Institucion,Area,Estado FROM dbo.Documento";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oDocumento = new Vector();
            oDocumento.add(rs.getInt(1));
            oDocumento.add(rs.getInt(2));
            oDocumento.add(rs.getString(3));
            oDocumento.add(rs.getString(4));
            oDocumento.add(rs.getString(5));
            oDocumento.add(rs.getString(6));
            oDocumento.add(rs.getInt(7));
            oDocumento.add(rs.getString(8));
            oDocumento.add(rs.getString(9));
            oDocumento.add(rs.getString(10));
            oDocumento.add(rs.getInt(11));
            listaDocumento.add(oDocumento);
        }
        return listaDocumento;
    }

    public Vector obtenerListaDocumentoBuscar(String texto) throws SQLException {
        Vector listaDocumento = new Vector();
        String sql = "SELECT idDocumento,idTipoDocumento,numeroDocumento,Fecha,anio,Documento,"
                + "folios,asunto,area,Institucion,estado FROM dbo.Documento WHERE idDocumento LIKE '%" + texto + "%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
//            Vector oRecepcion = new Vector();
            Vector oDocumento = new Vector();
            oDocumento.add(rs.getInt(1));
            oDocumento.add(rs.getInt(2));
            oDocumento.add(rs.getString(3));
            oDocumento.add(rs.getString(4));
            oDocumento.add(rs.getInt(5));
            oDocumento.add(rs.getString(6));
            oDocumento.add(rs.getInt(7));
            oDocumento.add(rs.getString(8));
            oDocumento.add(rs.getString(9));
            oDocumento.add(rs.getString(10));
            oDocumento.add(rs.getInt(11));
            listaDocumento.add(oDocumento);
        }
        return listaDocumento;
    }

    public Vector buscarDocumento(int codigo) throws SQLException {
        Vector listaDocumento = new Vector();
        String sql = "SELECT idDocumento,idtipoDocumento,numeroDocumento,Destinatario,Fecha,anio,Documento,folios,asunto,Institucion,Area,Archivo,Estado"
                + " from Documento where idDocumento = " + codigo;
        pst = con.prepareStatement(sql);
        pst.setInt(1, codigo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Vector oDocumento = new Vector();
            oDocumento.add(rs.getInt(1));
            oDocumento.add(rs.getInt(2));
            oDocumento.add(rs.getString(3));
            oDocumento.add(rs.getString(4));
            oDocumento.add(rs.getString(5));
            oDocumento.add(rs.getString(6));
            oDocumento.add(rs.getInt(7));
            oDocumento.add(rs.getString(8));
            oDocumento.add(rs.getString(9));
            oDocumento.add(rs.getString(10));
            oDocumento.add(rs.getString(11));
            oDocumento.add(rs.getInt(12));
            listaDocumento.add(oDocumento);
        }
        return listaDocumento;
    }

    public boolean grabar(Object object) throws SQLException {
        oDocumento = (Documento) object;
        try {
            String sql = "insert into Documento(idtipoDocumento,numeroDocumento,Fecha,anio,Documento,folios,asunto,Institucion,Area,Estado) "
                    + "values(?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, oDocumento.getIdtipoDocumento());
            pst.setString(2, oDocumento.getNumeroDocumento());
            pst.setString(3, oDocumento.getFecha());
            pst.setString(4, oDocumento.getAnio());
            pst.setString(5, oDocumento.getDocumento());
            pst.setInt(6, oDocumento.getFolios());
            pst.setString(7, oDocumento.getAsunto());
            pst.setString(8, oDocumento.getArea());
            pst.setString(9, oDocumento.getInstitucion());
            pst.setInt(10, oDocumento.getEstado());
            pst.execute();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean eliminar(Object object) throws SQLException {
        oDocumento = (Documento) object;
        try {
            String sql = "Delete from Documento where iddocumento = " + oDocumento.getIdDocumento();

            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean modificar(Object object) throws SQLException {
        oDocumento = (Documento) object;
        int codigo = oDocumento.getIdDocumento();
        try {
            String sql = "UPDATE Documento SET idTipoDocumento=?,NumeroDocumento=? WHERE idDocumento=? ";
            pst = con.prepareStatement(sql);
            pst.setInt(1, oDocumento.getIdtipoDocumento());
            pst.setString(2, oDocumento.getNumeroDocumento());
            pst.setString(3, oDocumento.getFecha());
            pst.setString(4, oDocumento.getAnio());
            pst.setString(5, oDocumento.getDocumento());
            pst.setInt(6, oDocumento.getFolios());
            pst.setString(7, oDocumento.getAsunto());
            pst.setString(8, oDocumento.getArea());
            pst.setString(9, oDocumento.getInstitucion());
            pst.setInt(10, oDocumento.getEstado());
            pst.setInt(11, oDocumento.getIdDocumento());

            pst.executeUpdate();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public Vector obtenerlistaDocumento() throws SQLException {
        Vector listaDocumento = new Vector();
        String sql = "select selectidDocumento,idtipoDocumento,numeroDocumento,Fecha,anio,Documento,folios,asunto,Institucion,Area,Estado from documento order by Documento";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Documento documento = new Documento();
            documento.setIdDocumento(rs.getInt(1));
            documento.setIdtipoDocumento(rs.getInt(2));
            documento.setNumeroDocumento(rs.getString(3));
            documento.setFecha(rs.getString(4));
            documento.setAnio(rs.getString(5));
            documento.setDocumento(rs.getString(6));
            documento.setFolios(rs.getInt(7));
            documento.setAsunto(rs.getString(8));
            documento.setArea(rs.getString(9));
            documento.setInstitucion(rs.getString(10));
            documento.setEstado(rs.getInt(11));
            listaDocumento.add(documento);
        }

        return listaDocumento;
    }

}
