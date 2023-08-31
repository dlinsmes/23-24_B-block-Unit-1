import java.util.Scanner;

public class CashRegister {

    public static void main(String[] args) {
        //warmup - set up a scanner and prompt for a double input,
        //then output the rounded version of that number

        Scanner input = new Scanner(System.in);

//        System.out.println("enter a decimal number");
//        double n = input.nextDouble();
//        int rounded = (int)(n+0.5);
//        System.out.println(n + " rounded is " + rounded);

        //math operation review

        //int division - no decimals (truncated - cut off)
        int a = 37 / 5;

        // modulo produces the remainder after division
        int b = 37 % 5;

        System.out.println("37 / 5 is " + a);
        System.out.println("37 % 5 is " + b);


        //7 and 2 are both ints so int division is performed to get 3
        //then saving 3 to a double gets 3.0
        double c = 7 / 2;
        System.out.println("7 / 2 is " + c);
        //to get 3.5, make at least one of the division terms a double by adding .0


        //doubles are only an approximation of decimal numbers
        //-sometimes the value is extremely close, but off by a small decimal amount
        //should be 7.5
        c = 9.7 - 2.2;
        System.out.println("9.7 - 2.2 is " + c);

        c = 9.7 - 2.1;
        System.out.println("9.7 - 2.1 is " + c);

        c = 9.7 - 2.0;
        System.out.println("9.7 - 2.0 is " + c);

        //should be .49
        c = 47.49 % 1;
        System.out.println("47.49 % 1 is " + c);

        //sometimes the value is slightly over or under the expected value

        //round to the desired decimal place
        c = 9.7 - 2.2;

        //move the decimal place to the desired place value to keep
        c = c * 10; //74.999
        int n = (int)(c + .5); //75
        c = n / 10.0; //7.5
        System.out.println(c);

        //.49
        c = 47.49 % 1;
        c = (int)((c * 100) +.5)/100.0;
        System.out.println(c);

        //cash register
        //prompt the user for a dollar and cent amount
        //-output the minimum quantity of bills and coins needed to add to that amt
        //bills: 100, 20, 10, 5, 1
        //coins: quarter, dime, nickle, penny
        //use ONLY division, modulo, and rounding
        //(no multiplication, subtraction, ifs, loops)

        System.out.println("enter a dollar and cent amount: ");
        double amt = input.nextDouble();
        System.out.println("$" + amt + " is...");

        //start at the largest denomination
        //for each quantity, calculate an int value
        // bc you can't have a decimal of a bill
        int q = (int) amt/100;
        System.out.println(q + " $100 bills");

        //use mod to calculate remaining amt after accounting for hundreds
        amt = amt % 100;
//        System.out.println(amt + " remaining");


        q = (int) amt/20;
        System.out.println(q + " $20 bills");

        amt = amt % 20;
        q = (int) amt / 10;
        System.out.println(q + " $10 bills");

        amt = amt % 10;
        q = (int) amt/5;
        System.out.println(q + " $5 bills");

        amt = amt % 5;
        q = (int) amt;
        System.out.println(q + " $1 bills");

        amt = amt % 1;

        System.out.println(amt + " remaining");

        //try 157.98 as an initial amt and check the coin quantities











    }

}
