module com.example.readcsvfile {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.readcsvfile to javafx.fxml;
    exports com.example.readcsvfile;
    exports com.example.readcsvfile.controllers;
    opens com.example.readcsvfile.controllers to javafx.fxml;
}