package com.ziminn.figuredb;

import com.ziminn.figuredb.data.Person;
import com.ziminn.figuredb.data.SQLworker;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        SQLworker figureDB = new SQLworker();
        figureDB.setFilePath("C:\\dataBase\\Figure.db");
        Person person = figureDB.createConnection();

        welcomeText.setText(person.getPhone());
    }
}