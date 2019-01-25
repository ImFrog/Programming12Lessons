public class Main {
    public static int recur(int a, int b) {
        //Base Case
        if (b==1) return a;
        else return a + recur(a, b-1);
    }

    public static void main(String[] args) {
        System.out.println(recur(3, 4));
    }
}
