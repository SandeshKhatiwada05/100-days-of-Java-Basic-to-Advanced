package org.javafx.schoolmanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/javafx/schoolmanagementsystem/Home.fxml"));
        Scene scene = new Scene(loader.load());

        // Add CSS globally
        scene.getStylesheets().add(getClass()
                .getResource("/org/javafx/schoolmanagementsystem/css/style.css")
                .toExternalForm());

        stage.setTitle("School Management System");
        stage.setScene(scene);
        stage.setMaximized(true); // optional
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
