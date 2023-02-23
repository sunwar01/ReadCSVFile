package com.example.readcsvfile;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.sql.*;

public class ReadFile {

    private static Connection connection;


    public void ReadFileMethod() throws IOException, SQLException {


        connection = DatabaseConnection.getInstance().getConnection();

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\SW\\Desktop\\ReadCSVFile\\src\\main\\resources\\data.txt"));

        PreparedStatement pstmt = connection.prepareStatement("INSERT INTO Persons VALUES (?,?,?);");

        connection.setAutoCommit(false);

        String line = "";

        String splitBy = ",";

        int count = 0;

        while ((line = br.readLine()) != null)
        {
            String[] Persons = line.split(splitBy);



            pstmt.setString(1, Persons[0]);

            pstmt.setString(2, Persons[1]);

            pstmt.setString(3, Persons[2]);


            pstmt.addBatch();

        }






        pstmt.executeBatch();


        connection.commit();

       // sc.close();
    }





}






