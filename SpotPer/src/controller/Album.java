package controller;

import java.sql.*;

public class Album implements ConnectSQL {
    private final Utils utils = new Utils();

    public void getAlbum() throws SQLException {
        String sql = "SELECT * FROM album";
        utils.printTable(sql);
    }

    public void addAlbum(int id, int cod_gravadora, String descricao, String tipo_compra,
                         String dt_gravacao, String dt_compra, double preco_compra) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("insert into album " +
                "(id, cod_gravadora, descricao, tipo_compra, dt_gravacao, dt_compra, preco_compra) " +
                "values (?, ?, ?, ?, ?, ?, ?)");
        stmt.setInt(1, id);
        stmt.setInt(2, cod_gravadora);
        stmt.setString(3, descricao);
        stmt.setString(4, tipo_compra);
        stmt.setString(5, dt_gravacao);
        stmt.setString(6, dt_compra);
        stmt.setDouble(7, preco_compra);
        stmt.executeUpdate();
    }

    public static void main(String[] args) throws SQLException {
        Album album = new Album();
        album.getAlbum();
    }
}
