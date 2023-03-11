package com.example.proyectoDiscoteca;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import org.w3c.dom.events.MouseEvent;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloController {

    @FXML
    private TableColumn<?, ?> C1;

    @FXML
    private TableColumn<?, ?> C2;

    @FXML
    private ImageView botonBuscar;

    @FXML
    private TextField campoBuscar;

    @FXML
    private TableView<?> tablaBuscar;

    @FXML
    private Button testLabel;

    @FXML
    void initialize() {
        //TODO: Codigo temporal para testear la conexion con la base de datos
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();
        String verifyLogin = "SELECT * FROM tablaTest";
        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResultset = statement.executeQuery(verifyLogin);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
            System.out.println("Conexion fallida");
        }

        DatabaseConnection.desconectar();
        //TODO: Codigo temporal para testear la conexion con la base de datos
    }

    public void onActionBuscar() {
        System.out.println("Click");
        testLabel.setText("Hola");
    }
}