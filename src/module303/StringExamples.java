package module303;

import java.util.ArrayList;
import java.util.List;

public class StringExamples {
    public static void main (String []args){
        // String is immutable - you cannot change the OBJECT itself, just the REFERENCE to it

        String s1 = "welcome"; // s1 and s2 are referencing to the same object
        String s2 = "welcome"; // s1 and s2 are referencing to the same object
        Integer num = 23;
        // new operator:
        String s = new String("welcome");
        String s3 = new String(s);
        //never compare two strings with == sign. use equals() method.
        // == sign compares references but not the value
        System.out.println(String.valueOf(s3).equals(String.valueOf(s)));
        System.out.println(String.valueOf(s1) == String.valueOf(s));
        String myName = "  Nurseit  ";
        System.out.println(myName);
        String trimmedName = myName.trim();
        System.out.println(trimmedName);
        String trimmed = myName;

        // converting Number data type to the String data type

        Integer number = 18;
        double price = 20.99;
        System.out.println("number " + number );
        String priceAsString = String.valueOf(price);// more appropriate than toString() method
        String nowItIsString = number.toString();
        double priceFromString = Double.parseDouble(priceAsString);

        StringBuffer stringBuffer = new StringBuffer(50);
        stringBuffer.append("Nurseit Kalbaev");

        System.out.println("stringBuffer " + stringBuffer);

        // StingBuffer is more safe way to  use than StringBuffer or String.
        // It works synchronously so it might be slower.
        System.out.println(Math.PI);
        System.out.println(Math.round(2.49));
        System.out.println(Math.floor(2.99));
        System.out.println((int)Math.pow(2,3));

        for(int i = 0; i < 5; i++){
            int num1 = (int) (Math.random() * 10);
//            System.out.println(num1);
        }









    }
}
