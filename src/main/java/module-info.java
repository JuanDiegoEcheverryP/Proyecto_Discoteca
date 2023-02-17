module com.example.proyecto_discotecas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyecto_discotecas to javafx.fxml;
    exports com.example.proyecto_discotecas;
}