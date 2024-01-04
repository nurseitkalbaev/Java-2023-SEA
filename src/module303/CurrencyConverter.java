package module303;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();


        // Write your code here.
        NumberFormat usCurr = NumberFormat.getCurrencyInstance();
        String us = usCurr.format(payment);
        NumberFormat chinaCurr = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaCurr.format(payment);
        NumberFormat franceCurr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceCurr.format(payment);

        Locale indianLocale = new Locale("EN", "IN");
        DecimalFormat indianCurr = (DecimalFormat) NumberFormat.getCurrencyInstance(indianLocale);
        String india = indianCurr.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}
