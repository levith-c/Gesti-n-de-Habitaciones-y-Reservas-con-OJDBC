package jdbcapp;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleTypes;

public class dbconnection {

    String driver = "oracle.jdbc.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521";
    String user = "system";
    String password = "1979";
    Connection con;

    public dbconnection() {

    }

    public Connection conectar() {

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return con;
    }

}
