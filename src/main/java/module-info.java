module org.example.presentation_guided_system {
    requires javafx.fxml;
    requires com.jfoenix;
    requires javafx.controls;


    opens org.example.presentation_guided_system to javafx.fxml;
    exports org.example.presentation_guided_system;
}