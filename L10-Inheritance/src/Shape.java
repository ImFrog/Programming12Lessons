public class Shape {
    protected int width;
    private int height;
    public String color;

    public Shape() {
        width = 1;
        height = 1;
        color = "white";
    }

    public Shape(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int area() {
        return width * height;
    }
}