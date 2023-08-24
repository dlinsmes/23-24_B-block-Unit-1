import java.util.Scanner;

public class Numbers {

    public static void main(String [] args) {
        //to represent numbers in code, use int and double

        //int - integer - whole numbers incl 0 and negatives

        int num = 8;

        System.out.println("num is " + num);

        System.out.print(num + " + 4 is... ");
        // = is the assignment operator
        // evaluate what's on the RIGHT of the = (num+4) --> 12
        // then assign the evaluation to the LEFT --> update num to 12
        num = num + 4;
        System.out.println(num);

        //+ addition
        //- subtraction
        // / division
        // * multiplication
        // % modulo (mod) - remainder after division

        System.out.println("8 mod 5 is " + 8%5);

        System.out.println("num is " + num);

        //same as num = num + 2
        num += 2;
        System.out.println("+ 2 is " + num);

        //also works for -=, *=, /=

        //same as num = num + 1, num+=1
        num++;
        System.out.println("+ 1 is " + num);

        //num-- also works

        //int division - any decimals get truncated (cut off)
        //-even if a decimal is .9999 etc, only the whole number
        //that's part of the number will remain, i.e. the number
        //doesn't round up
        num = 7/2;
        System.out.println("7/2 is " + num);

        System.out.println("99 / 100 is " + 99/100);

        //double data type will hold decimal values
        double numnum = 9.0;
        System.out.println("9.0 / 2 is " + numnum/2);

        //IMPORTANT - = evaluates what's on the right before assigning
        //to the left
        //-both 99 and 100 are interpreted as ints, so int division is used
        //to get 0. Assigning to the numnum (double) variable makes it 0.0
        numnum = 99/100;
        System.out.println(numnum);

        //to get double division (and get the decimal), at least one term
        //needs to be a double (have a decimal)
        numnum = 99.0/100;
        System.out.println(numnum);

        numnum = 99/100.0;
        System.out.println(numnum);

        numnum = 99.0/100.00;
        System.out.println(numnum);



        //ints can be automatically converted to doubles bc the .0 gets added
        //for the double value
        numnum = 9;
        System.out.println("numnum is " + numnum);

        //doubles hold more information than ints do - decimal info
        //int wholeNum = numnum;

        //cast (convert) a double to an int
        //-when casting, any decimals get truncated (cut off)
        int wholeNum = (int)numnum;
        wholeNum = (int)7.2;
        System.out.println("wholeNum is " + wholeNum);


        //normal rounding rule - if the decimal is .5 or higher, round up
        //to the next whole number, otherwise stay on the current whole number
        double toRound = 4.4999999999;

        //to implement the normal rounding rule -
        //add .5 to the double value before casting
        int rounded = (int)(toRound + .5) ;
        System.out.println("rounded is " + rounded);

        toRound = 4.1;
        //round up if the decimal is .1 or higher
        rounded = (int)(toRound + .9) ;
        System.out.println("rounded is " + rounded);


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number to round");
        //use nextDouble() or nextInt() for number input
        double userNum = input.nextDouble();

        System.out.println(userNum + " rounded is " + (int)(userNum + .5) );

    }
}
