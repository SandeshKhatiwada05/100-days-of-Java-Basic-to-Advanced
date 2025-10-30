package org.javafx.javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;
import java.io.File;

public class AllControlsExample extends Application {

    @Override
    public void start(Stage stage) {
        // Root layout
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));

        // 1. Label
        Label label = new Label("Enter your name:");

        // 2. TextField
        TextField textField = new TextField();
        textField.setPromptText("Your name here");

        // 3. Button
        Button button = new Button("Submit");
        button.setTooltip(new Tooltip("Click to submit your name")); // 8. Tooltip

        // 4. Radio Buttons
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        ToggleGroup genderGroup = new ToggleGroup();
        male.setToggleGroup(genderGroup);
        female.setToggleGroup(genderGroup);

        // 5. CheckBox
        CheckBox agree = new CheckBox("I agree to the terms");

        // 6. Hyperlink
        Hyperlink link = new Hyperlink("Visit OpenAI");
        link.setOnAction(e -> System.out.println("Opening: https://openai.com"));

        // 7. Menu
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem openItem = new MenuItem("Open File");
        MenuItem exitItem = new MenuItem("Exit");
        fileMenu.getItems().addAll(openItem, exitItem);
        menuBar.getMenus().add(fileMenu);

        // 9. FileChooser
        FileChooser fileChooser = new FileChooser();
        openItem.setOnAction(e -> {
            File file = fileChooser.showOpenDialog(stage);
            if (file != null) {
                System.out.println("Selected file: " + file.getAbsolutePath());
            }
        });

        // Button action
        button.setOnAction(e -> {
            String name = textField.getText();
            String gender = (male.isSelected()) ? "Male" :
                    (female.isSelected()) ? "Female" : "Not selected";
            boolean isAgreed = agree.isSelected();

            System.out.println("Name: " + name);
            System.out.println("Gender: " + gender);
            System.out.println("Agreed: " + isAgreed);
        });

        // Layout for form controls
        HBox genderBox = new HBox(10, male, female);
        root.getChildren().addAll(menuBar, label, textField, genderBox, agree, button, link);

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("JavaFX Controls Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

