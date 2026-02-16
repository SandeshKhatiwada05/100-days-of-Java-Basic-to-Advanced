module org.javafx.schoolmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.javafx.schoolmanagementsystem to javafx.fxml;
    opens org.javafx.schoolmanagementsystem.controllers to javafx.fxml;
    opens org.javafx.schoolmanagementsystem.model to javafx.base; // <--- ADD THIS
    exports org.javafx.schoolmanagementsystem;
}
