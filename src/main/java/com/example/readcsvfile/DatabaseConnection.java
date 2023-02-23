package com.example.readcsvfile;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static DatabaseConnection instance;

    private Connection connection;

    private DatabaseConnection(){
        try {
            String url = "jdbc:sqlserver://DESKTOP-DEI896B:1433;DatabaseName=ReadCSV;user=sa;password=Lukasersej123!;encrypt=true;trustServerCertificate=true;";
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println("can not create connection");
            System.out.println(e.getMessage());
        }

        System.out.println("connected to DB");

    }

    public Connection getConnection(){
        return connection;
    }

    public static DatabaseConnection getInstance() throws SQLException {

        if (instance == null){
            instance = new DatabaseConnection();
        } else if (instance.getConnection().isClosed()){
            instance = new DatabaseConnection();
        }

        return instance;
    }


}
