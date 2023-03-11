module com.example.testconexion {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.proyectoDiscoteca to javafx.fxml;
    exports com.example.proyectoDiscoteca;
}