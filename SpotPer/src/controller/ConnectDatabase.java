package controller;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Connect with database and return connection
 */

public class ConnectDatabase {
    private Connection conn;
    private static final String userName = "sa";
    private static final String password = "@admin123";
    private static final String url = "jdbc:sqlserver://localhost;database=spotper";

    public Connection openConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to database");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    public void closeConnection() {
        try {
            conn.close();
            System.out.println("Connection to database closed");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ConnectDatabase databaseConn = new ConnectDatabase();
        databaseConn.openConnection();
        System.out.println("test connection");
        databaseConn.closeConnection();
    }
}
