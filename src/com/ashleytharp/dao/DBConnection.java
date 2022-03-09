package com.ashleytharp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Project: Ashley Tharp DAODemo2022
 * Package: sample.model
 * <p>
 * User: Ashley Tharp
 * Date: 03/08/2022
 * <p>
 * Created with IntelliJ IDEA
 */
public class DBConnection {
    private static final String databaseName="client_schedule";
    private static final String DB_URL="jdbc:mysql://localhost:3306/"+databaseName;
    private static final String username="sqlUser";
    private static final String password="Passw0rd!";
    static Connection conn;
    public static void makeConnection() throws ClassNotFoundException, SQLException, Exception{
        conn=(Connection) DriverManager.getConnection(DB_URL,username,password);
    }
    public static void closeConnection() throws ClassNotFoundException,SQLException, Exception{
        conn.close();
    }

}
