package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    public TextField txtName;
    public TextField txtQuantity;
    public TextField txtPrice;
    public ListView<Product> listProduct = new ListView<>();
    public Label labelName;
    public Label labelQuantity;
    public Label labelPrice;
    public Button btnBuy;


    public void makeProduct(ActionEvent actionEvent) {
        String name = txtName.getText();
        int quantity = Integer.parseInt(txtQuantity.getText());
        double price = Double.parseDouble(txtPrice.getText());

        Product temp = new Product(name, quantity, price);
        listProduct.getItems().add(temp);
        txtName.clear();
        txtPrice.clear();
        txtQuantity.clear();

        btnBuy.setDisable(true);
    }

    public void displayProduct(MouseEvent mouseEvent) {
        Product temp = listProduct.getSelectionModel().getSelectedItem();
        labelName.setText(temp.name);
        labelPrice.setText(Double.toString(temp.price));
        labelQuantity.setText(Integer.toString(temp.quantity));

        btnBuy.setDisable(false);
    }

    public void purchaseProduct(ActionEvent actionEvent) {
        Product temp = listProduct.getSelectionModel().getSelectedItem();
        temp.purchase();
        labelQuantity.setText(Integer.toString(temp.quantity));
    }
}
