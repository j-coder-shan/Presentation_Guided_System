package org.example.presentation_guided_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class opening {

    @FXML
    private CheckBox checkBox_lecturer;

    @FXML
    private CheckBox checkBox_student;

    @FXML
    private Button loginButton;

    @FXML
    private AnchorPane login_pane;

    @FXML
    private Button signUpButton;

    @FXML
    private Button backButton;

    @FXML
    private AnchorPane signUpPane;

    @FXML
    private TextField signUp_IDField;

    @FXML
    private TextField signUp_nameField;

    @FXML
    private PasswordField signUp_passwordField1;

    @FXML
    private PasswordField signUp_passwordField2;

    @FXML
    private TextField userIDField;

    @FXML
    void login(ActionEvent event) {

    }

    @FXML
    void signup(ActionEvent event) {
        login_pane.setVisible(false);
        signUpPane.setVisible(true);
    }
    @FXML
    void successfullySignedUp(ActionEvent event) {
        login_pane.setVisible(true);
        signUpPane.setVisible(false);
    }
    @FXML
    void goBack(ActionEvent event) {
        login_pane.setVisible(true);
        signUpPane.setVisible(false);
    }


}
