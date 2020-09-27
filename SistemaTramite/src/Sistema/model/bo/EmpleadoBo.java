package Sistema.model.bo;


import Sistema.model.bean.Empleado;

import Sistema.model.dao.Conexion;
import Sistema.model.dao.EmpleadoDao;
import Sistema.model.dao.EmpleadoDaoImp;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class EmpleadoBo {

    public static boolean grabarEmpleado(Empleado oEmpleado) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            EmpleadoDaoImp empleadoDao = new EmpleadoDaoImp(con);
            empleadoDao.grabar(oEmpleado);
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

    public static boolean modificarEmpleado(Empleado oEmpleado) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            EmpleadoDaoImp EmpleadoDao = new EmpleadoDaoImp(con);
            EmpleadoDao.modificar(oEmpleado);
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

    public static boolean eliminarEmpleado(Empleado oEmpleado) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            EmpleadoDaoImp EmpleadoDao = new EmpleadoDaoImp(con);
            EmpleadoDao.eliminar(oEmpleado);
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

    public static DefaultTableModel obtenerListaEmpleado() throws Exception {
        DefaultTableModel empleadoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            EmpleadoDaoImp EmpleadoDao = new EmpleadoDaoImp(con);
            Vector datosEmpleado = EmpleadoDao.obtenerListaEmpleados();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("RAZON SOCIAL");
            columnas.add("RUCDNI");
            columnas.add("TELEFONO");
            columnas.add("EMAIL");
            columnas.add("ESTADO");
            empleadoTableModel = new DefaultTableModel(datosEmpleado, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return empleadoTableModel;
    }

    public static DefaultTableModel obtenerListaEmpleadoBuscar(String texto) throws Exception {
        DefaultTableModel empleadoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            EmpleadoDaoImp EmpleadoDao = new EmpleadoDaoImp(con);
            Vector datosEmpleado = EmpleadoDao.obtenerListaEmpleadosBuscar(texto);
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("RAZON SOCIAL");
            columnas.add("RUCDNI");
            columnas.add("TELEFONO");
            columnas.add("EMAIL");
            columnas.add("ESTADO");
            empleadoTableModel = new DefaultTableModel(datosEmpleado, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return empleadoTableModel;
    }

    public static DefaultComboBoxModel obtenerModeloEmpleado() throws Exception {
        DefaultComboBoxModel empleadoComboModel = null;
        Connection con = Conexion.getConexion();
        try {
            EmpleadoDaoImp empleadoDao = new EmpleadoDaoImp(con);
//            Vector vectorEmpleado = empleadoDao.obtenerListaComboEmpleado();
            Vector columnas = new Vector();
//            empleadoComboModel = new DefaultComboBoxModel(vectorCliente);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return empleadoComboModel;
    }

    public static DefaultTableModel obtenerListaEmpleado(String nombre) throws Exception {
        DefaultTableModel empleadoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            EmpleadoDaoImp empleadoDao = new EmpleadoDaoImp(con);
            Vector datosEmpleado = empleadoDao.obtenerListaEmpleados();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("RAZON_SOCIAL");
            columnas.add("RUCDNI");
            columnas.add("TELEFONO");
            columnas.add("EMAIL");
            columnas.add("ESTADO");
            empleadoTableModel = new DefaultTableModel(datosEmpleado, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return empleadoTableModel;
    }

    public static DefaultTableModel buscarEmpleado(int codigo) throws Exception {
        DefaultTableModel EmpleadoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            EmpleadoDaoImp empleadoDao = new EmpleadoDaoImp(con);
            Vector datosEmpleado = empleadoDao.obtenerListaEmpleados();
            Vector columnas = new Vector();
            columnas.add("CODIGO");
            columnas.add("RAZON_SOCIAL");
            columnas.add("RUCDNI");
            columnas.add("TELEFONO");
            columnas.add("EMAIL");
            columnas.add("ESTADO");
            EmpleadoTableModel = new DefaultTableModel(datosEmpleado, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return EmpleadoTableModel;
    }
}
