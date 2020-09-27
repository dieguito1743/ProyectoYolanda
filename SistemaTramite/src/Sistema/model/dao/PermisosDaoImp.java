package Sistema.model.dao;

import Sistema.model.bean.Permisos;
import Sistema.model.bean.Programa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

public class PermisosDaoImp {

    private PreparedStatement pst;
    private Statement st;
    private Connection con;
    private Permisos oPermisos;

    public PermisosDaoImp(Connection con) {
        this.con = con;
    }

    public Vector obtenerListaPermisos() throws SQLException {
        Vector listaPermisos = new Vector();
        String sql = "SELECT idPermisos,idPrograma,IdUsuario,Registro,Actualiza,Elimina FROM dbo.Permisos";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oPermisos = new Vector();
            oPermisos.add(rs.getInt(1));
            oPermisos.add(rs.getInt(2));
            oPermisos.add(rs.getInt(3));
            oPermisos.add(rs.getInt(4));
            oPermisos.add(rs.getInt(5));
            oPermisos.add(rs.getInt(6));
            listaPermisos.add(oPermisos);
        }
        return listaPermisos;
    }

    public Vector obtenerListaPermisosBuscar(String texto) throws SQLException {
        Vector listaPermisos = new Vector();
        JOptionPane.showMessageDialog(null, texto);
        String sql = "SELECT idPermisos,idPrograma,IdUsuario,Registro,Actualiza,Elimina FROM dbo.Permisos WHERE idPrograma LIKE '%" + texto + "%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oPermisos = new Vector();
            oPermisos.add(rs.getInt(1));
            oPermisos.add(rs.getInt(2));
            oPermisos.add(rs.getInt(3));
            oPermisos.add(rs.getInt(4));
            oPermisos.add(rs.getInt(5));
            oPermisos.add(rs.getInt(6));
            listaPermisos.add(oPermisos);
        }
        return listaPermisos;

    }

    public Vector buscarRecepcion(int codigo) throws SQLException {
        Vector listaPermisos = new Vector();
        String sql = "Select idPermisos,idPrograma,IdUsuario,Registro,Actualiza,Elimina"
                + " fromPermisos where idPermisos = " + codigo;
        pst = con.prepareStatement(sql);
        pst.setInt(1, codigo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Vector oPermisos = new Vector();
            oPermisos.add(rs.getInt(1));
            oPermisos.add(rs.getInt(2));
            oPermisos.add(rs.getInt(3));
            oPermisos.add(rs.getInt(4));
            oPermisos.add(rs.getInt(5));
            listaPermisos.add(oPermisos);
        }
        return listaPermisos;
    }

    public boolean grabar(Object object) throws SQLException {
        oPermisos = (Permisos) object;
        try {
            String sql = "insert into Permisos(idPrograma,IdUsuario,Registro,Actualiza,Elimina) "
                    + "values(?,?,?,?,?,?)";

//            System.out.println("Remitente:"+oRecepcion.getRemitente()+"Institucion:"+oRecepcion.getInstitucion()+"Fecha"+oRecepcion.getFecha()+"Hora:"+
//                    oRecepcion.getHora()+"RemitenteResponsable"+oRecepcion.getRemitenteResponsable()+"CODIGO REMITENTE"+oRecepcion.getIdRemitente());
            pst = con.prepareStatement(sql);
            pst.setInt(1, oPermisos.getIdPrograma());
            pst.setInt(2, oPermisos.getIdUsuario());
            pst.setInt(3, oPermisos.getRegistro());
            pst.setInt(4, oPermisos.getActualiza());
            pst.setInt(5, oPermisos.getElimina());

            pst.execute();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean eliminar(Object object) throws SQLException {
        oPermisos = (Permisos) object;
        try {
            String sql = "Delete from Permisos where idPermisos = " + oPermisos.getIdPermisos();

            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean modificar(Object object) throws SQLException {
        oPermisos = (Permisos) object;
        int codigo = oPermisos.getIdPermisos();
        try {
            String sql = "UPDATE Permisos SET idPrograma=?,Usuario=?,Registro=?,Actualiza=?,Elimina=?  WHERE idPermisos = ? ";
            pst = con.prepareStatement(sql);
            pst.setInt(1, oPermisos.getIdPrograma());
            pst.setInt(2, oPermisos.getIdUsuario());
            pst.setInt(3, oPermisos.getRegistro());
            pst.setInt(4, oPermisos.getActualiza());
            pst.setInt(5, oPermisos.getElimina());
            pst.setInt(6, oPermisos.getIdPermisos());
            pst.executeUpdate();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public Vector obtenerlistaPermisos() throws SQLException {
        Vector listaPermisos = new Vector();
        String sql = "select selectidPermisos,idPrograma,IdUsuario,Registro,Actualiza,Elimina from Permisos order by  Permisos";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Permisos recepcion = new Permisos();
            recepcion.setIdPermisos(rs.getInt(1));
            recepcion.setIdPrograma(rs.getInt(2));
            recepcion.setIdUsuario(rs.getInt(3));
            recepcion.setRegistro(rs.getInt(4));
            recepcion.setActualiza(rs.getInt(5));
            recepcion.setElimina(rs.getInt(6));
            listaPermisos.add(recepcion);
        }

        return listaPermisos;
    }
}
