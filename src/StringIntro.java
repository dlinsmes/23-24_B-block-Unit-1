//code comments start with //
//comments are notes and explanations for yourself
//and anyone who may read your code

/*
block comment - don't need // at every line

Java classes are program files
-class names need to match the file name
-class names need to start with a capital letter
and have no spaces
-all code will go in the curly braces for the class
 */


public class StringIntro {

    //this is the main method
    //for now, all code goes in the main method
    public static void main(String[] args) {

        //this is a print statement
        System.out.println("Hello world!");

        //"Hello World" is a string
        //Strings are chars/nums/text that can be output or
        //used as data in the program

        //print() (not println()) will output any following
        //text on the same line
        System.out.print("Hi");

        System.out.print(" hello "); //outputs on same line as hi

        //println() puts in a line break AFTER what's output
        System.out.println("hola");
        //hola appears on the same line as the others and
        //whatever is print next will appear separately

        System.out.println("bonjour");

        System.out.println();
        System.out.println();

        //doesn't work because name is not in quotes
        //so the program thinks name could be a variable
//        System.out.println(name);

        //variables store data
        //-to define/declare a variable is to reference for the
        //first time by saying its data type (String)
        //-name is the variable's name
        //"bob" is the value stored in the name variable

        String name = "bob";

        System.out.println(name);

        //concatenate (add) strings together with a +
        System.out.println("my name is " + name);

        //when referencing/ changing an existing variable
        //you DON'T redeclare it (don't say String again)
        name = "something else";

        System.out.println("now my name is " + name);

        String friendName = "joe";
        //car names can't have spaces so the convention is
        //to use camelCase - lowercase first letter, then
        //uppercase first letters of any following words
        String lotsOfWords = "my friend's name is " + friendName;
        System.out.println(lotsOfWords);
    }
}