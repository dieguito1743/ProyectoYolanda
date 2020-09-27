package Sistema.model.bo;

import Sistema.model.bean.Correlativos;
import Sistema.model.dao.Conexion;
import Sistema.model.dao.CorrelativosDaoImp;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class SerieNumeroDocumento {
    public static DefaultTableModel obtenerSerieyNumeroDocumento(int tipo) throws Exception{
        DefaultTableModel serNumDocTableModel = null;
        Connection con = Conexion.getConexion();
        try{
        CorrelativosDaoImp serieDocumDao = new CorrelativosDaoImp(con);
        Vector datos = serieDocumDao.obtenerSiguienteCorrelativoCargo(tipo);
        Vector columnas = new Vector();
            columnas.add("IDCORRELATIVO");
            columnas.add("IDDOCUMENTO");
            columnas.add("CORRELATIVO");
            columnas.add("ANIOS");
            columnas.add("ESTADO");
       serNumDocTableModel = new DefaultTableModel(datos,columnas);
        }catch(Exception e){
            throw e;
        }finally{
          if(con!=null)
              con.close();
        }
        return serNumDocTableModel;
    }    

     public static boolean actualizarSeries(Correlativos oSerieDocumento)throws Exception{
        Connection con = null;
        try {            
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            CorrelativosDaoImp serieDocumDao = new CorrelativosDaoImp(con);
//            serieDocumDao.ActualizarSerieDoc(oSerieDocumento);
            con.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
            throw e;
        }finally{
            if(con!=null)
                con.close();
        }
    }
}
