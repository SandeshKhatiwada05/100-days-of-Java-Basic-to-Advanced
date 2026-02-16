package org.javafx.schoolmanagementsystem.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.javafx.schoolmanagementsystem.model.TimetableModel;

import java.net.URL;
import java.util.ResourceBundle;

public class TimetableController implements Initializable {

    @FXML
    private TableView<TimetableModel> timetableTable;

    @FXML
    private TableColumn<TimetableModel, String> timeColumn;

    @FXML
    private TableColumn<TimetableModel, String> mondayColumn;

    @FXML
    private TableColumn<TimetableModel, String> tuesdayColumn;

    @FXML
    private TableColumn<TimetableModel, String> wednesdayColumn;

    @FXML
    private TableColumn<TimetableModel, String> thursdayColumn;

    @FXML
    private TableColumn<TimetableModel, String> fridayColumn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        mondayColumn.setCellValueFactory(new PropertyValueFactory<>("monday"));
        tuesdayColumn.setCellValueFactory(new PropertyValueFactory<>("tuesday"));
        wednesdayColumn.setCellValueFactory(new PropertyValueFactory<>("wednesday"));
        thursdayColumn.setCellValueFactory(new PropertyValueFactory<>("thursday"));
        fridayColumn.setCellValueFactory(new PropertyValueFactory<>("friday"));

        timetableTable.setItems(getTimetableData());
    }

    private ObservableList<TimetableModel> getTimetableData() {
        ObservableList<TimetableModel> list = FXCollections.observableArrayList();

        list.add(new TimetableModel("08:00-09:00", "Math", "English", "Science", "History", "Computer"));
        list.add(new TimetableModel("09:00-10:00", "Physics", "Math", "English", "Geography", "Chemistry"));
        list.add(new TimetableModel("10:00-11:00", "Chemistry", "Computer", "Math", "English", "Biology"));
        list.add(new TimetableModel("11:00-12:00", "History", "Physics", "Geography", "Math", "English"));
        list.add(new TimetableModel("12:00-13:00", "Biology", "Chemistry", "Computer", "Physics", "Math"));

        return list;
    }
}
