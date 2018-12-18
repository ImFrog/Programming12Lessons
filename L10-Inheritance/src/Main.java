import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Shape rect1 = new Rectangle();
        Shape circ1 = new Circle(2);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rect1);
        shapes.add(circ1);
        for(Shape s: shapes) {
            if(s instanceof Rectangle) {
                System.out.println(s.area()); //Shapes have area method
            } else {
                System.out.println(((Circle) s).getCircumference()); //Everything else
            }
        }

        //Don't do this way
//        ArrayList<Object> listOfAnyObject = new ArrayList<>();
//        listOfAnyObject.add(shape);
//        listOfAnyObject.add(triangle);
    }
}
