package com.example.testconexion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Label loginMessageLabel;
    public void loginButtonOnAction(ActionEvent event) {
        validateLogin();
    }

    public void validateLogin() {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "SELECT * FROM tablaTest";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResultset = statement.executeQuery(verifyLogin);

            loginMessageLabel.setText("Se conecta");
        } catch (Exception e) {
            loginMessageLabel.setText("Error de conexion");
            e.printStackTrace();
            e.getCause();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}