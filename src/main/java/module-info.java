module org.openjfx.stockapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires jdk.compiler;

    opens org.openjfx.stockapp to javafx.fxml;
    exports org.openjfx.stockapp;
    exports org.openjfx.stockapp.controller;
    opens org.openjfx.stockapp.controller to javafx.fxml;
}