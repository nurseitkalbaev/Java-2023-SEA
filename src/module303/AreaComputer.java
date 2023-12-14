package module303;
/*
This class allows the calculation of the area of a circle using radius.
* */

public class AreaComputer {
    //this is the entry point into the JVM
    public static void main(String[] args) {
        //Declare our variables:
        double radius; //one of the 'integral' types
        //for when we need a decimal value
        double area;
        final double PI = 3.14159;
        final double PO;

        byte num = 127; // Max value 127 it can hold;
        short myshort = 32000;
        int myint = 10000;
        long longNum = 1234567810L;

        //Floating point:
        float myFloat = 1.001f;
        double myDouble = 1.000001;

        //Boolean - true/false:
        boolean yesOrNo = true;

        //Character - 15 - bit unicode characters: 0 to 65535
        char yourLetter = 'A';



        System.out.println("byte num = " +num);





        // Assign a value:
        radius = 20;

        //Compute area:
        area = radius * radius * 3.14159;



        //Display results:
        System.out.println("The area for the circle" + " radius " + radius + " is " + area);
    }
}
