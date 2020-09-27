package Sistema.model.dao;

import Sistema.model.bean.DocumentoEstado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

public class DocumentoEstadoDaoImp implements DocumentoEstadoDao {

    private PreparedStatement pst;
    private Statement st;
    private Connection con;
    private DocumentoEstado oDocumentoEstado;

    public DocumentoEstadoDaoImp(Connection con) {
        this.con = con;
    }

    public Vector obtenerListaDocumentoEstado() throws SQLException {
        Vector listaDocumentoEstado = new Vector();
        String sql = "select idDocumentoEstado,DocumentoEstado, Activo"
                + " from DocumentoEstado";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector documentoEstado = new Vector();
            documentoEstado.add(rs.getInt(1));
            documentoEstado.add(rs.getString(2));
            documentoEstado.add(rs.getInt(3));
            listaDocumentoEstado.add(documentoEstado);
        }
        return listaDocumentoEstado;
    }

    public Vector obtenerListaDocumentoEstadoBuscar(String texto) throws SQLException {
        Vector listaDocumentoEstado = new Vector();
        String sql = "e.idEstadoDocumento, e.estadoDocumento, e.Activo from DocumentoEstado e WHERE e.estadoDocumento LIKE '%" + texto + "%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector documentoEstado = new Vector();
            documentoEstado.add(rs.getInt(1));
            documentoEstado.add(rs.getString(2));
            documentoEstado.add(rs.getInt(3));
            listaDocumentoEstado.add(documentoEstado);
        }
        return listaDocumentoEstado;
    }

    public Vector obtenerModeloListaDocumentoEstado() throws SQLException {
        Vector listaEstadoDocumento = new Vector();
        String sql = "Select e.idEstadoDocumento, e.estadoDocumento, e.Activo from DocumentoEstado e";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            DocumentoEstado documentoEstado = new DocumentoEstado();
            documentoEstado.setIdEstadoDocumento(rs.getInt(1));
            documentoEstado.setEstadoDocumento(rs.getString(2));
            documentoEstado.setactivo(rs.getInt(3));
            listaEstadoDocumento.add(documentoEstado);
        }
        return listaEstadoDocumento;
    }

    public Vector buscarTipoDocumento(int codigo) throws SQLException {
        Vector listaDocumentoEstado = new Vector();
        String sql = "e.idEstadoDocumento, e.estadoDocumento, e.Activo"
                + " from DocumentoEstado e where e.idEstadoDocumento= " + codigo;
        pst = con.prepareStatement(sql);
        pst.setInt(0, codigo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Vector documentoEstado = new Vector();
            documentoEstado.add(rs.getInt(1));
            documentoEstado.add(rs.getString(2));
            documentoEstado.add(rs.getInt(3));
            listaDocumentoEstado.add(documentoEstado);
        }
        pst.close();
        rs.close();
        return listaDocumentoEstado;
    }

    public boolean grabar(Object object) throws SQLException {
        oDocumentoEstado = (DocumentoEstado) object;
        try {
            String sql = "insert into DocumentoEstado(idEstadoDocumento,estadoDocumento, Activo) "
                    + "values(NULL,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, oDocumentoEstado.getIdEstadoDocumento());
            pst.setString(2, oDocumentoEstado.getEstadoDocumento());
            pst.setInt(3, oDocumentoEstado.getactivo());
            pst.execute();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean eliminar(Object object) throws SQLException {
        oDocumentoEstado = (DocumentoEstado) object;
        try {
            String sql = "Delete from DocumentoEstado where idEstadoDocumento = " + oDocumentoEstado.getIdEstadoDocumento();
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean modificar(Object object) throws SQLException {
        oDocumentoEstado = (DocumentoEstado) object;
        try {
            String sql = "UPDATE DocumentoEstado SET estadoDocumento=?, Activo=? WHERE idEstadoDocumento= ? ";
            pst = con.prepareStatement(sql);
            pst.setString(1, oDocumentoEstado.getEstadoDocumento());
            pst.setInt(2, oDocumentoEstado.getactivo());
            pst.setInt(3, oDocumentoEstado.getIdEstadoDocumento());
            pst.executeUpdate();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public Vector obtenerDocumentoEstado() throws SQLException {
        Vector listaDocumentoEstado = new Vector();
        String sql = "select select idEstadoDocumento,estadoDocumento, Activo order by estadoDocumento";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            oDocumentoEstado = new DocumentoEstado();
            oDocumentoEstado.setIdEstadoDocumento(rs.getInt(1));
            oDocumentoEstado.setEstadoDocumento(rs.getString(2));
            oDocumentoEstado.setactivo(rs.getInt(3));
            listaDocumentoEstado.add(oDocumentoEstado);
        }
        return listaDocumentoEstado;
    }

    @Override
    public Vector obtenerListaDocumentoEstado(String nombre) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector buscarDocumentoEstado(int codigo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
