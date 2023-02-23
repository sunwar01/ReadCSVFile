package com.example.readcsvfile;
import java.io.*;
import java.util.Scanner;
import java.sql.*;

public class ReadFile {

    private static Connection connection;


    public void ReadFileMethod() throws IOException, SQLException {

        connection = DatabaseConnection.getInstance().getConnection();
        connection.setAutoCommit(false);
        PreparedStatement pstmt = connection.prepareStatement("INSERT INTO Persons VALUES (?,?,?);");

        Scanner sc = new Scanner(new FileReader("C:\\Users\\SW\\Desktop\\ReadCSVFile\\src\\main\\resources\\data.txt"));
        sc.useDelimiter(",");



        while (sc.hasNext())
        {
            pstmt.setString(1, sc.next());

            pstmt.setString(2, sc.next());

            pstmt.setString(3, sc.next());

            pstmt.addBatch();
        }

        pstmt.executeBatch();

        connection.commit();

        sc.close();
    }





}






