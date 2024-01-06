package PracticeAsignment;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // PA 303.5.1 - Practice Assignment - Loops. Problem 2
        Scanner sc = new Scanner(System.in);
        int n1 , n2;

        boolean runApp = true;
        String userRequest = "yes";
        System.out.println("Enter two positive numbers two find the Greatest Common Divisor");
        do {
            if(userRequest.equalsIgnoreCase("yes" ) || userRequest.equalsIgnoreCase("Y")) {
                System.out.print("Please enter first number: ");
                n1 = sc.nextInt();
                System.out.print("Please enter second number: ");
                n2 = sc.nextInt();
                int min = Math.min(n2, n1);
                int k = 1;
                for (int i = 2; i <= min; i++) {
                    if (n1 % i == 0 && n2 % i == 0) {
                        k = Math.max(i, k);
                    }
                }
                System.out.println("GCP is: " + k);
                System.out.println("Would you like to calculate again? Yes/No");
                userRequest = sc.next();

            }
            else{
                System.out.println("Good bye!!!");
                runApp = false;
            }

        }while(runApp);


    }
}
