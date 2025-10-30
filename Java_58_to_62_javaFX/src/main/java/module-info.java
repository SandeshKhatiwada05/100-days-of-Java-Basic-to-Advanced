module org.javafx.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.javafx.javafx to javafx.fxml;
    exports org.javafx.javafx;
}