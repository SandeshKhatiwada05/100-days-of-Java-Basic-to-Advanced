package org.javafx.schoolmanagementsystem.model;

import javafx.beans.property.SimpleStringProperty;

public class TimetableModel {

    private final SimpleStringProperty time;
    private final SimpleStringProperty monday;
    private final SimpleStringProperty tuesday;
    private final SimpleStringProperty wednesday;
    private final SimpleStringProperty thursday;
    private final SimpleStringProperty friday;

    public TimetableModel(String time, String monday, String tuesday, String wednesday, String thursday, String friday) {
        this.time = new SimpleStringProperty(time);
        this.monday = new SimpleStringProperty(monday);
        this.tuesday = new SimpleStringProperty(tuesday);
        this.wednesday = new SimpleStringProperty(wednesday);
        this.thursday = new SimpleStringProperty(thursday);
        this.friday = new SimpleStringProperty(friday);
    }

    public String getTime() { return time.get(); }
    public String getMonday() { return monday.get(); }
    public String getTuesday() { return tuesday.get(); }
    public String getWednesday() { return wednesday.get(); }
    public String getThursday() { return thursday.get(); }
    public String getFriday() { return friday.get(); }
}
