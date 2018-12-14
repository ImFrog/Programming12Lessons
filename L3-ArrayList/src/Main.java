import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Car toyota = new Car();
        for (int i=0;i<100;i++) {
            cars.add(new Car(i));
        }

        for (Car c : cars) {
            System.out.println("car idNum: ");
        }
    }
}
