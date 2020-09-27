package Sistema.model.bo;

import Sistema.model.bean.Remitente;
import Sistema.model.dao.Conexion;
import Sistema.model.dao.RemitenteDao;
import Sistema.model.dao.RemitenteDaoImp;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class RemitenteBo {

    public static boolean grabarRemitente(Remitente oRemitente) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            RemitenteDaoImp RemitenteDao = new RemitenteDaoImp(con);
            RemitenteDao.grabar(oRemitente);
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

    public static boolean eliminarRemitente(Remitente oRemitente) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            RemitenteDaoImp RemitenteDao = new RemitenteDaoImp(con);
            RemitenteDao.eliminar(oRemitente);
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

    public static boolean modificarRemitente(Remitente oRemitente) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            RemitenteDaoImp EmpleadoDao = new RemitenteDaoImp(con);
            EmpleadoDao.modificar(oRemitente);
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

    public static DefaultTableModel obtenerListaRemitente() throws Exception {
        DefaultTableModel remitenteTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            RemitenteDaoImp RemitenteDao = new RemitenteDaoImp(con);
            Vector datosRemitente = RemitenteDao.obtenerListaRemitente();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("DNI");
            columnas.add("REMITENTE");
            columnas.add("DIRECCION");
            columnas.add("TELEFONO");
            columnas.add("EMAIL");
            remitenteTableModel = new DefaultTableModel(datosRemitente, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return remitenteTableModel;
    }

    public static DefaultTableModel obtenerListaRemitenteBuscar(String texto) throws Exception {
        DefaultTableModel remitenteTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            RemitenteDaoImp RemitenteDao = new RemitenteDaoImp(con);
            Vector datosRemitente = RemitenteDao.obtenerListaRemitenteBuscar(texto);
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("DNI");
            columnas.add("REMITENTE");
            columnas.add("DIRECCION");
            columnas.add("TELEFONO");
            columnas.add("EMAIL");
            remitenteTableModel = new DefaultTableModel(datosRemitente, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return remitenteTableModel;
    }

    public static DefaultComboBoxModel obtenerModeloRemitente() throws Exception {
        DefaultComboBoxModel remitenteComboModel = null;
        Connection con = Conexion.getConexion();
        try {
            RemitenteDaoImp remitenteDao = new RemitenteDaoImp(con);
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

    public static DefaultTableModel obtenerListaRemitente(String nombre) throws Exception {
        DefaultTableModel remitenteTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            RemitenteDaoImp remitenteDao = new RemitenteDaoImp(con);
            Vector datosRemitente = remitenteDao.obtenerListaRemitente();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("DNI");
            columnas.add("REMITENTE");
            columnas.add("DIRECCION");
            columnas.add("TELEFONO");
            columnas.add("EMAIL");
            remitenteTableModel = new DefaultTableModel(datosRemitente, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return remitenteTableModel;
    }

    public static DefaultTableModel obtenerListaRemitenteDNI(String DNI) throws Exception {
        DefaultTableModel remitenteTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            RemitenteDaoImp remitenteDao = new RemitenteDaoImp(con);
            Vector datosRemitente = remitenteDao.obtenerListaRemitenteBuscarDNI(DNI);
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("DNI");
            columnas.add("REMITENTE");
            columnas.add("DIRECCION");
            columnas.add("TELEFONO");
            columnas.add("EMAIL");
            remitenteTableModel = new DefaultTableModel(datosRemitente, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return remitenteTableModel;
    }
    public static DefaultTableModel buscarRemitente(int codigo) throws Exception {
        DefaultTableModel RemitenteTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            RemitenteDaoImp remitenteDao = new RemitenteDaoImp(con);
            Vector datosRemitente = remitenteDao.obtenerListaRemitente();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("DNI");
            columnas.add("REMITENTE");
            columnas.add("DIRECCION");
            columnas.add("TELEFONO");
            columnas.add("EMAIL");
            RemitenteTableModel = new DefaultTableModel(datosRemitente, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return RemitenteTableModel;
    }
}
