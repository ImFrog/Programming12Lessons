import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<Person> personList = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            personList.add(new Person((int) (Math.random() * 50), i));
        }

        Iterator<Person> personIterator = personList.iterator();

        while (personIterator.hasNext()) {
            System.out.println(personIterator.next());
        }

        LinkedList<Person> linkedList = new LinkedList<>(personList);
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.peekFirst());

        ListIterator<Person> listIterator = linkedList.listIterator(personList.size() - 1);

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        Collections.shuffle(linkedList);
    }
}