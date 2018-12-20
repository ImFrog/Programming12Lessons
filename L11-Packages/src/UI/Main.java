package UI;

import objects.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computer compy = new Computer();
        Scanner scan = new Scanner(System.in);
        System.out.println("Type something");
        ArrayList<String> stuff = new ArrayList<>();
        ArrayList<Person> people = new ArrayList<>();
        while(true) {
            stuff.add(scan.nextLine());
            if (stuff.get(stuff.size() - 1).equals("x")) {
                System.exit(0);
            }
            people.add(new Person(stuff.get(stuff.size()-1)));
        }
    }
}
