package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    TextArea sentence;

    @FXML
    Button calculate;

    @FXML
    TextField result;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void calc(ActionEvent actionEvent) {
        //вычисление выражения

    }
}
