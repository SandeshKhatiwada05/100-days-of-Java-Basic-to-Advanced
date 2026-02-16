package org.javafx.schoolmanagementsystem.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnLogin;

    @FXML
    private void handleLogin(ActionEvent event) {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        // For now, simple hardcoded validation
        if (username.equals("admin") && password.equals("admin123")) {
            try {
                // Load Home.fxml after successful login
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/javafx/schoolmanagementsystem/Home.fxml"));
                AnchorPane root = loader.load();

                Stage stage = (Stage) btnLogin.getScene().getWindow();
                Scene scene = new Scene(root);
                scene.getStylesheets().add(getClass().getResource("/org/javafx/schoolmanagementsystem/css/style.css").toExternalForm());
                stage.setScene(scene);
                stage.setMaximized(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            // Simple feedback for wrong credentials
            txtUsername.clear();
            txtPassword.clear();
            txtUsername.setPromptText("Invalid credentials!");
        }
    }
}
