
package Sistema.model.bo;

import Sistema.model.bean.NumeracionDoc;
import Sistema.model.dao.Conexion;
import Sistema.model.dao.NumeracionDocDaoImp;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class NumeracionDocBo {
    public static boolean grabarNumeracionDoc(NumeracionDoc oNumeracionDoc) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            NumeracionDocDaoImp NumeracionDocDao = new NumeracionDocDaoImp(con);
            NumeracionDocDao.grabar(oNumeracionDoc);
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

    public static boolean modificarNumeracionDoc(NumeracionDoc oNumeracionDoc) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            NumeracionDocDaoImp NumeracionDocDao = new NumeracionDocDaoImp(con);
           NumeracionDocDao.modificar(oNumeracionDoc);
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

    public static boolean eliminarNumeracionDoc(NumeracionDoc oNumeracionDoc) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
           NumeracionDocDaoImp   NumeracionDocDao = new   NumeracionDocDaoImp(con);
              NumeracionDocDao.eliminar(oNumeracionDoc);
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

    public static DefaultTableModel obtenerListaNumeracionDoc() throws Exception {
        DefaultTableModel NumeracionDocTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            NumeracionDocDaoImp NumeracionDocDao = new NumeracionDocDaoImp(con);
            Vector datosNumeracionDoc =   NumeracionDocDao.obtenerListaNumeracionDoc();
            Vector columnas = new Vector();
            columnas.add("IDNUMERACIONDOC");
            columnas.add("NUMERACIONDOC");
            columnas.add("IDAREA");
            columnas.add("IDTIPODOCUMENTO");
            columnas.add("ENTERO");
           NumeracionDocTableModel = new DefaultTableModel(datosNumeracionDoc, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return NumeracionDocTableModel;
    }

    public static DefaultTableModel obtenerListaNumeracionDocBuscar(String texto) throws Exception {
        DefaultTableModel NumeracionDocTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            NumeracionDocDaoImp NumeracionDocDao = new NumeracionDocDaoImp(con);
            Vector datosNumeracionDoc = NumeracionDocDao.obtenerListaNumeracionDoc();
            Vector columnas = new Vector();
            columnas.add("IDNUMERACIONDOC");
            columnas.add("NUMERACIONDOC");
            columnas.add("IDAREA");
            columnas.add("IDTIPODOCUMENTO");
            columnas.add("ENTERO");
            NumeracionDocTableModel = new DefaultTableModel(datosNumeracionDoc, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return NumeracionDocTableModel;
    }

    public static DefaultComboBoxModel obtenerModeloNumeracionDoc() throws Exception {
        DefaultComboBoxModel NumeracionDocComboModel = null;
        Connection con = Conexion.getConexion();
        try {
           NumeracionDocDaoImp cargoDao = new NumeracionDocDaoImp(con);
//            Vector vectorCARGO = cargoDao.obtenerListaComboCargo();
            Vector columnas = new Vector();
//            cargoComboModel = new DefaultComboBoxModel(vectorCliente);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return NumeracionDocComboModel;
    }

    public static DefaultTableModel obtenerListaNumeracionDoc(String nombre) throws Exception {
        DefaultTableModel NumeracionDocTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            NumeracionDocDaoImp  NumeracionDocDao = new NumeracionDocDaoImp(con);
            Vector datosNumeracionDoc =  NumeracionDocDao.obtenerListaNumeracionDoc();
            Vector columnas = new Vector();
             columnas.add("IDNUMERACIONDOC");
            columnas.add("NUMERACIONDOC");
            columnas.add("IDAREA");
            columnas.add("IDTIPODOCUMENTO");
            columnas.add("ENTERO");
            NumeracionDocTableModel = new DefaultTableModel(datosNumeracionDoc, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return NumeracionDocTableModel;
    }
    public static DefaultTableModel buscarNumeracionDoc(int codigo) throws Exception{
        DefaultTableModel  NumeracionDocTableModel = null;
        Connection con = Conexion.getConexion();
        try{
        NumeracionDocDaoImp  NumeracionDocDao = new  NumeracionDocDaoImp(con);
         Vector datosNumeracionDoc =  NumeracionDocDao.obtenerListaNumeracionDoc();
        Vector columnas = new Vector();
            columnas.add("CARGO");
            columnas.add("DOCUMENTO");
            columnas.add("FECHA");
            columnas.add("HORA");
            columnas.add("AREA");
            columnas.add("RECEPCIONISTA");
          NumeracionDocTableModel = new DefaultTableModel(datosNumeracionDoc, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return  NumeracionDocTableModel;
    }
}
