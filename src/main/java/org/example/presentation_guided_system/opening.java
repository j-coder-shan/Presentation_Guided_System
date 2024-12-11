package org.example.presentation_guided_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class opening {

    @FXML
    private AnchorPane anchorPane_login;

    @FXML
    private AnchorPane anchorPane_signUp;

    @FXML
    private Button backButton_signUp;

    @FXML
    private Button loginButton_login;

    @FXML
    private PasswordField passwordField_login;

    @FXML
    private PasswordField password_signUp1;

    @FXML
    private PasswordField password_signUp2;

    @FXML
    private ToggleGroup person;

    @FXML
    private RadioButton radioButton_lecturer;

    @FXML
    private RadioButton radioButton_student;

    @FXML
    private Button signUpButton_signUp;

    @FXML
    private Button signUpButton_login;

    @FXML
    private TextField userIDField_login;

    @FXML
    private TextField userID_signUp;

    @FXML
    void goBackToLogin() {
        anchorPane_login.setVisible(true);
        anchorPane_signUp.setVisible(false);
        userID_signUp.clear();
        password_signUp1.clear();
        password_signUp2.clear();
        radioButton_lecturer.setSelected(false);
        radioButton_student.setSelected(false);
    }

    @FXML
    void login(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        lecturer_interface(stage);
    }

    public void lecturer_interface(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(open.class.getResource("/lecturer.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("PresentEase");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.show();
    }
    @FXML
    void signUp_signUP_pane(ActionEvent event) {

        goBackToLogin();
    }

    @FXML
    void signup_loginPane(ActionEvent event) {
        anchorPane_login.setVisible(false);
        anchorPane_signUp.setVisible(true);
        userIDField_login.clear();
        passwordField_login.clear();
    }



}
