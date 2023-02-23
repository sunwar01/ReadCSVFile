package com.example.readcsvfile;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ReadCSVController {


    private final ReadFile RF = new ReadFile();
    @FXML
    private Label welcomeText;

    public ReadCSVController() throws SQLException {
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    public void initialize() throws IOException, SQLException {
        RF.ReadFileMethod();


    }


}