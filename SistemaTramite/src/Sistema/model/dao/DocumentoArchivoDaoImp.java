
package Sistema.model.dao;

import Sistema.model.bean.DocumentoArchivo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;


public class DocumentoArchivoDaoImp {
     private PreparedStatement pst;
    private Statement st;
    private Connection con;
    private DocumentoArchivo oDocumentoArchivo;

    public DocumentoArchivoDaoImp(Connection con) {
        this.con = con;
    }

    public boolean grabar(Object object) throws SQLException {
        oDocumentoArchivo = (DocumentoArchivo) object;
        try {
            String sql = "insert into DocumentoArchivo  (idTipoDocumento,NumeroDocumento,Origen,Destino) "
                    + "values(?,?,?,?)";  
            pst = con.prepareStatement(sql);
//            pst.setInt(1, oDocumentoArchivo.getDocumentoArchivo());
            pst.setInt(1, oDocumentoArchivo.getIdTipoDocumento());
            pst.setString(2, oDocumentoArchivo.getNumeroDocumento());
            pst.setString(3, oDocumentoArchivo.getOrigen());
              pst.setString(4, oDocumentoArchivo.getDestino());
            pst.execute();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }
   public Vector obtenerlistaDocumentoArchivo(int idTipoDoc, String nroDoc) throws SQLException {
        Vector listaDocumentoArchivo = new Vector();
        String sql = "select idDocArchivo,idTipoDocumento,NumeroDocumento,Origen,Destino "
                + " From DocumentoArchivo where idTipoDocumento=? and NumeroDocumento=?";
        pst = con.prepareStatement(sql);
        pst.setInt(1, idTipoDoc);
        pst.setString(2, nroDoc);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Vector oDocumentoArchivo = new Vector();
            oDocumentoArchivo.add(rs.getInt(1));
            oDocumentoArchivo.add(rs.getString(2));
            oDocumentoArchivo.add(rs.getString(3));
            oDocumentoArchivo.add(rs.getString(4));
            listaDocumentoArchivo.add(oDocumentoArchivo);
        }

        return  listaDocumentoArchivo;
    }
}