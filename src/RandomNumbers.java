public class RandomNumbers {

    public static void main(String [] args) {

        //Math.random() generates a random double
        //between 0 and 1, inclusive of 0, exclusive of 1
        //[0, 1) --- always 0.something
        double r = Math.random();
        System.out.println(r);


        //expand the range of generated numbers to [0, 5)
        //the highest is 4.9999....
        System.out.println(Math.random() * 5);

        //random int between 0 and 4
        //cast the above to truncate the decimal in order to always get
        //a whole number [0, 5)
        System.out.println((int)(Math.random() * 5));


        //parentheses around Math.random() * 5 are important bc
        //without them, ONLY Math.random() is cast, which will always result in 0
        //java follows standard order of operations - PEMDAS
        System.out.println((int)Math.random() * 5);

        //generate an int [1, 6]
        //multiplication controls range
        //addition controls offset
        System.out.println((int)(Math.random() * 6) + 1);

        //general formula to generate an int [min, max]
        // (int)(Math.random() * (max-min+1)) + min;
        //for [1, 6] where 1 is min and 6 is max:
        // (int)(Math.random() * (6-1+1)) + 1;
        //=(int)(Math.random() * 6) + 1;

        //random int [10, 20]
        System.out.println((int)(Math.random() * 11) + 10);

    }
}
