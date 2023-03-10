module com.example.testconexion {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.testconexion to javafx.fxml;
    exports com.example.testconexion;
}