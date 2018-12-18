public class Triangle extends Shape {
    int slantHeight;

    Triangle(int slantHeight) {
        super();
        this.slantHeight = slantHeight;
    }

    Triangle(int width, int height, String color, int slantHeight) {
        super(width, height, color);
        this.slantHeight = slantHeight;
    }

    public double area() {
        return (getWidth()*getHeight())/2;
    }

    @Override
    public String toString() {
        return null;
    }
}
