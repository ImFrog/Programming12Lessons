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

    public int area() {
        return (width*getHeight())/2;
    }
}
