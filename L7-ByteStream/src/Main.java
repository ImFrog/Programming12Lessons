import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        /*
        //Byte stream
        byte[] data = new byte[10];
        System.out.println("Hit any key...");
        System.in.read(data);
        String builder = "";
        for(byte b:data) {
            System.out.println("Byte: " + b + "\tchar: " +(char)b);
            builder += Character.toString((char)b);
        }
        System.out.println(builder);
        */

        FileInputStream in = new FileInputStream("in.txt");
        FileOutputStream out = new FileOutputStream("out.txt");
        int c;
        while((c = in.read()) != -1) {
            out.write(c);
        }
        String name = "\r";
        byte[] array = name.getBytes();
        out.write(array);
    }
}
