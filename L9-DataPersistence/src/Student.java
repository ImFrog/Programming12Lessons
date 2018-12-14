import java.io.*;
import java.util.ArrayList;

public class Student {
    String name;
    int annoyanceLevel;
    int grade;

    public Student(String name)throws IOException {
        Student temp = parseStudent(name);
        this.name = temp.name;
        this.annoyanceLevel = temp.annoyanceLevel;
        this.grade = temp.grade;
    }

    public Student(String name, int annoyanceLevel, int grade) {
        this.name = name;
        this.annoyanceLevel = annoyanceLevel;
        this.grade = grade;
    }

    public void toFile(boolean append)throws IOException {
        if(append) {
            FileWriter fw = new FileWriter(name + ".txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(name);
            bw.newLine();
            bw.write(Integer.toString(annoyanceLevel));
            bw.newLine();
            bw.write(Integer.toString(grade));
            bw.newLine();
            bw.close();
        } else {
            FileWriter fw = new FileWriter(name + ".txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(name);
            bw.newLine();
            bw.write(Integer.toString(annoyanceLevel));
            bw.newLine();
            bw.write(Integer.toString(grade));
            bw.newLine();
            bw.close();
        }
    }

    public Student parseStudent(String name)throws IOException {
        FileReader fr = new FileReader(name+".txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> data = new ArrayList<>();
        String line;
        while((line = br.readLine()) != null) {
            data.add(line);
        }
        String nameStudent = data.get(0);
        int annoyance = Integer.parseInt(data.get(1));
        int gradeStudent = Integer.parseInt(data.get(2));
        return new Student(nameStudent,annoyance,gradeStudent);
    }
}
