package controller;

import java.sql.*;

public class Playlist implements ConnectSQL {
    private final Utils utils = new Utils();

    public void getPlaylist() throws SQLException {
        String sql = "SELECT * FROM playlist";
        utils.printTable(sql);
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