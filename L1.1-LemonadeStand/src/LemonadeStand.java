import java.util.Scanner;

public class LemonadeStand {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numLemonade;
        int numSnacks;
        double cost;


        System.out.println("How many glasses of lemonade do you want?");
        numLemonade = scan.nextInt();
        System.out.println("How many snacks do you want?");
        numSnacks = scan.nextInt();

        //Calculate cost
        cost = numLemonade * 1.25 + numSnacks * 1.5;
        System.out.println("Total cost is: " + cost);
        //Calculate pay and change

        double pay;
        do {
            System.out.println("Enter pay");
            pay = scan.nextDouble();

            //If not paid enough, ask again for the right amount of money.
            if (pay < cost) {
                System.out.println("Not enough money");
            }
        } while (pay < cost);

        double change = pay - cost;
        if (change != 0) {

            System.out.println("Your change is " + change);
        }

        System.out.println("Thank you, have a nice day.");

    }
}
