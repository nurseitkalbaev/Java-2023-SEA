package module303A;

import java.sql.SQLOutput;

/*
 * Covered integral, decimal and reference data types.  Practiced string concatenation
 * and how to print to console. Covered constants as well.
 * */
public class Practice {
    public static void main(String[] args) {

        //Integral datatypes:

        int num = 10;
        byte myByte = 1;
        short myShort = 2;
        long myLongNum = 200;

        // When the number is bigger than integer then add L to long:
        long testLong = 12345678910L;

        double decimal1 = 10.223445;
        float decimal2 = 3.14f;

        //The boolean the default value is false:
        boolean onAndOff = false;
        char myChar = 'a';
        //Reference data type
        String myString = "String";

        final int finalInt = 1991;
        //myChar does not cause error because it has a unicode value
        int changeable = myChar;
        // System.out.println("Value of character: " + myChar + " in Unicode is "+ changeable);

        // finalInt = 1992; Java won't let you change the value of a constant(final)





    }

    public static void twoSum(String[] args){
        System.out.println();
    }

}
