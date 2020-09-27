
package Sistema.model.dao;

import Sistema.model.bean.Prioridad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;


public class PrioridadDaoImp {
    
    private PreparedStatement pst;
    private Statement st;
    private Connection con;
    private Prioridad oPrioridad;

    public PrioridadDaoImp(Connection con) {
        this.con = con;
    }

    public Vector obtenerListaPrioridad() throws SQLException {
        Vector listaPrioridad = new Vector();
        String sql = "SELECT idPrioridad,PrioridadEstado,Fecha FROM dbo.Prioridad";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oPrioridad = new Vector();
            oPrioridad.add(rs.getInt(1));
            oPrioridad.add(rs.getString(2));
            oPrioridad.add(rs.getString(3));
           
            listaPrioridad.add(oPrioridad);
        }
        return listaPrioridad;
    }

    public Vector obtenerListaPrioridadBuscar(String texto) throws SQLException {
        Vector listaPrioridad = new Vector();
        String sql = "SELECT idPrioridad,PrioridadEstado,Fecha FROM dbo.Prioridad WHERE idPrioridad LIKE '%" + texto + "%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oPrioridad = new Vector();
            oPrioridad.add(rs.getInt(1));
            oPrioridad.add(rs.getString(2));
            oPrioridad.add(rs.getString(3));
           
            listaPrioridad.add(oPrioridad);
        }
        return listaPrioridad;
    }

      public Vector obtenerListaRecepcionBuscarRemitente(String Prioridad) throws SQLException {
        Vector listaPrioridad = new Vector();
        String sql = "SELECT idPrioridad,PrioridadEstado,Fecha FROM dbo.Prioridad WHERE Prioridad ='" + Prioridad+"'";
        JOptionPane.showMessageDialog(null, sql);
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oPrioridad = new Vector();
            oPrioridad.add(rs.getInt(1));
            oPrioridad.add(rs.getString(2));
            oPrioridad.add(rs.getString(3));
            listaPrioridad.add(oPrioridad);
        }
        return listaPrioridad;
       } 
    public Vector buscarPrioridad(int codigo) throws SQLException {
        Vector listaPrioridad = new Vector();
        String sql = "SELECT idPrioridad,PrioridadEstado,Fecha"
                + " from Prioridad where idPrioridad = " + codigo;
        pst = con.prepareStatement(sql);
        pst.setInt(1, codigo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
             Vector oPrioridad = new Vector();
            oPrioridad.add(rs.getInt(1));
            oPrioridad.add(rs.getString(2));
            oPrioridad.add(rs.getString(3));
            listaPrioridad.add(oPrioridad);
        }
       return listaPrioridad;
    }
    public boolean grabar(Object object) throws SQLException {
        oPrioridad = (Prioridad) object;
        try {
            String sql = "insert intoPrioridad(PrioridadEstado,Fecha) "
                    + "values(?,?)";
            
//            System.out.println("Remitente:"+oRecepcion.getRemitente()+"Institucion:"+oRecepcion.getInstitucion()+"Fecha"+oRecepcion.getFecha()+"Hora:"+
//                    oRecepcion.getHora()+"RemitenteResponsable"+oRecepcion.getRemitenteResponsable()+"CODIGO REMITENTE"+oRecepcion.getIdRemitente());
            pst = con.prepareStatement(sql);
            pst.setString(1, oPrioridad.getPrioridadEstado());
            pst.setString(2, oPrioridad.getFecha());
           
            
            pst.execute();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean eliminar(Object object) throws SQLException {
        oPrioridad = (Prioridad) object;
        try {
            String sql = "Delete from Prioridad where idPrioridad = " + oPrioridad.getIdPrioridad();

            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean modificar(Object object) throws SQLException {
        oPrioridad = (Prioridad) object;
        int codigo = oPrioridad.getIdPrioridad();
        try {
            String sql = "UPDATE Prioridad SET PrioridadEstado=?,Fecha=?  WHERE idPrioridad = ? ";
            pst = con.prepareStatement(sql);
            pst.setString(1, oPrioridad.getPrioridadEstado());
            pst.setString(2, oPrioridad.getFecha());
            pst.setInt(3, oPrioridad.getIdPrioridad());
            pst.executeUpdate();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public Vector obtenerlistaPrioridad() throws SQLException {
        Vector listaPrioridad = new Vector();
        String sql = "select SELECTidPrioridad,PrioridadEstado,Fecha FROM dbo.Prioridad order by PrioridadEstado";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
           Prioridad prioridad = new Prioridad();
            prioridad.setIdPrioridad(rs.getInt(1));
            prioridad.setPrioridadEstado(rs.getString(2));
            prioridad.setFecha(rs.getString(3));
            listaPrioridad.add(prioridad);
        }

        return listaPrioridad;
    }
}
