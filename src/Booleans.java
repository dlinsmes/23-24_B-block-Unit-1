import java.util.Scanner;
public class Booleans {
    public static void main(String [] args) {
        //warm up
        //set up a scanner, prompt user for a number, save number to int x
        //generate a random int [3, x]
        Scanner input = new Scanner(System.in);
//        System.out.println("enter a number: ");
//        int x = input.nextInt();
//
//        //formula for random ints [min, max]
//        //(int)(Math.random() * (max-min+1) ) + min
//        int r = (int)(Math.random() * (x-3+1)) + 3;
//        System.out.println(r);

        //data types - String, int, double, booleans

        //boolean is a data type whose value can only be true or false
        boolean b = true;
        System.out.println(b);

        //! is negation - NOT - flip the boolean value to its opposite
        b = !b;
        System.out.println(b);

        b = !false;
        System.out.println(b);

        int x = 7;

        //boolean comparisons - used in if-statements and while loops

        //assignment operator(=) - evaluate the RIGHT (7 > 3) --> true
        //then assign true to the left --> b is set to true
        b = x > 3;
        System.out.println(b);

        // > greater than
        // < less than
        // >= greater than or equal to
        // <= less than or equal to

        System.out.println("enter a number: ");
        x = input.nextInt();

        b = x <= 10;
        System.out.println("x is less than or equal to 10: " + b);

        // == is a COMPARISON to check equality --> true if values are the same
        // = is an assignment --> set the left to the evaluation of the right
        b = x == 5;
        System.out.println("x is equal to 5: " + b);

        // != not equal to
        b = x != 9;
        System.out.println("x is not 9: " + b);

        //check if x is odd
        //if there's a remainder after dividing by 2, then x is odd
        b = x % 2 == 1;
        System.out.println("x is odd: " + b);

        //same as:
        //if the remainder is NOT 0, then there IS a remainder, so odd
        b = x % 2 != 0;
        System.out.println("x is odd: " + b);

        String word = "apple";
        String word2 = "apple";

        input.nextLine();
        System.out.println("enter the word apple: ");
        String word3 = input.nextLine();


        //IMPORTANT - Strings should NOT use == to check equality
        //inconsistent behaviors using == Strings
        b = word == word2;
        System.out.println("word == word2: " + b);

        b = word == word3;
        System.out.println("word == word3: " + b);

        // use .equals() to check strings
        b = word.equals(word2);
        System.out.println("word.equals(word2) is " + b);

        b = word.equals(word3);
        System.out.println("word.equals(word3) is " + b);

        b = "apple".equals(word3);
        b = word3.equals("apple");

        // ! - negation - NOT - evaluate the opposite expression
        b = !(x < 7); //same as x >= 7

        //opposite of < is >=
        //opposite of > is <=
        //opposite of == is !=

        //check if strings are not equal
        b = !word3.equals("apple");
        System.out.println("your word was NOT apple: " + b);

        //combining expressions - &&, ||

        //&& - and - BOTH expressions need to be true
        b = x > 7 && word3.equals("apple");
        System.out.println("x > 7 AND you entered apple: " + b);

        // || - or - at least ONE of the expressions is true
        b = x > 7 || word3.equals("apple");
        System.out.println("x > 7 OR you entered apple: " + b);

        //prompt the user for a positive number that is less than 50
        //output true/false if their number meets criteria
        System.out.println("enter a positive number that's less than 50: ");
        x = input.nextInt();
        b = x > 0 && x < 50;
        b = x >=1 && x <= 49;

        b = !(x <= 0 || x >= 50);
        b = !(x < 1 || x > 49);

        //DeMorgan's Law
        //A and B are boolean expressions
        //!(A and B) is the same as (!A or !B)
        //!(A or B) is the same as (!A and !B)
        //distribute the negation to each expression and flip and/or

        b = ! (x < 12 && x % 3 == 0);
        //same as
        b = x >= 12 || x % 3 != 0;






    }

}
