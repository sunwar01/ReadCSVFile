package com.example.readcsvfile.controllers;

import com.example.readcsvfile.ReadFile;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.sql.SQLException;

public class ReadCSVController {


    private final ReadFile RF = new ReadFile();

    @FXML
    private TableView<?> personsTableView;

    @FXML
    private Button readFileButton;

    @FXML
    private TableColumn<?, String> tableColumnAge;

    @FXML
    private TableColumn<?, String> tableColumnFirstName;

    @FXML
    private TableColumn<?, String> tableColumnLastName;

    @FXML
    private TableColumn<?, String> tableColumnPersonID;


    public ReadCSVController() {
    }


    public void initializeTableView(){




    }


    public void initialize() throws IOException, SQLException {
        RF.ReadFileMethod();
    }


}