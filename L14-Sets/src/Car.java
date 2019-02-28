public class Car implements Comparable<Car> {
    String id;
    int price;

    public Car(String id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " " + price;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car other = (Car) obj;
            return other.id.equals((this.id));
        }
        return false;
    }

    public int compareTo(Car o) {
        if (this.price > o.price) {
            return 1;
        } else if (this.price < o.price) {
            return -1;
        }
        return 0;
    }
}
