
package Sistema.model.dao;

import Sistema.model.bean.Programa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;


public class ProgramaDaoImp {
     private PreparedStatement pst;
    private Statement st;
    private Connection con;
     private Programa oPrograma;

    public ProgramaDaoImp(Connection con) {
        this.con = con;
    }

    public Vector obtenerListaPrograma() throws SQLException {
        Vector listaPrograma = new Vector();
        String sql = "SELECT idPrograma,Programa,Descripcion,Estado,Fecha FROM dbo.Programa";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oPrograma = new Vector();
            oPrograma.add(rs.getInt(1));
            oPrograma.add(rs.getString(2));
            oPrograma.add(rs.getString(3));
            oPrograma.add(rs.getString(4));
            oPrograma.add(rs.getString(5));
           
            listaPrograma.add(oPrograma);
        }
        return listaPrograma;
    }

    public Vector obtenerListaProgramaBuscar(String texto) throws SQLException {
        Vector listaPrograma = new Vector();
        String sql = "SELECT  idPrograma,Programa,Descripcion,Estado,Fecha from Programa  WHERE idPrograma LIKE '%" + texto + "%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oPrograma = new Vector();
            oPrograma.add(rs.getInt(1));
            oPrograma.add(rs.getString(2));
            oPrograma.add(rs.getString(3));
            oPrograma.add(rs.getString(4));
            oPrograma.add(rs.getString(5));
           
            listaPrograma.add(oPrograma);
        }
        return listaPrograma;
    }

//      public Vector obtenerListaRecepcionBuscarRemitente(String Programa) throws SQLException {
//        Vector listaPrograma = new Vector();
//        String sql = "SELECT idPrograma,Codigo,Programa,Estado,Fecha FROM dbo.Programa WHERE Programa ='" + Programa+"'";
//        JOptionPane.showMessageDialog(null, sql);
//        st = con.createStatement();
//        ResultSet rs = st.executeQuery(sql);
//        while (rs.next()) {
//            Vector oPrograma = new Vector();
//           oPrograma.add(rs.getInt(1));
//            oPrograma.add(rs.getString(2));
//            oPrograma.add(rs.getString(3));
//            oPrograma.add(rs.getString(4));
//            oPrograma.add(rs.getString(5));
//            listaPrograma.add(oPrograma);
//        }
//        return listaPrograma;
//       } 
    public Vector buscarPrograma(int codigo) throws SQLException {
        Vector listaPrograma = new Vector();
        String sql = "SELECT  idPrograma,Programa,Descripcion,Estado,Fecha"
                + " from Programa where idPrograma = " + codigo;
        pst = con.prepareStatement(sql);
        pst.setInt(1, codigo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
             Vector oPrograma = new Vector();
           oPrograma.add(rs.getString(1));
            oPrograma.add(rs.getString(2));
            oPrograma.add(rs.getString(3));
            oPrograma.add(rs.getString(4));
            listaPrograma.add(oPrograma);
        }
       return listaPrograma;
    }
    public boolean grabar(Object object) throws SQLException {
        oPrograma = (Programa) object;
        try {
            String sql = "insert intoPrograma(Programa,Descripcion,Estado,Fecha) "
                    + "values(?,?,?,?)";
            
//            System.out.println("Remitente:"+oRecepcion.getRemitente()+"Institucion:"+oRecepcion.getInstitucion()+"Fecha"+oRecepcion.getFecha()+"Hora:"+
//                    oRecepcion.getHora()+"RemitenteResponsable"+oRecepcion.getRemitenteResponsable()+"CODIGO REMITENTE"+oRecepcion.getIdRemitente());
            pst = con.prepareStatement(sql);
            pst.setString(1, oPrograma.getPrograma());
            pst.setString(2, oPrograma.getDescripcion());
            pst.setString(3, oPrograma.getEstado());
            pst.setString(4, oPrograma.getFecha());
            pst.execute();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean eliminar(Object object) throws SQLException {
        oPrograma = (Programa) object;
        try {
            String sql = "Delete from Programa where idPrograma = " + oPrograma.getIdPrograma();

            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean modificar(Object object) throws SQLException {
        oPrograma = (Programa) object;
        int codigo = oPrograma.getIdPrograma();
        try {
            String sql = "UPDATE Programa SET Programa=?,Descripcion =?,Estado=?,Fecha=?  WHERE idPrograma = ? ";
            pst = con.prepareStatement(sql);
            pst.setString(1, oPrograma.getPrograma());
             pst.setString(2, oPrograma.getDescripcion());
            pst.setString(3, oPrograma.getEstado());
            pst.setString(4, oPrograma.getFecha());
            pst.setInt(5, oPrograma.getIdPrograma());
            pst.executeUpdate();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public Vector obtenerlistaPrograma() throws SQLException {
        Vector listaPrograma = new Vector();
        String sql = "select SELECT idPrograma,Programa,Descripcion,Estado,Fecha FROM dbo.Programa order by Programa";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
           Programa prioridad = new Programa();
            prioridad.setIdPrograma(rs.getInt(1));
            prioridad.setPrograma(rs.getString(2));
            prioridad.setDescripcion(rs.getString(3));
            prioridad.setEstado(rs.getString(4));
            prioridad.setFecha(rs.getString(5));
            listaPrograma.add(prioridad);
        }

        return listaPrograma;
    }
}
