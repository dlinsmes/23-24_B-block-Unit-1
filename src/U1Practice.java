import java.util.Scanner;
public class U1Practice {

    //warm up
    //prompt the user to enter dog, cat, or moose
    //write a boolean expression that results in
    //FALSE if the user entered something valid (one of the 3)
    //TRUE if they enter something invalid (not one of the 3)
    public static void main(String [] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter dog, cat, or moose");
//        String word = input.nextLine();
//
//        boolean isDog = word.equals("dog");
//        boolean isCat = word.equals("cat");
//        boolean isMoose = "moose".equals(word);
//
//        boolean isValid = isDog || isCat || isMoose;
//        boolean opposite = !isValid;
//
//        isValid = word.equals("dog") || word.equals("cat") || "moose".equals(word);
//        opposite = !isValid;
//
//        opposite = !(word.equals("dog") || word.equals("cat") || "moose".equals(word));
//
//        opposite = !word.equals("dog") && !word.equals("cat") && !"moose".equals(word);
//        System.out.println("your input was invalid: " + opposite);
//


        int a = 10;
        int b = 20;

        //swap variable values so a holds 20 and b holds 10

        //doesn't work to swap because a's original value gets lost
//        a = b;
//        b = a;

        //need a temporary variable of the same type to hold one of
        //the variables' original values
        //pattern: for the second and third lines, start with the
        //previous line's right side
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a is " + a + ", b is " + b);

        a = 10;
        b = 20;

        //has the same outcome
        temp = b;
        b = a;
        a = temp;
        System.out.println("a is " + a + ", b is " + b);

        //order of operations is the same as math - PEMDAS
        ///, *, % have the same priority and execute left to right
        // +, - have the same priority and execute left to right
        a = 9 + 7 / 2 - 3 * 3; // 7 / 2 evaluates as int division --> 3
        //= 9 + 3     - 9
        //= 3
        System.out.println(a);

        a = (9 + 7) / 2 - 3 * 3;
        System.out.println(a);

        int num = 5432;
        //calculate the sum of digits

        //isolate the right digit, add it to the sum,
        // then cut off the right digit

        int digit = num % 10; //isolate the right-most digit;
        int sum = digit;
        System.out.println(digit);

        //cut off the right-most digit
        num = num / 10; //get rid of the ones place and result in 543

        digit = num % 10;
        System.out.println(digit);
        sum += digit;
        num /= 10;

        digit = num % 10;
        sum += digit;
        num /= 10;

        //last remaining digit in num - no need to % 10
        digit = num;
        sum += digit;

        System.out.println(sum);





    }
}
