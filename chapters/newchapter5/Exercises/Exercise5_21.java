package chapters.newchapter5.Exercises;

import java.util.Scanner;

public class Exercise5_21 {
    public static void main(String[] args) {
        //Financial application: compare loans with various interest rates
        Scanner input = new Scanner(System.in);
        System.out.println("Enter loan amount : ");
        int loan = input.nextInt();
        System.out.println("Enter number of years");
        int years = input.nextInt();
        System.out.println("INTEREST RATE - MONTHLY PAYMENT - TOTAL AMOUNT");
        for(double i =5.0; i<=8.0; i += 0.125){
            double monthlyIntRate = i / 1200;
            double monthlyPayment = loan * monthlyIntRate / (1 - 1 / Math.pow(1 + monthlyIntRate, years * 12));
            double totalPayment = monthlyPayment * years * 12;
            System.out.printf("%.3f", i);
            System.out.print("%");
            System.out.printf("\t\t\t%.2f", monthlyPayment);
            System.out.printf("\t\t\t\t%.2f", totalPayment);
            System.out.println();
        }
    }

}
