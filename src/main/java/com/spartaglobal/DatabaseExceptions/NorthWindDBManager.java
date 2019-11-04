package com.spartaglobal.DatabaseExceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Connects to the NW Database using the username aand password from the properties manager prevents duplication,

public class NorthWindDBManager {
    private PropertiesManager props = new PropertiesManager();
    private final String CONNECTIONURL = "jdbc:sqlserver://localhost:1433;databaseName=northwind;user=" + props.getUsername() + ";password=" + props.getPassword();
    public Connection northwindConnection() throws SQLException {
        return DriverManager.getConnection(CONNECTIONURL);
    }
}
