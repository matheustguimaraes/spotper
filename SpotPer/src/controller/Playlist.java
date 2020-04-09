package controller;

import java.sql.*;

public class Playlist extends ConnectSQL {

    public void getPlaylist() throws SQLException {
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM playlist";
        ResultSet rs = stmt.executeQuery(sql);
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();

        while (rs.next()) {

            for (int i = 1; i <= columnsNumber; i++) {
                if (i > 1) System.out.print(",  ");
                String columnValue = rs.getString(i);
                System.out.print(columnValue + " " + rsmd.getColumnName(i));
            }
            System.out.println("");
        }
        rs.close();
        connectDatabase.closeConnection();

        System.out.println("Goodbye!");
    }

    public void addPlaylist(int id, String nome, String dtCriacao, double tmpTotalExecucao) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("insert into playlist " +
                "(id, nome, dt_criacao, tempo_total_execucao) " +
                "values (?, ?, ?, ?)");
        stmt.setInt(1, id);
        stmt.setString(2, nome);
        stmt.setString(3, dtCriacao);
        stmt.setDouble(4, tmpTotalExecucao);
        stmt.executeUpdate();
    }


    public static void main(String[] args) throws SQLException {
        Playlist playlist = new Playlist();
//        playlist.addPlaylist(3, "playlist rock", "2019-11-12", 32.15);
        playlist.getPlaylist();
    }
}