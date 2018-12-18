public class Rectangle extends Shape{
    public final String SHAPENAME = "Rectangle";


    @Override
    public double area() {
        return getHeight() * getWidth();
    }

    @Override
    public String toString() {
        return SHAPENAME + " Width = " + getWidth() + " Height = " + getHeight();
    }
}
