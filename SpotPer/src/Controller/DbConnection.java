package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Connect with database and return connection
 */

public class DbConnection {
    public static Connection getConnection() {
        Connection conn = null;
        String userName = "SA";
        String password = "password";
        String ds = "spotper";
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=" + ds;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to database '" + ds + "'");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Failed connection with database '" + ds + "'",
                    "Message",
                    JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }

    public static void closeConnection(Connection conn) {
        try {
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Connection co = DbConnection.getConnection();
        System.out.println("test connection");
        DbConnection.closeConnection(co);
    }
}
