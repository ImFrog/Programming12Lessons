public class Main {
    public static void main(String[] args) {
        //Prints out a string.
        System.out.println( "I will now count my chickens:" );

        //These next two lines prints a string and an evaluation
        System.out.println( "Hens " + ( 25 + 30 / 6 ) );
        System.out.println( "Roosters " + ( 100 - 25 * 3 % 4 ) );

        //Prints out a string.
        System.out.println( "Now I will count the eggs:" );

        //Prints out an evaluated expression
        System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 );

        //Prints out a string
        System.out.println( "Is it true that 3 + 2 < 5 - 7?" );

        //Prints out an evaluation
        System.out.println( 3 + 2 < 5 - 7 );

        //These next two lines prints a string and an evaluation
        System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
        System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );

        //Prints out a string
        System.out.println( "Oh, that's why it's false." );

        //Prints out a string
        System.out.println( "How about some more." );

        //These next two lines prints a string and an evaluation
        System.out.println( "Is it greater? " + ( 5 > -2 ) );
        System.out.println( "Is it greater or equal? " + ( 5 >= -2 ));
        System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );

        //2. Expressions with doubles will give a decimal number, no doubles means no decimals
        //3. Expressions are evaluated into numbers, while conditional statements are evaluated into booleans.
    }
}
