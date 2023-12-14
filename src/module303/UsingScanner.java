package module303;

import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {
        /*Declare a variable of type Scanner (object of type Scanner)
        or (instance of type Scanner)
         */
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        /* Constructor is a special method that you call every time
        you create an object in Java. As you guys can see it is the
        same name as the class
         */
        String wholeLine, beforeWhiteSpace;
        int integerFromUser;
        byte byteFromUser;
        short shortFromUser;
        long longFromUser;
        double doubleFromUser;
        float floatFromUser;
        char charFromUser;

        System.out.print("Please enter a sentence: ");
        wholeLine = input.nextLine();

        System.out.println("This is the sentence you entered: "+
                wholeLine);
        System.out.println("Please enter a word!");
        beforeWhiteSpace = input.next();
        System.out.println("This is the word you entered" + beforeWhiteSpace + ",");

        System.out.println("Please enter a byte: ");
        byteFromUser = input.nextByte();
        System.out.println("here is your byte: " + byteFromUser);

        System.out.println("Please enter a short");
        shortFromUser = input.nextShort();
        System.out.println("here is your short: " + shortFromUser);

        System.out.println("Please enter a long number");
        longFromUser = input.nextLong();
        System.out.println("here is your long number: " + longFromUser);

        System.out.println("Please enter a double number");
        doubleFromUser = input.nextDouble();
        System.out.println("here is your double number: " + doubleFromUser);

        System.out.println("Please enter a float number: ");
        floatFromUser = input.nextFloat();
        System.out.println("here is your float number: " + floatFromUser);

        //what if we want just a character from the console?
        System.out.println("Please enter the character: ");
        charFromUser = input2.next().charAt(0);
        System.out.println("Here is your character: " + charFromUser);


    /*Close the scanner after you are done with it.
    Get into the practice of closing the scanner because it is a resource
    You want the garbage collector to close everything that is not in use so
    that there are no memory leaks.
     */
        input.close();

    }
}
