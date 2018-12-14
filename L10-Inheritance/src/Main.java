import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4,6,"white", 5);
        Shape shape = new Shape(4, 6, "blue");
        System.out.println(triangle.area());
        System.out.println(shape.getClass());

        //Don't do this way
        ArrayList<Object> listOfAnyObject = new ArrayList<>();
        listOfAnyObject.add(shape);
        listOfAnyObject.add(triangle);
    }
}
