
package Sistema.model.dao;

import Sistema.model.bean.Derivacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

public class DerivacionDaoImp {
     private PreparedStatement pst;
    private Statement st;
    private Connection con;
    private Derivacion oDerivacion;
    
      public DerivacionDaoImp(Connection con) {
        this.con = con;
    }

    public Vector obtenerListaDerivacion() throws SQLException {
        Vector listaDerivacion = new Vector();
        String sql = "SELECT idDerivacion,Derivacion,Fecha,idDocumento,remitente,MotivoDerivacion,prioridad,observacion FROM dbo.Derivacion";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oDerivacion = new Vector();
            oDerivacion.add(rs.getInt(1));
            oDerivacion.add(rs.getString(2));
            oDerivacion.add(rs.getString(3));
            oDerivacion.add(rs.getInt(4));
            oDerivacion.add(rs.getString(5));
            oDerivacion.add(rs.getString(6));
            oDerivacion.add(rs.getInt(7));
            oDerivacion.add(rs.getString(8));
            
            listaDerivacion.add(oDerivacion);
        }
        return listaDerivacion;

    }

    public Vector obtenerListaDerivacionBuscar(String MotivoDerivacion) throws SQLException {
        Vector listaDerivacion = new Vector();
        String sql = "SELECT idDerivacion,Derivacion,Fecha,idDocumento,remitente,MotivoDerivacion,prioridad,observacion from Derivacion WHERE Derivacion LIKE '%" + MotivoDerivacion + "%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oDerivacion = new Vector();
            oDerivacion.add(rs.getInt(1));
            oDerivacion.add(rs.getString(2));
            oDerivacion.add(rs.getString(3));
            oDerivacion.add(rs.getInt(4));
            oDerivacion.add(rs.getString(5));
            oDerivacion.add(rs.getString(6));
            oDerivacion.add(rs.getInt(7));
            oDerivacion.add(rs.getString(8));
            
            listaDerivacion.add(oDerivacion);
        }
        return listaDerivacion;

    } 
    public Vector buscarDerivacion(int codigo) throws SQLException {
        Vector listaDerivacion = new Vector();
        String sql = "SELECT idDerivacion,Derivacion,Fecha,idDocumento,remitente,MotivoDerivacion,prioridad,observacion"
                + " from Derivacion where idDerivacion = " + codigo;
        pst = con.prepareStatement(sql);
        pst.setInt(1, codigo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
             Vector oDerivacion = new Vector();
            oDerivacion.add(rs.getInt(1));
            oDerivacion.add(rs.getString(2));
            oDerivacion.add(rs.getString(3));
            oDerivacion.add(rs.getInt(4));
            oDerivacion.add(rs.getString(5));
            oDerivacion.add(rs.getString(6));
            oDerivacion.add(rs.getInt(7));
            oDerivacion.add(rs.getString(8));
            listaDerivacion.add(oDerivacion);
  }
        return listaDerivacion;

    }

    public boolean grabar(Object object) throws SQLException {
        oDerivacion = (Derivacion) object;
        try {
            String sql = "insert into Derivacion (Derivacion,Fecha,idDocumento,Remitente,motivoDerivacion,Prioridad,Observacion) "
                    + "values(?,?,?,?,?,?,?)";
            
              System.out.println("Derivacion:"+oDerivacion.getDerivacion()+"Fecha:"+oDerivacion.getFecha()+"idDocumento"+oDerivacion.getIdDocumento()+"Remitente:"+
                    oDerivacion.getRemitente()+"motivoDerivacion"+oDerivacion.getMotivoDerivacion()+"Prioridad"+oDerivacion.getPrioridad()+"Observacion"+oDerivacion.getObservacion());
            pst = con.prepareStatement(sql);
            pst.setString(1, oDerivacion.getDerivacion());
            pst.setString(2, oDerivacion.getFecha());
            pst.setInt(3, oDerivacion.getIdDocumento());
            pst.setString(4, oDerivacion.getRemitente());
            pst.setString(5, oDerivacion.getMotivoDerivacion());
            pst.setInt(6, oDerivacion.getPrioridad());
            pst.setString(7, oDerivacion.getObservacion());
           
            pst.execute();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean eliminar(Object object) throws SQLException {
        oDerivacion = (Derivacion) object;
        try {
            String sql = "Delete from Derivacion where idDerivacion = " + oDerivacion.getIdDerivacion(); 
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean modificar(Object object) throws SQLException {
        oDerivacion = (Derivacion) object;
        int codigo = oDerivacion.getIdDerivacion();
        try {
            String sql = "UPDATE Cargo SET Derivacion=?,Fecha=?,idDocumento=?,remitente=?,MotivoDerivacion=?,prioridad=?,observacion=? Where idDerivacion=? ";
            pst = con.prepareStatement(sql);
            pst.setString(1, oDerivacion.getDerivacion());
            pst.setString(2,oDerivacion.getFecha());
            pst.setInt(3, oDerivacion.getIdDocumento());
            pst.setString(4, oDerivacion.getRemitente());
            pst.setString(5, oDerivacion.getMotivoDerivacion());
            pst.setInt(6, oDerivacion.getPrioridad());
            pst.setString(7, oDerivacion.getObservacion());
            pst.setInt(8, oDerivacion.getIdDerivacion());
            pst.executeUpdate();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public Vector obtenerListasDerivacion() throws SQLException {
        Vector listaDerivacion = new Vector();
        String sql = "select select idDerivacion,Derivacion,Fecha,idDocumento,remitente,MotivoDerivacion,prioridad,observacion  from Derivacion order by motivoDerivacion";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
           oDerivacion= new Derivacion();
            oDerivacion.setIdDerivacion(rs.getInt(1));
            oDerivacion.setDerivacion(rs.getString(2));
            oDerivacion.setFecha(rs.getString(3));
            oDerivacion.setIdDocumento(rs.getInt(4));
            oDerivacion.setRemitente(rs.getString(5));
            oDerivacion.setMotivoDerivacion(rs.getString(6));
            oDerivacion.setPrioridad(rs.getInt(7));
            oDerivacion.setObservacion(rs.getString(8));
            listaDerivacion.add(oDerivacion);
        }
        return listaDerivacion;
    }
}
