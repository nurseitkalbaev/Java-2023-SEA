package module303;

import java.sql.SQLOutput;

import static java.lang.Math.PI;

public class ConditionalStatements {
    public static void main(String[] args){
       /* int radius = 12;
        if(radius >= 0){
            double area = (radius * radius * PI);
            System.out.println("The area of a circle of " + "radius "
                    + radius + " is " +area);
        }
        else{
            System.out.println("The radius of the area cannot be negative.");
        }
        boolean status = false;
        if(status){
            System.out.println("status is true");
        }
        else{
            System.out.println("status is false");
        }
        */

        // Switch cases
        int day = 8;

        switch(day){
            case 1:System.out.println("Wednesday");break;
            case 2:System.out.println("Wednesday");break;
            case 3:
                System.out.println("Wednesday");break;
            case 5:
                System.out.println("Friday"); break;
            case 6:System.out.println("Saturday");break;
            case 7:System.out.println("Sunday");break;// make sure you have a "break" point on every case
            default:
                System.out.println(day + " - is out of range");
        }

        int marks = 80;
        if( marks > 70 )
            System.out.println("Distinction");
        if( marks > 35 )
            System.out.println("Pass");
        else // we don't have {} so only one line of code will be read as part of else scope
            System.out.println("Fail");
            System.out.println("Better luck next time");// this line of code is out of scope "else"

    }
}
