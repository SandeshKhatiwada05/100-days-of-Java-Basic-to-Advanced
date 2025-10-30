package org.javafx.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LayoutExamples extends Application {

    @Override
    public void start(Stage stage) {
        // Uncomment one layout at a time to run

        //Scene scene = new Scene(flowPaneExample(), 400, 200);
        //Scene scene = new Scene(borderPaneExample(), 400, 300);
        //Scene scene = new Scene(hboxExample(), 400, 100);
        //Scene scene = new Scene(vboxExample(), 200, 250);
        Scene scene = new Scene(gridPaneExample(), 300, 200);

        stage.setTitle("JavaFX Layout Examples");
        stage.setScene(scene);
        stage.show();
    }

    // 1. FlowPane example
    private FlowPane flowPaneExample() {
        FlowPane flow = new FlowPane();
        flow.setHgap(10);
        flow.setVgap(10);

        for (int i = 1; i <= 5; i++) {
            flow.getChildren().add(new Button("Btn " + i));
        }
        return flow;
    }

    // 2. BorderPane example
    private BorderPane borderPaneExample() {
        BorderPane border = new BorderPane();

        Button top = new Button("Top");
        Button bottom = new Button("Bottom");
        Button left = new Button("Left");
        Button right = new Button("Right");
        Button center = new Button("Center");

        border.setTop(top);
        border.setBottom(bottom);
        border.setLeft(left);
        border.setRight(right);
        border.setCenter(center);

        return border;
    }

    // 3. HBox example
    private HBox hboxExample() {
        HBox hbox = new HBox(10); // spacing 10 px

        for (int i = 1; i <= 5; i++) {
            hbox.getChildren().add(new Button("Btn " + i));
        }
        return hbox;
    }

    // 4. VBox example
    private VBox vboxExample() {
        VBox vbox = new VBox(10); // spacing 10 px

        for (int i = 1; i <= 5; i++) {
            vbox.getChildren().add(new Button("Btn " + i));
        }
        return vbox;
    }

    // 5. GridPane example
    private GridPane gridPaneExample() {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        // place 5 buttons in grid: 2 rows x 3 cols (one empty cell)
        grid.add(new Button("Btn 1"), 0, 0);
        grid.add(new Button("Btn 2"), 1, 0);
        grid.add(new Button("Btn 3"), 2, 0);
        grid.add(new Button("Btn 4"), 0, 1);
        grid.add(new Button("Btn 5"), 1, 1);

        return grid;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
