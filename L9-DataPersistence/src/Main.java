import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        Student s1 = new Student("Jimbo",10, 15);
        s1.toFile(false);
        Student s2 = new Student("Jimbo");
        System.out.println(s2.grade);
        s2 = s2.parseStudent("Jimbo");
        System.out.println(s2.grade);
    }
}
