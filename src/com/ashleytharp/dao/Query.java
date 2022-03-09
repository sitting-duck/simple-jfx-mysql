package com.ashleytharp.dao;

import java.sql.Statement;

import java.sql.ResultSet;

import static com.ashleytharp.dao.DBConnection.conn;

/**
 * Project: Ashley Tharp DAODemo2022
 * Package: sample.model
 * <p>
 * User: Ashley Tharp
 * Date: 03/08/2022
 * <p>
 * Created with IntelliJ IDEA
 */
public class Query {
    private static String query;
    private static Statement stmt;
    private static ResultSet result;

    public static void makeQuery(String q){
        query =q;
        try{
            stmt=conn.createStatement();
            // determine query execution
            if(query.toLowerCase().startsWith("select"))
                result=stmt.executeQuery(q);
            if(query.toLowerCase().startsWith("delete")||query.toLowerCase().startsWith("insert")||query.toLowerCase().startsWith("update"))
                stmt.executeUpdate(q);

        }
        catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
    }
    public static ResultSet getResult(){
        return result;
    }
}
