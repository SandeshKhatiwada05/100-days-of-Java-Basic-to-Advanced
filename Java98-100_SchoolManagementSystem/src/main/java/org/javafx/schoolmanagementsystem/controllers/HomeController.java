package org.javafx.schoolmanagementsystem.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HomeController {
    @FXML
    private void initialize() {
        mainPane.getChildren().clear(); // nothing loaded initially
    }


    @FXML
    private AnchorPane mainPane;

    @FXML
    private void handleDashboard() {
        loadFXML("Dashboard.fxml");
    }

    @FXML
    private void handleStudents() {
        loadFXML("Students.fxml");
    }

    @FXML
    private void handleTimetable() {
        loadFXML("Timetable.fxml");
    }

    /**
     * Load FXML into mainPane safely
     *
     * @param fxmlFile the FXML file name in same package
     */
    private void loadFXML(String fxmlFile) {
        try {
            Node node = FXMLLoader.load(
                    getClass().getResource("/org/javafx/schoolmanagementsystem/" + fxmlFile)
            );
            mainPane.getChildren().setAll(node);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to load FXML: " + fxmlFile);
        }
    }

}
