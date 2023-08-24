import java.util.Scanner;
//Scanner is a built-in code library that lets us get input
//Scanner and input not tested in class or on AP

public class Input {

    public static void main(String [] args) {

        //declare a string var named lunch that holds "chicken tenders"
        String lunch = "chicken tenders";

        //concatenate (join) strings together in a print statement
        System.out.println("Today I had " + lunch + " for lunch today");

        //set up a Scanner called input that allows keyboard input
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");

        //save the user's input to a variable
        String name = input.nextLine();

        System.out.println("Hi " + name);

        System.out.println("how was your day?");
        String day = input.nextLine();
        System.out.println("your day was " + day);
    }
}
