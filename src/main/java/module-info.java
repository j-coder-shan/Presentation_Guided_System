module org.example.presentation_guided_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.presentation_guided_system to javafx.fxml;
    exports org.example.presentation_guided_system;
}