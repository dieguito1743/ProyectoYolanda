package Sistema.model.dao;

import Sistema.model.bean.Recepcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

public class RecepcionDaoImp {

    private PreparedStatement pst;
    private Statement st;
    private Connection con;
    private Recepcion oRecepcion;

    public RecepcionDaoImp(Connection con) {
        this.con = con;
    }

    public Vector obtenerListaRecepcion() throws SQLException {
        Vector listaRecepion = new Vector();
        String sql = "SELECT idRecepcion,Remitente,Institucion,Fecha,Hora,idRemitente FROM dbo.Recepcion";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oRecepcion = new Vector();
            oRecepcion.add(rs.getInt(1));
            oRecepcion.add(rs.getString(2));
            oRecepcion.add(rs.getString(3));
            oRecepcion.add(rs.getString(4));
            oRecepcion.add(rs.getString(5));
            oRecepcion.add(rs.getInt(6));
            listaRecepion.add(oRecepcion);
        }
        return listaRecepion;
    }

    public Vector obtenerListaRecepcionBuscar(String texto) throws SQLException {
        Vector listaRecepcion = new Vector();
        String sql = "SELECT idRecepcion,codigoRecepcion,Documento,Institucion,idRemitente,Asunto,Referencia,Destinatario,Obs,Fecha,Hora FROM dbo.Recepcion WHERE idRecepcion LIKE '%" + texto + "%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oRecepcion = new Vector();
            oRecepcion.add(rs.getInt(1));
            oRecepcion.add(rs.getString(2));
            oRecepcion.add(rs.getString(3));
            oRecepcion.add(rs.getString(4));
            oRecepcion.add(rs.getInt(5));
            oRecepcion.add(rs.getString(6));
            oRecepcion.add(rs.getString(7)); 
            oRecepcion.add(rs.getString(8));
            oRecepcion.add(rs.getString(9));
            oRecepcion.add(rs.getString(10));
            oRecepcion.add(rs.getString(11));
            listaRecepcion.add(oRecepcion);
        }
        return listaRecepcion;
    }

      public Vector obtenerListaRecepcionBuscarRemitente(String Remitente) throws SQLException {
        Vector listaRecepcion = new Vector();
        String sql = "SELECT idRecepcion,Remitente,Institucion,Fecha,Hora,idRemitente FROM dbo.Recepcion WHERE Remitente ='" + Remitente+"'";
        JOptionPane.showMessageDialog(null, sql);
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oRecepcion = new Vector();
             oRecepcion.add(rs.getInt(1));
            oRecepcion.add(rs.getString(2));
            oRecepcion.add(rs.getString(3));
            oRecepcion.add(rs.getString(4));
            oRecepcion.add(rs.getString(5));
            oRecepcion.add(rs.getInt(6));
            listaRecepcion.add(oRecepcion);
        }
        return listaRecepcion;
      }
        
    public Vector buscarRecepcion(int codigo) throws SQLException {
        Vector listaRecepcion = new Vector();
        String sql = "Select idRecepcion ,Remitente ,Institucion,Fecha,Hora ,idRemitente"
                + " from Recepcion where idRecepcion = " + codigo;
        pst = con.prepareStatement(sql);
        pst.setInt(1, codigo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Vector oRecepcion = new Vector();
            oRecepcion.add(rs.getInt(1));
            oRecepcion.add(rs.getString(2));
            oRecepcion.add(rs.getString(3));
            oRecepcion.add(rs.getString(4));
            oRecepcion.add(rs.getInt(5));
            listaRecepcion.add(oRecepcion);
        }
        return listaRecepcion;
    }
    public String obtenerNombreRecepcion(int idRecepcion) throws SQLException {
        String lsNombreRecep="";
        String sql = "SELECT Remitente from Remitente where idRecepcion = " + idRecepcion;
        pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            lsNombreRecep = rs.getString("Recepcion");
        }
        return lsNombreRecep;
    }
    public boolean grabar(Object object) throws SQLException {
        oRecepcion = (Recepcion) object;
        try {
            String sql = "insert into Recepcion(codigoRecepcion,Documento,Institucion,idRemitente,Asunto,Referencia,Destinatario,Obs,Fecha,Hora) "
                    + "values(?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, oRecepcion.getCodigoRecepcion());
            pst.setString(2, oRecepcion.getDocumento());
            pst.setString(3, oRecepcion.getInstitucion());
            pst.setInt(4, oRecepcion.getIdRemitente());
            pst.setString(5, oRecepcion.getAsunto());
            pst.setString(6, oRecepcion.getReferencia());
            pst.setString(7, oRecepcion.getDestinatario());
            pst.setString(8, oRecepcion.getObs());
            pst.setString(9, oRecepcion.getFecha());
            pst.setString(10, oRecepcion.getHora());
            pst.execute();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean eliminar(Object object) throws SQLException {
        oRecepcion = (Recepcion) object;
        try {
            String sql = "Delete from Recepcion where idrecepcion = " + oRecepcion.getIdRecepcion();

            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean modificar(Object object) throws SQLException {
        oRecepcion = (Recepcion) object;
        int codigo = oRecepcion.getIdRecepcion();
        try {
            String sql = "UPDATE Recepcion SET Remitente=?,Institucion=?,Fecha=?,Hora=?,idRemitente=? WHERE idRecepcion = ? ";
            pst = con.prepareStatement(sql);
            pst.setInt(1, oRecepcion.getIdRemitente());
            pst.setString(2, oRecepcion.getInstitucion());
            pst.setString(3, oRecepcion.getFecha());
            pst.setString(4, oRecepcion.getHora());
            pst.setInt(5, oRecepcion.getIdRecepcion());
            pst.executeUpdate();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public Vector obtenerlistaRecepcion() throws SQLException {
        Vector listaRecepcion = new Vector();
        String sql = "select selectidRecepcion,Remitente ,Institucion,Fecha,Hora,idRemitente from recepcion order by Remitente";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Recepcion recepcion = new Recepcion();
            recepcion.setIdRecepcion(rs.getInt(1));
//            recepcion.setRemitente(rs.getString(2));
            recepcion.setInstitucion(rs.getString(3));
            recepcion.setFecha(rs.getString(4));
            recepcion.setHora(rs.getString(5));
            recepcion.setIdRemitente(rs.getInt(6));
            listaRecepcion.add(recepcion);
        }

        return listaRecepcion;
    }

}
