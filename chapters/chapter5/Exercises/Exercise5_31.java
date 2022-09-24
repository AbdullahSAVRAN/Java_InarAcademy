package chapters.chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_31 {
    public static void main(String[] args) {
       //Financial application: compute CD value
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your amount : ");
        double amount = input.nextDouble();
        System.out.println("Enter annual interest rate : ");
        double rate = input.nextDouble();

        System.out.println("Enter number of years : ");
        double year = input.nextDouble();

        for ( int i =1; i <= year; i++ ){
            amount = amount + amount * rate / 1200;
            System.out.printf("After %d months,CD is worth %5.2f",i,amount);
            System.out.println();
        }

    }
}
