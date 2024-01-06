package GLAB;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // Example 1: Display a Text Five Times
        {
            int n = 5;
            // for loop practice
            for (int i = 1; i <= n; ++i) {
                System.out.println("Hello World!");
            }
        }

        //Example 2: Display Sum of n Natural Numbers
        {
            int sum = 0;
            int n = 1000;
            for(int i = 0; i <= n; i++){
                sum += i;
            }
            System.out.println("sum: "+ sum);
        }

        //Example 3: Palindrome

        {
            String original, reversed = "";
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string/number to check if it is palindrome?");
            original = sc.nextLine();
            for(int i = original.length()-1; i >= 0 ; i--){
                reversed += original.charAt(i);
            }
            if(original.equals(reversed)){
                System.out.println(original +" == "+reversed +" - Your string/number is palindrome");
            }
            else{
                System.out.println(original +" != "+reversed +" - Your string/number is NOT palindrome");
            }
        }


        //Example 4: Pyramid
        {
            for(int i = 1; i <= 5; i++){
                for(int j = 1; j <=i ; j++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }

    }
}
