package Sistema.model.dao;

import Sistema.model.bean.Archivo;
import Sistema.model.bean.Remitente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class ArchivoDaoImp {

    private PreparedStatement pst;
    private Statement st;
    private Connection con;
    private Archivo oArchivo;

    public ArchivoDaoImp(Connection con) {
        this.con = con;
    }

    public Vector obtenerListaArchivo() throws SQLException {
        Vector listaArchivo = new Vector();
        String sql = "SELECT idArchivo,Archivo,idDocumento FROM dbo.Archivo";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oArchivo = new Vector();
            oArchivo.add(rs.getInt(1));
            oArchivo.add(rs.getString(2));
            oArchivo.add(rs.getInt(3));
            listaArchivo.add(oArchivo);
        }
        return listaArchivo;

    }

    public Vector obtenerListaArchivoBuscar(String texto) throws SQLException {
        Vector listaArchivo = new Vector();
        String sql = "SELECT idArchivo,,Archivo,idDocumento FROM dbo.Empleado WHERE Archivo LIKE '%" + texto + "%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oArchivo = new Vector();
            oArchivo.add(rs.getInt(1));
            oArchivo.add(rs.getString(2));
            oArchivo.add(rs.getInt(3));
            listaArchivo.add(oArchivo);
        }
        return listaArchivo;
    }

    public Vector buscarArchivo(int codigo) throws SQLException {
        Vector listaArchivo = new Vector();
        String sql = "Select idArchivo,Archivo,idDocumento"
                + " from archivo where idArchivo = " + codigo;
        pst = con.prepareStatement(sql);
        pst.setInt(1, codigo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Vector oArchivo = new Vector();
            oArchivo.add(rs.getInt(1));
            oArchivo.add(rs.getString(2));
            oArchivo.add(rs.getInt(3));
            listaArchivo.add(oArchivo);

        }
        pst.close();
        rs.close();
        return listaArchivo;
    }

    public boolean grabar(Object object) throws SQLException {
        oArchivo = (Archivo) object;
        try {
            String sql = "insert into Archivo(Archivo,idDocumento) "
                    + "values(?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, oArchivo.getArchivo());
            pst.setInt(2, oArchivo.getIdDocumento());
            pst.execute();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean eliminar(Object object) throws SQLException {
        oArchivo = (Archivo) object;
        try {
            String sql = "UPDATE archivo SET estado=1 where idArhcivo = " + oArchivo.getIdArchivo();
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean modificar(Object object) throws SQLException {
        oArchivo = (Archivo) object;
        int codigo = oArchivo.getIdArchivo();
        try {
            String sql = "UPDATE Archivo SET Archivo=?,idDocumento=?WHERE idArchivo = ? ";
            pst = con.prepareStatement(sql);
            pst.setString(1, oArchivo.getArchivo());
            pst.setInt(2, oArchivo.getIdDocumento());
            pst.setInt(3, oArchivo.getIdArchivo());
            pst.executeUpdate();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

     }