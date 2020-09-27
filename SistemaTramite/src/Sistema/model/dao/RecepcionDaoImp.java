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
            oRecepcion.add(rs.getString(6));
            oRecepcion.add(rs.getInt(7));
            listaRecepion.add(oRecepcion);
        }
        return listaRecepion;
    }

    public Vector obtenerListaRecepcionBuscar(String texto) throws SQLException {
        Vector listaRecepcion = new Vector();
        String sql = "SELECT idRecepcion,Remitente,Institucion,Fecha,Hora,idRemitente FROM dbo.Recepcion WHERE idRecepcion LIKE '%" + texto + "%'";
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

    public boolean grabar(Object object) throws SQLException {
        oRecepcion = (Recepcion) object;
        try {
            String sql = "insert into Recepcion(codigoRecepcion,Remitente,Institucion,Fecha,Hora,idRemitente) "
                    + "values(?,?,?,?,?,?,?)";
            
//            System.out.println("Remitente:"+oRecepcion.getRemitente()+"Institucion:"+oRecepcion.getInstitucion()+"Fecha"+oRecepcion.getFecha()+"Hora:"+
//                    oRecepcion.getHora()+"RemitenteResponsable"+oRecepcion.getRemitenteResponsable()+"CODIGO REMITENTE"+oRecepcion.getIdRemitente());
            pst = con.prepareStatement(sql);
            pst.setString(1, oRecepcion.getCodigoRecepcion());
            pst.setString(2, oRecepcion.getRemitente());
            pst.setString(3, oRecepcion.getInstitucion());
            pst.setString(4, oRecepcion.getFecha());
            pst.setString(5, oRecepcion.getHora());
            pst.setInt(6, oRecepcion.getIdRemitente());
            
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
            pst.setString(1, oRecepcion.getRemitente());
            pst.setString(2, oRecepcion.getInstitucion());
            pst.setString(3, oRecepcion.getFecha());
            pst.setString(4, oRecepcion.getHora());
            pst.setInt(5, oRecepcion.getIdRemitente());
            pst.setInt(6, oRecepcion.getIdRecepcion());
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
            recepcion.setRemitente(rs.getString(2));
            recepcion.setInstitucion(rs.getString(3));
            recepcion.setFecha(rs.getString(4));
            recepcion.setHora(rs.getString(5));
            recepcion.setIdRemitente(rs.getInt(6));
            listaRecepcion.add(recepcion);
        }

        return listaRecepcion;
    }

}
