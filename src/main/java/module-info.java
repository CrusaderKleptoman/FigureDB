module com.ziminn.figuredb {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires java.sql;
    opens com.ziminn.figuredb to javafx.fxml;
    exports com.ziminn.figuredb;
}