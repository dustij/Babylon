module com.dustijohnson {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.dustijohnson to javafx.fxml;

    exports com.dustijohnson;
    exports com.dustijohnson.Controllers;
    exports com.dustijohnson.Models;
    exports com.dustijohnson.Views;
}
