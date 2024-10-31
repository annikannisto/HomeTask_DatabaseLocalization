module org.example.databaselocalization {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;


    opens org.example.databaselocalization to javafx.fxml;
    exports org.example.databaselocalization;
}