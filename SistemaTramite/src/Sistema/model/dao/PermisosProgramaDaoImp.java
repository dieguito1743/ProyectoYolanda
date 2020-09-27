package Sistema.model.dao;

import Sistema.model.bean.PermisosPrograma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

public class PermisosProgramaDaoImp {

    private PreparedStatement pst;
    private Statement st;
    private Connection con;
    private PermisosPrograma oPermisosPrograma;

    public PermisosProgramaDaoImp(Connection con) {
        this.con = con;
    }

    public Vector obtenerListaPermisosPrograma() throws SQLException {
        Vector listaPermisosPrograma = new Vector();
        String sql = "SELECT idPermisos,idPrograma,Programa,Descripcion,IdUsuario,Username,Registro,Actualiza,Elimina FROM vPermisosPrograma";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oPermisosPrograma = new Vector();
            oPermisosPrograma.add(rs.getInt(1));
            oPermisosPrograma.add(rs.getInt(2));
            oPermisosPrograma.add(rs.getString(3));
            oPermisosPrograma.add(rs.getString(4));
            oPermisosPrograma.add(rs.getInt(5));
            oPermisosPrograma.add(rs.getString(6));
            oPermisosPrograma.add(rs.getInt(7));
            oPermisosPrograma.add(rs.getInt(8));
            oPermisosPrograma.add(rs.getInt(9));
            listaPermisosPrograma.add(oPermisosPrograma);
        }
        return listaPermisosPrograma;
    }

    public Vector obtenerListaPermisosProgramaBuscar(String texto) throws SQLException {
        Vector listaPermisosPrograma = new Vector();
        String sql = "SELECT idPermisos,idPrograma,Programa,Descripcion,IdUsuario,Username,Registro,Actualiza,Elimina "
                + "from vPermisosPrograma WHERE Programa LIKE '%" + texto + "%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oPermisosPrograma = new Vector();
            oPermisosPrograma.add(rs.getInt(1));
            oPermisosPrograma.add(rs.getInt(2));
            oPermisosPrograma.add(rs.getString(3));
            oPermisosPrograma.add(rs.getString(4));
            oPermisosPrograma.add(rs.getInt(5));
            oPermisosPrograma.add(rs.getString(6));
            oPermisosPrograma.add(rs.getInt(7));
            oPermisosPrograma.add(rs.getInt(8));
            oPermisosPrograma.add(rs.getInt(9));
            listaPermisosPrograma.add(oPermisosPrograma);
        }
        return listaPermisosPrograma;
    }

    public Vector buscarPermisosPrograma(int codigo) throws SQLException {
        Vector listaPermisosPrograma = new Vector();
        String sql = "SELECT idPermisos,idPrograma,Programa,Descripcion,IdUsuario,Username,Registro,Actualiza,Elimina"
                + " from vPermisosPrograma where idPermisos = " + codigo;
        pst = con.prepareStatement(sql);
        pst.setInt(1, codigo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Vector oPermisosPrograma = new Vector();
            oPermisosPrograma.add(rs.getInt(1));
            oPermisosPrograma.add(rs.getInt(2));
            oPermisosPrograma.add(rs.getString(3));
            oPermisosPrograma.add(rs.getString(4));
            oPermisosPrograma.add(rs.getInt(5));
            oPermisosPrograma.add(rs.getString(6));
            oPermisosPrograma.add(rs.getInt(7));
            oPermisosPrograma.add(rs.getInt(8));
            oPermisosPrograma.add(rs.getInt(9));
            listaPermisosPrograma.add(oPermisosPrograma);
        }
        pst.close();
        rs.close();

        return listaPermisosPrograma;

    }
}
