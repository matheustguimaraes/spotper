package controller;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Connect with database and return connection
 */

public class ConnectDatabase {
    private Connection conn;

    public ConnectDatabase() {
        String userName = "sa";
        String password = "@admin123";
        String url = "jdbc:sqlserver://localhost;database=spotper";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to database");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
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
        System.out.println("test connection");
        databaseConn.closeConnection();
    }
}
