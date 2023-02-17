package com.example.proyecto_discotecas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Button onHelloButtonClick;

    @FXML
    private Label welcomeText;

    public void up(ActionEvent e) {
        welcomeText.setText("Hola mundo");
    }
}