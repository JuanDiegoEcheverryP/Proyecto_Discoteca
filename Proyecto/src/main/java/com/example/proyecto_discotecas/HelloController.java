package com.example.proyecto_discotecas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloController {
    @FXML
    private Button botonBuscar;
    @FXML
    private Label testLabel;
    @FXML
    void onActionBuscar(ActionEvent event) {
        //TODO: Codigo temporal para testear la conexion con la base de datos
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();
        String verifyLogin = "SELECT * FROM user_account";
        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResultset = statement.executeQuery(verifyLogin);
            testLabel.setText("Conexion exitosa");
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        //TODO: Codigo temporal para testear la conexion con la base de datos
    }
}