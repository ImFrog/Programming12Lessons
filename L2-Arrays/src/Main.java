import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[20];
        Random rand = new Random();

        for (int i=0;i<myArray.length;i++) {
            myArray[i] = rand.nextInt(6) + 1;
        }

        int[] myArray2 = new int[10];

        for (int i=0;i<myArray.length - 1;i++) {
            myArray[i] = rand.nextInt(100) + 1;
        }

        int average = 0;
        for (int i=0;i<myArray.length - 1;i++) {
            average += myArray2[i];
        }

        int temp = myArray2[7];
        myArray2[7] = myArray2[3];
        myArray2[3] = temp;

        for (int i=myArray.length;i>0;i--) {
            int temp2 = myArray2[i];
            myArray2[i] = myArray2[myArray2.length - i];
            myArray2[myArray2.length - i] = temp2;
        }
    }
}
