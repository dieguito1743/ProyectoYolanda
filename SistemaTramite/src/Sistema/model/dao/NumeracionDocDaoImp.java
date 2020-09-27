
package Sistema.model.dao;

import Sistema.model.bean.NumeracionDoc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;


public class NumeracionDocDaoImp {
  private PreparedStatement pst;
    private Statement st;
    private Connection con;
    private NumeracionDoc oNumeracionDoc;
    
      public NumeracionDocDaoImp(Connection con) {
        this.con = con;
    }

    public Vector obtenerListaNumeracionDoc() throws SQLException {
        Vector listaNumeracionDoc = new Vector();
        String sql = "SELECT idNumeracionDoc,NumeracionDoc,idArea,idTipoDocumento, Entero FROM dbo.NumeracionDoc";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oNumeracionDoc = new Vector();
            oNumeracionDoc.add(rs.getInt(1));
            oNumeracionDoc.add(rs.getInt(2));
            oNumeracionDoc.add(rs.getInt(3));
            oNumeracionDoc.add(rs.getInt(4));
            oNumeracionDoc.add(rs.getInt(5));
            listaNumeracionDoc.add(oNumeracionDoc);
        }
        return listaNumeracionDoc;

    }

    public Vector obtenerListaNumeracionDocBuscar(String NumeracionDoc) throws SQLException {
        Vector listaNumeracionDoc = new Vector();
        String sql = "SELECT idNumeracionDoc,NumeracionDoc,idArea,idTipoDocumento,Entero from NumeracionDoc  WHERE Cargo LIKE '%" + NumeracionDoc + "%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oNumeracionDoc = new Vector();
            oNumeracionDoc.add(rs.getInt(1));
            oNumeracionDoc.add(rs.getInt(2));
            oNumeracionDoc.add(rs.getInt(3));
            oNumeracionDoc.add(rs.getInt(4));
            oNumeracionDoc.add(rs.getInt(5));
            listaNumeracionDoc.add(oNumeracionDoc);
           } 
        return listaNumeracionDoc;
    } 
    public Vector buscarNumeracionDoc(int codigo) throws SQLException {
        Vector  listaNumeracionDoc = new Vector();
        String sql = "SELECT idNumeracionDoc,NumeracionDoc,idArea,idTipoDocumento,Entero"
                + " from NumeracionDoc where idNumeracionDoc = " + codigo;
        pst = con.prepareStatement(sql);
        pst.setInt(1, codigo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Vector oNumeracionDoc = new Vector();
            oNumeracionDoc.add(rs.getInt(1));
            oNumeracionDoc.add(rs.getInt(2));
            oNumeracionDoc.add(rs.getInt(3));
            oNumeracionDoc.add(rs.getInt(4));
            oNumeracionDoc.add(rs.getInt(5));
            listaNumeracionDoc.add(oNumeracionDoc);
        }
        pst.close();
        rs.close();

        return  listaNumeracionDoc;

    }

    public boolean grabar(Object object) throws SQLException {
        oNumeracionDoc = (NumeracionDoc) object;
        try {
            String sql = "insert into NumeracionDoc (NumeracionDoc,idArea,idTipoDocumento,Entero) "
                    + "values(?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, oNumeracionDoc.getNumeracionDoc());
            pst.setInt(2, oNumeracionDoc.getIdArea());
            pst.setInt(3, oNumeracionDoc.getIdTipoDocumento());
            pst.setInt(4, oNumeracionDoc.getEntero());
            
            pst.execute();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean eliminar(Object object) throws SQLException {
        oNumeracionDoc = (NumeracionDoc) object;
        try {
            String sql = "Delete from Cargo where idNumeracionDoc = " + oNumeracionDoc.getIdNumeracionDoc();
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean modificar(Object object) throws SQLException {
        oNumeracionDoc = (NumeracionDoc) object;
        int codigo = oNumeracionDoc.getIdNumeracionDoc();
        try {
            String sql = "UPDATE NumeracionDoc SET idNumeracionDoc=?,idArea=?,idTipoDocumento=?,Entero=? WHERE idNumeracionDoc = ? ";
            pst = con.prepareStatement(sql);
            pst.setInt(1, oNumeracionDoc.getNumeracionDoc());
            pst.setInt(2, oNumeracionDoc.getIdArea());
            pst.setInt(3, oNumeracionDoc.getIdTipoDocumento());
            pst.setInt(4, oNumeracionDoc.getEntero());
            pst.setInt(5, oNumeracionDoc.getIdNumeracionDoc());
            pst.executeUpdate();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public Vector obtenerListasNumeracionDoc() throws SQLException {
        Vector listaNumeracionDoc = new Vector();
        String sql = "select  idNumeracionDoc,NumeracionDoc,idArea,idTipoDocumento,Entero from NumeracionDoc order by NumeracionDoc";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            oNumeracionDoc = new NumeracionDoc();
            oNumeracionDoc.setIdNumeracionDoc(rs.getInt(1));
            oNumeracionDoc.setNumeracionDoc(rs.getInt(2));
            oNumeracionDoc.setIdArea(rs.getInt(3));
            oNumeracionDoc.setIdTipoDocumento(rs.getInt(4));
            oNumeracionDoc.setEntero(rs.getInt(5));
            listaNumeracionDoc.add(oNumeracionDoc);
        }
        return listaNumeracionDoc;
    }
}
