import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        HashSet<Car> cars = new HashSet<>();
//
//        for (int i = 0;  i< 10; i++) {
//            cars.add(new Car("H-" + i));
//        }
//
//        Iterator<Car> iterator = cars.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        System.out.println(cars.add(new Car("H-0")));

//        LinkedHashSet<Car> cars = new LinkedHashSet<>();
//        for (int i = 0;  i< 10; i++) {
//            cars.add(new Car("H-" + i));
//        }
//
//        Iterator<Car> iterator = cars.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        System.out.println(cars.add(new Car("H-0")));

        TreeSet<Car> cars = new TreeSet<>();
        for (int i = 0;  i< 10; i++) {
            cars.add(new Car("H-" + i, (int) (Math.random() * 1000)));
        }

        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        Car c = new Car("H-15", 500);

        cars.add(c);

        TreeSet<Car> headSet = (TreeSet<Car>) cars.tailSet(c);
        Iterator<Car> carsIter = headSet.iterator();

        System.out.println("HeadSet*************");
        while (carsIter.hasNext()) {
            System.out.println(carsIter.next());
        }
    }
}
