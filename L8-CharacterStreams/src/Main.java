import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)throws IOException {
        FileReader in = new FileReader("in.txt");
        BufferedReader br = new BufferedReader(in);

        ArrayList<String> lines = new ArrayList<>();

        String line;
        while((line = br.readLine()) != null) lines.add(line);

        for(String l : lines) {
            System.out.println(l);
        }


        FileWriter fw = new FileWriter("out.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        for(String l : lines) {
            bw.write(l);
            bw.newLine();
        }
        bw.close();
    }
}
