public class Car {
    //fields
    private int speed;
    private int passengers;
    private String color;
    private String make;

    //constructor
    Car(int speed, int passengers, String color, String make) {
        System.out.println("car object created");
        this.speed = speed;
        this.passengers = passengers;
        this.color = color;
        this.make = make;
    }

    Car() {
        System.out.println("default constructor");
        speed = 0;
        passengers = 0;
        color = "black";
        make = "NA";
    }

    //methods
    //setters and getters


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        if (speed < 0) {
            this.speed = 0;
        }
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String toString() {
        return "Make: " + make + "\tColor: " + color;
    }

    public void speedUp() {
        speed++;
    }
}
