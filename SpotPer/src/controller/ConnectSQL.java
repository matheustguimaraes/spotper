package controller;

import java.sql.Connection;

public abstract class ConnectSQL {
    protected ConnectDatabase connectDatabase = new ConnectDatabase();
    protected Connection conn = connectDatabase.openConnection();
}
