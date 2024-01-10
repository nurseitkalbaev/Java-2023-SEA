package PracticeAssignment;

public class SavingsAccount {
    final int TWELVEMONTH = 12;
    private static double annualInterestRate;
    private double monthlyInterestRate;
    private double savingsBalance;

    public void  calculateMonthlyInterest(){
       monthlyInterestRate = (annualInterestRate / TWELVEMONTH) * savingsBalance;
       savingsBalance += monthlyInterestRate;

    }
    public static void setModifyInterestRate(double newInterestRate){
        annualInterestRate = newInterestRate;
    }
    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    //getters method


    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }
}



