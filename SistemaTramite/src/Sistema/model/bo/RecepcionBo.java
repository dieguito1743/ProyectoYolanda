package Sistema.model.bo;

import Sistema.model.bean.Recepcion;
import Sistema.model.dao.Conexion;
import Sistema.model.dao.RecepcionDaoImp;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class RecepcionBo {

    public static boolean grabarRecepcion(Recepcion oRecepcion) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            RecepcionDaoImp RecepcionDao = new RecepcionDaoImp(con);
            RecepcionDao.grabar(oRecepcion);
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

    public static boolean eliminarRecepcion(Recepcion oRecepcion) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            RecepcionDaoImp RepcecionDao = new RecepcionDaoImp(con);
            RepcecionDao.eliminar(oRecepcion);
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

    public static boolean modificarRecepcion(Recepcion oRecepcion) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            RecepcionDaoImp RecepcionDao = new RecepcionDaoImp(con);
            RecepcionDao.modificar(oRecepcion);
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

    public static DefaultTableModel obtenerListaRecepcion() throws Exception {
        DefaultTableModel recepcionTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            RecepcionDaoImp RecepcionDao = new RecepcionDaoImp(con);
            Vector datosRecepcion = RecepcionDao.obtenerListaRecepcion();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("REMITENTE");
            columnas.add("INSTITUCION");
            columnas.add("FECHA");
            columnas.add("HORA");
            columnas.add("IDREMIT");
            recepcionTableModel = new DefaultTableModel(datosRecepcion, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return recepcionTableModel;
    }

    public static DefaultTableModel obtenerListaRecepcionBuscar(String texto) throws Exception {
        DefaultTableModel recepcionTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            //idRecepcion,codigoRecepcion,Documento,Institucion,idRemitente,Asunto,Referencia,Destinatario,Obs,Fecha,Hora 
            RecepcionDaoImp RecepcionDao = new RecepcionDaoImp(con);
            Vector datosRecepcion = RecepcionDao.obtenerListaRecepcionBuscar(texto);
            Vector columnas = new Vector();
            columnas.add("IDREC");
            columnas.add("CODREC");
            columnas.add("DOCUMENTO");
            columnas.add("INSTITUCIÓN");
            columnas.add("IDREM");
            columnas.add("ASUNTO");
            columnas.add("REFERENCIA");
            columnas.add("DESTINATARIO");
            columnas.add("OBS");
            columnas.add("FECHA");
            columnas.add("HORA");
            recepcionTableModel = new DefaultTableModel(datosRecepcion, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return recepcionTableModel;
    }

    public static DefaultComboBoxModel obtenerModeloRecepcion() throws Exception {
        DefaultComboBoxModel recepcionComboModel = null;
        Connection con = Conexion.getConexion();
        try {
            RecepcionDaoImp recepcionDao = new RecepcionDaoImp(con);
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
        return recepcionComboModel;
    }

    public static DefaultTableModel obtenerListaRecepcion(String nombre) throws Exception {
        DefaultTableModel recepcionTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            RecepcionDaoImp recepcionDao = new RecepcionDaoImp(con);
            Vector datosRecepcion = recepcionDao.obtenerListaRecepcion();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("REMITENTE");
            columnas.add("INSTITUCION");
            columnas.add("FECHA");
            columnas.add("HORA");
            columnas.add("REMITENTE RESPONSABLE");
            columnas.add("CODIGO REMITENTE");
            recepcionTableModel = new DefaultTableModel(datosRecepcion, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return recepcionTableModel;
    }
    public static DefaultTableModel obtenerListaRecepcionRemitente(String Remitente) throws Exception {
        DefaultTableModel recepcionTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            RecepcionDaoImp recepcionDao = new RecepcionDaoImp(con);
            Vector datosRecepcion = recepcionDao.obtenerListaRecepcionBuscarRemitente(Remitente);
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("REMITENTE");
            columnas.add("INSTITUCION");
            columnas.add("FECHA");
            columnas.add("HORA");
            columnas.add("REMITENTE RESPONSABLE");
             columnas.add("CODIGO REMITENTE");
            recepcionTableModel = new DefaultTableModel(datosRecepcion, columnas);
         } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return recepcionTableModel;
        }
    public static DefaultTableModel buscarRepcion(int codigo) throws Exception {
        DefaultTableModel RecepcionTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            RecepcionDaoImp recepcionDao = new RecepcionDaoImp(con);
            Vector datosRecepcion = recepcionDao.obtenerListaRecepcion();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("REMITENTE");
            columnas.add("INSTITUCION");
            columnas.add("FECHA");
            columnas.add("HORA");
            columnas.add("REMITENTE RESPONSABLE");
             columnas.add("CODIGO REMITENTE");
            RecepcionTableModel = new DefaultTableModel(datosRecepcion, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return RecepcionTableModel;
    }
////Para busquedas de cargo
//    public static DefaultTableModel buscarRecepcionIdRecepcion(int idRecepcion) throws Exception {
//        DefaultTableModel RecepcionTableModel = null;
//        Connection con = Conexion.getConexion();
//        try {
//            RecepcionDaoImp cargoDao = new RecepcionDaoImp(con);
//            Vector datosRecepcion = RecepcionDao.obtenerListaRecepcionBuscarIdRecepcion(idRecepcion);
//            Vector columnas = new Vector();
//            columnas.add("RECEPCIONID");
//            columnas.add("CODIGORECEPCION");
//            columnas.add("DOCUMENTORECEPCION");
//            columnas.add("INSTITUCIONRECEPCION");
//            columnas.add("IDREMITENTERECEPCION");
//            columnas.add("ASUNTORECEPCION");
//            columnas.add("REFERENCIA");
//            columnas.add("DESTINATARIO");
//            columnas.add("OBS");
//            columnas.add("FECHACARGO");
//            columnas.add("HORACARGO");
//   
//            RecepcionTableModel = new DefaultTableModel(datosRecepcion, columnas);
//
//        } catch (Exception e) {
//            throw e;
//        } finally {
//            if (con != null) {
//                con.close();
//            }
        }
      

