module com.example.proyectofinal_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires postgresql;


    opens com.example.proyectofinal_1 to javafx.fxml;
    exports com.example.proyectofinal_1;
}