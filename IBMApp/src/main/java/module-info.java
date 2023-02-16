module com.thao.ibmapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.thao.ibmapp to javafx.fxml;
    exports com.thao.ibmapp;
}
