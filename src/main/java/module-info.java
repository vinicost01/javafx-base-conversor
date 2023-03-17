module v.c {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens v.c to javafx.fxml;
    exports v.c;
}