package controller;

import java.sql.Connection;

interface ConnectSQL {
    ConnectDatabase connectDatabase = new ConnectDatabase();
    Connection conn = connectDatabase.openConnection();
}
