package Sistema.model.dao;


import Sistema.model.bean.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class EmpleadoDaoImp {

    private PreparedStatement pst;
    private Statement st;
    private Connection con;
    private Empleado oEmpleado;

    public EmpleadoDaoImp(Connection con) {
        this.con = con;
    }

    public Vector obtenerListaEmpleados() throws SQLException {
        Vector listaEmpleado = new Vector();
        String sql = "SELECT idEmpleado,RazonSocial,RUCDNI,Telefono,correo,estado FROM dbo.Empleado";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oEmpleado = new Vector();
            oEmpleado.add(rs.getInt(1));
            oEmpleado.add(rs.getString(2));
            oEmpleado.add(rs.getString(3));
            oEmpleado.add(rs.getString(4));
            oEmpleado.add(rs.getString(5));
             oEmpleado.add(rs.getInt(6));
            listaEmpleado.add(oEmpleado);
        }
        return listaEmpleado;
 }

    public Vector obtenerListaEmpleadosBuscar(String texto) throws SQLException {
        Vector listaEmpleado = new Vector();
        String sql = "SELECT idEmpleado,RazonSocial,RUCDNI,Telefono,correo,estado FROM dbo.Empleado WHERE RazonSocial LIKE '%"+texto+"%'";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector oEmpleado = new Vector();
            oEmpleado.add(rs.getInt(1));
            oEmpleado.add(rs.getString(2));
            oEmpleado.add(rs.getString(3));
            oEmpleado.add(rs.getString(4));
            oEmpleado.add(rs.getString(5));
             oEmpleado.add(rs.getInt(6));
            listaEmpleado.add(oEmpleado);
        }
        return listaEmpleado;
 }


    public Vector buscarEmpleado(int codigo) throws SQLException {
        Vector listaEmpleado = new Vector();
        String sql = "Select idEmpleado,RazonSocial,RUCDNI,Telefono,correo,estado"
                + " from empleado where idEmpleado = " + codigo;
        pst = con.prepareStatement(sql);
        pst.setInt(1, codigo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Vector oEmpleado = new Vector();
            oEmpleado.add(rs.getInt(1));
            oEmpleado.add(rs.getString(2));
            oEmpleado.add(rs.getString(3));
            oEmpleado.add(rs.getString(4));
            oEmpleado.add(rs.getString(5));
             oEmpleado.add(rs.getInt(6));
            listaEmpleado.add(oEmpleado);
        }
        pst.close();
        rs.close();
        return listaEmpleado;
    }

    public boolean grabar(Object object) throws SQLException {
        oEmpleado = (Empleado) object;
        try {
            String sql = "insert into Empleado(RazonSocial,RUCDNI,Telefono,correo,estado) "
                    + "values(?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, oEmpleado.getRazonSocial());
            pst.setString(2, oEmpleado.getRUCDNI());
            pst.setString(3, oEmpleado.getTelefono());
            pst.setString(4, oEmpleado.getCorreo());
            pst.setInt(5, oEmpleado.getEstado());

            pst.execute();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }
 public boolean eliminar(Object object) throws SQLException {
        oEmpleado = (Empleado) object;
        try {
            String sql = "DELETE FROM empleado where idEmpleado = " + oEmpleado.getIdEmpleado();
//            String sql = "UPDATE empleado SET estado=1 where idEmpleado = " + oEmpleado.getIdEmpleado();
            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public boolean modificar(Object object) throws SQLException {
        oEmpleado = (Empleado) object;
        int codigo = oEmpleado.getIdEmpleado();
        try {
            String sql = "UPDATE Empleado SET RazonSocial=?,RUCDNI=?,Telefono=?,correo=?,estado=? WHERE idEmpleado = ? ";
            pst = con.prepareStatement(sql);
            pst.setString(1, oEmpleado.getRazonSocial());
            pst.setString(2, oEmpleado.getRUCDNI());
            pst.setString(3, oEmpleado.getTelefono());
            pst.setString(4, oEmpleado.getCorreo());
            pst.setInt(5, oEmpleado.getEstado());
            pst.setInt(6, oEmpleado.getIdEmpleado());
            pst.executeUpdate();
            pst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public Vector obtenerListaEmpleado() throws SQLException {
        Vector listaEmpleado = new Vector();
        String sql = "select selectidEmpleado,RazonSocial,RUCDNI,Telefono,correo,estado from empleado order by RazonSocial";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
           Empleado empleado= new Empleado();
           empleado.setIdEmpleado(rs.getInt(1));
            empleado.setRazonSocial(rs.getString(2));
            empleado.setRUCDNI(rs.getString(3));
            empleado.setTelefono(rs.getString(4));
            empleado.setCorreo(rs.getString(5));
            listaEmpleado.add(empleado);
        }
        return listaEmpleado;
    }
}
