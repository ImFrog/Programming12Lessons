package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public Label labelNumber;
    public Label labelOne;
    public TextField txtOne;
    int num = 0;

    public void addOne(ActionEvent actionEvent) {
        num++;
        labelNumber.setText(Integer.toString(num));
    }

    public void getName(ActionEvent actionEvent) {
        labelOne.setText(txtOne.getText());
        txtOne.clear();
    }

    public void subOne(ActionEvent actionEvent) {
        num--;
        labelNumber.setText(Integer.toString(num));
    }
}
