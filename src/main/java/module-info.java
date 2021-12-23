module com.mycompany.test1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.test1 to javafx.fxml;
    exports com.mycompany.test1;
}
