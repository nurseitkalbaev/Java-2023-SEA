package module303;

import java.util.Scanner;

public class TaxCalculator {

    public enum FilingStatus {
        SINGLE,
        MARRIED_FILING_JOINTLY,
        MARRIED_FILING_SEPARATELY,
        HEAD_OF_HOUSEHOLD
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continueCalculation = true;
        while(continueCalculation){
            System.out.println("Please select your marriage status:");
            System.out.println("1. Single");
            System.out.println("2. Married Filing Jointly");
            System.out.println("3. Married Filing Separately");
            System.out.println("4. Head of Household");

            System.out.print("Enter the corresponding number: ");
            int userInput = sc.nextInt();

            FilingStatus userStatus = parseUserStatus(userInput);

            if(userStatus != null){
                System.out.print("Please enter your taxable income: ");
                int income = sc.nextInt();

                int taxRate = calculateTaxRate(userInput, income);

                int tax = (income * taxRate) / 100;
                System.out.println("Your tax is $" + tax);

                System.out.println("Do you want to perform another tax calculation? (Yes/No)");
                sc.nextLine();
                String answer = sc.nextLine().toLowerCase();

                continueCalculation = answer.equals("yes");
            }
            else{
                System.out.println("\n");
                System.out.println("Invalid input. Please enter a valid number(1,2,3 or 4) for your marriage status.");
                System.out.println("\n");
            }

        }
        System.out.println("Thank you for using the tax calculator. Goodbye!");
    }

    private static FilingStatus parseUserStatus(int userInput) {
        switch (userInput) {
            case 1:
                return FilingStatus.SINGLE;
            case 2:
                return FilingStatus.MARRIED_FILING_JOINTLY;
            case 3:
                return FilingStatus.MARRIED_FILING_SEPARATELY;
            case 4:
                return FilingStatus.HEAD_OF_HOUSEHOLD;
            default:
                return null; // Invalid input
        }
    }

    private static int calculateTaxRate(int userInput, int income) {
        final int TEN = 10;
        final int FIFTEEN = 15;
        final int TWENTYFIVE = 25;
        final int TWENTYEIGHT = 28;
        final int THIRTYTHREE = 33;
        final int THIRTYFIVE = 35;

        FilingStatus userStatus = parseUserStatus(userInput);

        int taxRate = 0;

        if (userStatus != null) {
            int[] brackets = getIncomeBrackets(userStatus);

            if (income <= brackets[0]) {
                taxRate = TEN;
            } else if (income <= brackets[1]) {
                taxRate = FIFTEEN;
            } else if (income <= brackets[2]) {
                taxRate = TWENTYFIVE;
            } else if (income <= brackets[3]) {
                taxRate = TWENTYEIGHT;
            } else if (income <= brackets[4]) {
                taxRate = THIRTYTHREE;
            } else {
                taxRate = THIRTYFIVE;
            }
        }

        return taxRate;
    }

    private static int[] getIncomeBrackets(FilingStatus status) {
        switch (status) {
            case SINGLE:
                return new int[]{8350, 33950, 82251, 171550, 372950};
            case MARRIED_FILING_JOINTLY:
                return new int[]{16700, 67900, 137050, 208850, 372950};
            case MARRIED_FILING_SEPARATELY:
                return new int[]{8350, 33950, 68525, 104425, 186475};
            case HEAD_OF_HOUSEHOLD:
                return new int[]{11950, 45500, 117450, 190200, 372950};
            default:
                return new int[0];
        }
    }
}
