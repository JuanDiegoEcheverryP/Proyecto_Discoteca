package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.util.ArrayList;

public class HelloController {
    @FXML
    private TableColumn<Discoteca,String>   Nombre;
    @FXML
    private TableColumn<Discoteca,String>   Ubicacion;
    @FXML
    private TableColumn<Discoteca,String>   Descripcion;
    @FXML
    private TextField                       campoBuscar;
    @FXML
    private TableView<Discoteca>            tablaBuscar;
    @FXML
    private Button minimizar;
    ArrayList<Discoteca>                    listar = new ArrayList<>();
    ObservableList<Discoteca>               actualizarDiscoteca;

    @FXML
    void initialize() throws SQLException {
        actualizarDiscoteca=FXCollections.observableArrayList();
        setUpTabla();

        listar=negocioBuscarDiscoteca.getDiscotecas();

        negocioBuscarDiscoteca.popularTabla(listar,tablaBuscar);
    }

    private void setUpTabla(){
        Nombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        Ubicacion.setCellValueFactory(new PropertyValueFactory<>("Ubicacion"));
        Descripcion.setCellValueFactory(new PropertyValueFactory<>("Descripcion"));
    }

    public void actualizar() throws SQLException {
        String busquedaNombre= campoBuscar.getText();

        tablaBuscar.getItems().clear();
        tablaBuscar.refresh();

        listar.clear();
        listar=negocioBuscarDiscoteca.getDiscotecas(busquedaNombre);

        negocioBuscarDiscoteca.popularTabla(listar,tablaBuscar);
    }

    public void cerrarVentana() {
        javafx.application.Platform.exit();
    }

    public void minimizarVentana() {
        Stage stage = (Stage) minimizar.getScene().getWindow();
        stage.setIconified(true);
    }
}
