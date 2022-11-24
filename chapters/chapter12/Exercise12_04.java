package chapters.chapter12;

import java.util.Scanner;

public class Exercise12_04 {
    public static void main(String[] args) {
        //IllegalArgumentException


        Scanner input = new Scanner(System.in);
        boolean b = true;
        while (b) {
            System.out.println("ENTER ANNUAL INTEREST RATE : ");
            double interestRate = input.nextDouble();
            System.out.println("ENTER NUMBER OF YEARS : ");
            int numberOfYears = input.nextInt();
            System.out.println("ENTER LOAN : ");
            double loan = input.nextDouble();
            try {
                newLoan loan1 = new newLoan(interestRate, numberOfYears, loan);
                System.out.println(loan1.getTotalPayment());
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}