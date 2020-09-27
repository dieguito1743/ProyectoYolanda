
package Sistema.model.bo;

import Sistema.model.bean.Archivo;
import Sistema.model.dao.ArchivoDaoImp;
import Sistema.model.dao.Conexion;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ArchivoBo {
    
 
    public static boolean grabarArchivo(Archivo oArchivo)throws Exception{
     Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            ArchivoDaoImp ArchivoDao = new ArchivoDaoImp(con);
            ArchivoDao.grabar(oArchivo);
            con.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        
    }
        }
      public static boolean eliminarArchivo(Archivo oArchivo) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            ArchivoDaoImp ArchivoDao = new ArchivoDaoImp(con);
            ArchivoDao.eliminar(oArchivo);
            con.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
     public static boolean modificarArchivo(Archivo oArchivo) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            ArchivoDaoImp ArchivoDao = new ArchivoDaoImp(con);
            ArchivoDao.modificar(oArchivo);
            con.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
 public static DefaultTableModel obtenerListaArchivo() throws Exception {
        DefaultTableModel remitenteTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            ArchivoDaoImp ArchivoDao = new ArchivoDaoImp(con);
            Vector datosArchivo = ArchivoDao.obtenerListaArchivo();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("NOMBRE");
            columnas.add("IDDOCUMENTO");
            remitenteTableModel = new DefaultTableModel(datosArchivo, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return remitenteTableModel;
    }
public static DefaultTableModel obtenerListaArchivoBuscar(String texto) throws Exception {
        DefaultTableModel archivoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
           ArchivoDaoImp ArchivoDao = new ArchivoDaoImp(con);
            Vector datosArchivo = ArchivoDao.obtenerListaArchivoBuscar(texto);
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("DNI");
            columnas.add("IDDOCUMENTO");
            archivoTableModel = new DefaultTableModel(datosArchivo, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return archivoTableModel;
    }

   

    public static DefaultComboBoxModel obtenerModeloArhivo() throws Exception {
        DefaultComboBoxModel remitenteComboModel = null;
        Connection con = Conexion.getConexion();
        try {
            ArchivoDaoImp archivoDao = new ArchivoDaoImp(con);
//            Vector vectorRremitente = remitenteDao.obtenerListaComboRemitente();
            Vector columnas = new Vector();
//            empleadoComboModel = new DefaultComboBoxModel(vectorCliente);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return remitenteComboModel;
    }

    public static DefaultTableModel obtenerListaArchivo(String nombre) throws Exception {
        DefaultTableModel archivoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            ArchivoDaoImp archivoDao = new ArchivoDaoImp(con);
            Vector datosArchivo = archivoDao.obtenerListaArchivo();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("NOMBRE");
            columnas.add("IDDOCUMENTO");
            archivoTableModel = new DefaultTableModel(datosArchivo, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return archivoTableModel;
    }
    public static DefaultTableModel buscarArchivo(int codigo) throws Exception{
        DefaultTableModel ArchivoTableModel = null;
        Connection con = Conexion.getConexion();
        try{
      ArchivoDaoImp archivoDao = new ArchivoDaoImp(con);
         Vector datosArchivo = archivoDao.obtenerListaArchivo();
        Vector columnas = new Vector();
         columnas.add("CODIGO");
         columnas.add("NOMBRE");
         columnas.add("IDDOCUMENTO");
          ArchivoTableModel = new DefaultTableModel(datosArchivo, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return ArchivoTableModel;
    }
           }
 
    

