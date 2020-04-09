package controller;

import java.sql.*;

public class Album extends ConnectSQL {

    public void getAlbum() throws SQLException {
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM album";
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
