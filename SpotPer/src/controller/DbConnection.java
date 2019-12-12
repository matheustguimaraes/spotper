package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Connect with database and return connection
 */

public class DbConnection {
    private Connection conn;

    public DbConnection(Connection conn) {
        this.conn = conn;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public static Connection getConnection() {
        Connection conn = null;
        String userName = "sa";
        String password = "@admin123";
        String database = "spotper";
        String url = "jdbc:sqlserver://localhost;database=spotper";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to database");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Failed connection with database",
                    "Message",
                    JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }

    public static void closeConnection(Connection conn) {
        try {
            conn.close();
            System.out.println("Connection to database closed");
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
