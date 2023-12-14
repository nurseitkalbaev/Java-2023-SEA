package module303;

import org.w3c.dom.ls.LSOutput;

import static java.lang.Character.getType;

public class JavaLiterals {
    public static void main(String[] args) {
        int radius = 20; //20 is a literal
        long lval = 3885L;
        double length  =1.5;
        float pi = 3.1415927f;
        double avagadrosNumber = 6.62e23;
        double plancksConstant = 6.62e-34;
        char a = 0101, nine =57, plus = 0x2b, tilda = 126;
        //char a = 'A', nine = '9', plus = '+', tilda = '~';
        String username = "popcorn";
        String password = "123456";

        char ch = '\u0061';
        char emptyChar = 'A';
        char emptyCh = '\u0000'; // null character
        double num2 = emptyChar;
        System.out.println( "\\u" + Integer.toHexString('A' | 0x10000).substring(1) );


        //Escape sequences:
        /* \r just returns to the next line; \n prints and then
         moves to the next line
         */
//        System.out.println("This will print on \r\n two lines.");
//        System.out.println("She said \"Hello\" to me!");
//        System.out.println("This will print two back-slashes:\\\\");


    }

}
