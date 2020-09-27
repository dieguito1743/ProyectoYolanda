package Sistema.model.dao;

import Sistema.model.bean.DocumentoDestinatario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

public class DocumentoDestinatarioDaoImp {

    private PreparedStatement pst;
    private Statement st;
    private Connection con;
    private DocumentoDestinatario oDocumentoDestinatario;

    public DocumentoDestinatarioDaoImp(Connection con) {
        this.con = con;
    }

    public boolean grabar(Object object) throws SQLException {
        oDocumentoDestinatario = (DocumentoDestinatario) object;
        try {
            String sql = "insert into DocumentoDestinatario (idTipoDocumento,NumeroDocumento,Destinatario) "
                    + "values(?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, oDocumentoDestinatario.getIdTipoDocumento());
            pst.setString(2, oDocumentoDestinatario.getNumeroDocumento());
            pst.setString(3, oDocumentoDestinatario.getDestinatario());
            pst.execute();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public Vector obtenerlistaDocumentoDestinatario(int idTipoDoc, String nroDoc) throws SQLException {
        Vector listaDocumentoDestinatario = new Vector();
        JOptionPane.showMessageDialog(null, "idTipoDoc:"+idTipoDoc +  " nroDoc:"+nroDoc);
        String sql = "select idDocDestinatario,idTipoDocumento,NumeroDocumento,Destinatario "
                + " From DocumentoDestinatario where idTipoDocumento="+ idTipoDoc + " and NumeroDocumento=" + nroDoc;
        pst = con.prepareStatement(sql);
        pst.setInt(1, idTipoDoc);
        pst.setString(2, nroDoc);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Vector oDocumentoDestinatario = new Vector();
            oDocumentoDestinatario.add(rs.getInt(1));
            oDocumentoDestinatario.add(rs.getInt(2));
            oDocumentoDestinatario.add(rs.getString(3));
            oDocumentoDestinatario.add(rs.getString(4));
            
            JOptionPane.showMessageDialog(null, rs.getString(4));
            
            listaDocumentoDestinatario.add(oDocumentoDestinatario);
        }

        return listaDocumentoDestinatario;
    }
}
