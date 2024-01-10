package PracticeAssignment;

public class SavingsAccountDriver {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        SavingsAccount.setModifyInterestRate(0.03);
        saver1.setSavingsBalance(2000.0);
        saver2.setSavingsBalance(3000.0);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver1 new balance is "+saver1.getSavingsBalance());
        System.out.println("Saver2 new balance is "+saver2.getSavingsBalance());


        SavingsAccount.setModifyInterestRate(0.04);
        saver2.calculateMonthlyInterest();
        saver1.calculateMonthlyInterest();
        System.out.println("Saver1 new balance is "+saver1.getSavingsBalance());
        System.out.println("Saver2 new balance is "+saver2.getSavingsBalance());



    }

}
