module com.greeting.greetingdesktop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.greeting.greetingdesktop to javafx.fxml;
    exports com.greeting.greetingdesktop;
}