package chapters.chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_22 {
    public static void main(String[] args) {
       // Financial application: loan amortization schedule
        Scanner input = new Scanner(System.in);
        System.out.println("Enter loan : ");
        double loan = input.nextInt();
        System.out.println("Enter number of years : ");
        int year = input.nextInt();
        System.out.println("Enter annunal interest rate : ");
        double rate = input.nextInt();
        double monthlyInterestRate = rate / 1200;

        double monthlyPayment = loan * monthlyInterestRate
                / (1 - 1 / Math.pow(1 + monthlyInterestRate, year * 12));
        System.out.printf("Monthly Payment: %.2f", monthlyPayment);

        double totalPayment = monthlyPayment * year * 12;

        System.out.printf("\nTotal Payment: %.2f", totalPayment);
        System.out.println();
        double balance = totalPayment;
        double principal;
        System.out.println("\nPayment#\tInterest\tPrincipal\tBalance");
        for (int i = 1; i <= year * 12; i++) {



            double interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%1d\t\t\t%4.2f\t\t%4.2f\t\t%.2f", i, interest, principal, balance);
            System.out.println();

        }
    }
}