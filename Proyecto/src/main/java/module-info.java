module com.example.proyecto_discotecas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.proyecto_discotecas to javafx.fxml;
    exports com.example.proyecto_discotecas;
}