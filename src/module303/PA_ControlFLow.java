package module303;

import java.util.Scanner;

public class PA_ControlFLow {




public static void main(String[] args) {
// 1
{
    int x;
    x = 7;
//            x = 15;
    if (x < 10) System.out.println("Less than 10");
}

// 2
{
    int x;
    x = 7;
    x = 15;
    if(x < 10) System.out.println("Less than 10");
    if(x > 10) System.out.println("Greater than 10");

}

/*
 3. Write a program that declares 1 integer variable x,
 and then assigns 15 to it. Write an if-else-if statement
 that prints out “Less than 10” if x is less than 10;
 “Between 10 and 20” if x is greater than 10 but less than 20,
 and “Greater than or equal to 20” if x is greater than or equal to 20.
 Change x to 50 and notice the result.
*/

{
    int x;
    x = 20;
    if(x < 10) System.out.println("Less than 10");
    else if(x > 10 && x < 20) System.out.println("Between 10 and 20");
    else if(x >= 20) System.out.println("Greater than or equal");

}

{
    /*
4. Write a program that declares 1 integer variable x,
 and then assigns 15 to it. Write an if-else statement that prints
 “Out of range” if the number is less than 10 or greater than 20
 and prints “In range” if the number is between 10 and 20
 (including equal to 10 or 20). Change x to 5 and notice the result.
*/
    int x;
    x = 15;
    if(x < 10 || x > 20) System.out.println("Out of range");
    else if(x >= 10 && x <= 20) System.out.println("In range");
}


{
    /*
5. Write a program that uses if-else-if statements to print out grades
 A, B, C, D, F, according to the following criteria:
    A: 90-100
    B: 80-89
    C: 70-79
    D: 60-69
    F: <60
 Use the Scanner class to accept a number score from the user to
  determine the letter grade. Print out “Score out of range”
  if the score is less than 0 or greater than 100.
*/

    System.out.print("Please enter your score:");
    Scanner scanner = new Scanner(System.in);
    int grade = scanner.nextInt();
    if(grade < 0 || grade > 100) System.out.println("Score out of range");
    else if(grade >= 90) System.out.println("A");
    else if(grade >= 80) System.out.println("B");
    else if(grade >= 70) System.out.println("C");
    else if(grade >= 60) System.out.println("D");
    else if(grade < 60) System.out.println("F");

}


{
    /*
6. Write a program that accepts an integer between 1 and 7
from the user. Use a switch statement to print out the corresponding
weekday. Print “Out of range” if the number is less than 1 or
greater than 7. Do not forget to include “break” statements
in each of your cases.
*/
        System.out.print("Please enter a number between 1 and 7:");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;// make sure you have a "break" point on every case
            default:
                System.out.println(day + " - Out of range");
        }
}

{
/*
  7. Create a program that lets the users input their filing
  status and income. Display how much tax the user would have
  to pay according to status and income.
  The U.S. federal personal income tax is calculated based on
  the filing status and taxable income.
  There are four filing statuses: Single, Married Filing Jointly,
  Married Filing Separately, and Head of Household.
  The tax rates for 2009 are shown below.
 */
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter your marriage status \n(Single, Married Filing Jointly,Married Filing Separately, Head of Household) : ");
    String userStatus = sc.nextLine();
    System.out.print("Please enter your taxable income: ");
    int income = sc.nextInt();
    int taxRate = 0;
    final int TEN = 10;
    final int FIFTEEN = 15;
    final int TWENTYFIVE = 25;
    final int TWENTYEIGHT = 28;
    final int THIRTYTHREE = 33;
    final int THIRTYFIVE = 35;
    if(userStatus.equalsIgnoreCase("single")){
        if (income <= 8350){
            taxRate = TEN;
        }
        else if (income <= 33950 ){
            taxRate = FIFTEEN;
        }
        else if (income <= 82251){
            taxRate = TWENTYFIVE;
        }
        else if (income <= 171550){
            taxRate = TWENTYEIGHT;
        }
        else if (income <= 372950){
            taxRate = THIRTYTHREE;
        }
        else if (income > 372951){
            taxRate = THIRTYFIVE;
        }
    }
    else if(userStatus.equalsIgnoreCase("married filing jointly")){
        if (income <= 16700){
            taxRate = TEN;
        }
        else if (income <= 67900 ){
            taxRate = FIFTEEN;
        }
        else if (income <= 137050){
            taxRate = TWENTYFIVE;
        }
        else if (income <= 208850){
            taxRate = TWENTYEIGHT;
        }
        else if (income <= 372950){
            taxRate = THIRTYTHREE;
        }
        else if (income > 372951){
            taxRate = THIRTYFIVE;
        }
    }else if(userStatus.equalsIgnoreCase("married filing separately")){
        if (income <= 8350){
            taxRate = TEN;
        }
        else if (income <= 33950 ){
            taxRate = FIFTEEN;
        }
        else if (income <= 68525){
            taxRate = TWENTYFIVE;
        }
        else if (income <= 104425){
            taxRate = TWENTYEIGHT;
        }
        else if (income <= 186475){
            taxRate = THIRTYTHREE;
        }
        else if (income > 186476){
            taxRate = THIRTYFIVE;
        }
    }
    else if(userStatus.equalsIgnoreCase("head of household")){
        if (income <= 11950){
            taxRate = TEN;
        }
        else if (income <= 45500 ){
            taxRate = FIFTEEN;
        }
        else if (income <= 117450){
            taxRate = TWENTYFIVE;
        }
        else if (income <= 190200){
            taxRate = TWENTYEIGHT;
        }
        else if (income <= 372950){
            taxRate = THIRTYTHREE;
        }
        else if (income > 372951){
            taxRate = THIRTYFIVE;
        }
    }

    int tax = (income/100) * taxRate;
    System.out.println("Your tax is $"+tax);

}

}


}




