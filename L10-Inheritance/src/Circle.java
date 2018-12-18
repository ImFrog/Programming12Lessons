public class Circle extends Shape{
    private int radius;

    Circle() {
        super();
        this.radius = 1;
    }

    Circle(int radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle " + radius;
    }

    public double getCircumference() {
        return radius*Math.PI;
    }
}
