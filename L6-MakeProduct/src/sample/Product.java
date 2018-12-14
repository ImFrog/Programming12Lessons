package sample;

public class Product {
    public String name;
    public int quantity;
    public double price;

    Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }

    public void purchase() {
        if(quantity > 0) {
            quantity--;
        }
    }
}
