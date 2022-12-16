module com.myapps.smartcal {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.myapps.multical to javafx.fxml;
    exports com.myapps.multical;
}