package Sistema.model.bo;

import Sistema.model.bean.Cargo;
import Sistema.model.dao.CargoDaoImp;
import Sistema.model.dao.Conexion;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class CargoBo {

    public static boolean grabarCargo(Cargo oCargo) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            CargoDaoImp cargoDao = new CargoDaoImp(con);
            cargoDao.grabar(oCargo);
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

    public static boolean modificarCargo(Cargo oCargo) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            CargoDaoImp CargoDao = new CargoDaoImp(con);
            CargoDao.modificar(oCargo);
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

    public static boolean eliminarCargo(Cargo oCargo) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            CargoDaoImp CargoDao = new CargoDaoImp(con);
            CargoDao.eliminar(oCargo);
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

    public static DefaultTableModel obtenerListaCargo() throws Exception {
        DefaultTableModel cargoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            CargoDaoImp CargoDao = new CargoDaoImp(con);
            Vector datosCargo = CargoDao.obtenerListaCargo();
            Vector columnas = new Vector();
            columnas.add("CARGO");
            columnas.add("DOCUMENTO");
            columnas.add("FECHA");
            columnas.add("HORA");
            columnas.add("AREA");
            columnas.add("RECEPCIONISTA");
            cargoTableModel = new DefaultTableModel(datosCargo, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return cargoTableModel;
    }

    public static DefaultTableModel obtenerListaCargoBuscar(String texto) throws Exception {
        DefaultTableModel cargoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            CargoDaoImp CargoDao = new CargoDaoImp(con);
            Vector datosCargo = CargoDao.obtenerListaCargo();
            Vector columnas = new Vector();
            columnas.add("CARGO");
            columnas.add("DOCUMENTO");
            columnas.add("FECHA");
            columnas.add("HORA");
            columnas.add("AREA");
            columnas.add("RECEPCIONISTA");
            cargoTableModel = new DefaultTableModel(datosCargo, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return cargoTableModel;
    }

    public static DefaultComboBoxModel obtenerModeloCargo() throws Exception {
        DefaultComboBoxModel cargoComboModel = null;
        Connection con = Conexion.getConexion();
        try {
            CargoDaoImp cargoDao = new CargoDaoImp(con);
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
        return cargoComboModel;
    }

    public static DefaultTableModel obtenerListaCargo(String nombre) throws Exception {
        DefaultTableModel cargoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            CargoDaoImp CargoDao = new CargoDaoImp(con);
            Vector datosCargo = CargoDao.obtenerListaCargo();
            Vector columnas = new Vector();
            columnas.add("CARGO");
            columnas.add("DOCUMENTO");
            columnas.add("FECHA");
            columnas.add("HORA");
            columnas.add("AREA");
            columnas.add("RECEPCIONISTA");
            cargoTableModel = new DefaultTableModel(datosCargo, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return cargoTableModel;
    }

    public static DefaultTableModel buscarCargo(int codigo) throws Exception {
        DefaultTableModel CargoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            CargoDaoImp cargoDao = new CargoDaoImp(con);
            Vector datosCargo = cargoDao.obtenerListaCargo();
            Vector columnas = new Vector();
            columnas.add("CARGO");
            columnas.add("DOCUMENTO");
            columnas.add("FECHA");
            columnas.add("HORA");
            columnas.add("AREA");
            columnas.add("RECEPCIONISTA");
            CargoTableModel = new DefaultTableModel(datosCargo, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return CargoTableModel;
    }

    //Para busquedas de cargo
    public static DefaultTableModel buscarCargosIdCargo(int idCargo) throws Exception {
        DefaultTableModel CargoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            CargoDaoImp cargoDao = new CargoDaoImp(con);
            Vector datosCargo = cargoDao.obtenerListaCagoBuscarIdCargo(idCargo);
            Vector columnas = new Vector();
            columnas.add("CARGOID");
            columnas.add("DOCUMENTOID");
            columnas.add("NRODOC");
            columnas.add("DOCUMENTO");
            columnas.add("FECHACARGO");
            columnas.add("HORACARGO");
            columnas.add("AREACARGO");
            columnas.add("ASUNTO");
            columnas.add("INSTITUCION");
            columnas.add("RECEPCIONISTA");
            columnas.add("ESTADOCARGO");

            CargoTableModel = new DefaultTableModel(datosCargo, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return CargoTableModel;
    }

    public static DefaultTableModel buscarCargosIdDocumento(String numeroDocumento) throws Exception {
        DefaultTableModel CargoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            CargoDaoImp cargoDao = new CargoDaoImp(con);
            Vector datosCargo = cargoDao.obtenerListaCagoBuscarIdDocumento(numeroDocumento);
            Vector columnas = new Vector();
            columnas.add("CARGOID");
            columnas.add("DOCUMENTOID");
            columnas.add("NRODOC");
            columnas.add("DOCUMENTO");
            columnas.add("FECHACARGO");
            columnas.add("HORACARGO");
            columnas.add("AREACARGO");
            columnas.add("ASUNTO");
            columnas.add("INSTITUCION");
            columnas.add("RECEPCIONISTA");
            columnas.add("ESTADOCARGO");

            CargoTableModel = new DefaultTableModel(datosCargo, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return CargoTableModel;
    }

    public static DefaultTableModel buscarCargosDocumento(String documento) throws Exception {
        DefaultTableModel CargoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            CargoDaoImp cargoDao = new CargoDaoImp(con);
            Vector datosCargo = cargoDao.obtenerListaCagoBuscarDocumento(documento);
            Vector columnas = new Vector();
            columnas.add("CARGOID");
            columnas.add("DOCUMENTOID");
            columnas.add("NRODOC");
            columnas.add("DOCUMENTO");
            columnas.add("FECHACARGO");
            columnas.add("HORACARGO");
            columnas.add("AREACARGO");
            columnas.add("ASUNTO");
            columnas.add("INSTITUCION");
            columnas.add("RECEPCIONISTA");
            columnas.add("ESTADOCARGO");

            CargoTableModel = new DefaultTableModel(datosCargo, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return CargoTableModel;
    }

    public static DefaultTableModel buscarCargosDestinatario(String documento) throws Exception {
        DefaultTableModel CargoTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            CargoDaoImp cargoDao = new CargoDaoImp(con);
            Vector datosCargo = cargoDao.obtenerListaCagoBuscarDestinatario(documento);
            Vector columnas = new Vector();
            columnas.add("CARGOID");
            columnas.add("DOCUMENTOID");
            columnas.add("NRODOC");
            columnas.add("DOCUMENTO");
            columnas.add("FECHACARGO");
            columnas.add("HORACARGO");
            columnas.add("AREACARGO");
            columnas.add("ASUNTO");
            columnas.add("INSTITUCION");
            columnas.add("RECEPCIONISTA");
            columnas.add("ESTADOCARGO");

            CargoTableModel = new DefaultTableModel(datosCargo, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return CargoTableModel;
    }
}
