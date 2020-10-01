package Sistema.model.dao;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection getConexion;

    public static Connection getConexion() throws Exception {
        Connection Con = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Con = DriverManager.getConnection("jdbc:sqlserver://190.119.245.52:4247;databaseName=bdtradoc;user=sa;password=Server1");
        // Con = DriverManager.getConnection("jdbc:sqlserver://PC-PC\\SQLEXPRESS;databaseName=bdtradoc;user=sa;password=921134500");
        // Con = DriverManager.getConnection("jdbc:sqlserver://ROBERTO\\SQLSERVER2016;databaseName=bdtradoc;user=sa;password=123456");
        return Con;
    }

    public static void main(String[] args) {
        try {
            Connection con = Conexion.getConexion();
            JOptionPane.showMessageDialog(null, "Conexion satisfactoria");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
