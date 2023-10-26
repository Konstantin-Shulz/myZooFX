module zoo.myzoofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens zoo.myzoofx to javafx.fxml;
    exports zoo.myzoofx;
    exports zoo.myzoofx.Animal;
    opens zoo.myzoofx.Animal to javafx.fxml;
}