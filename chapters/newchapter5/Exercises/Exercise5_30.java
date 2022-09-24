package chapters.newchapter5.Exercises;

import java.util.Scanner;

public class Exercise5_30 {
    public static void main(String[] args) {
        //Financial application: compound value
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your amount : ");
        double amount = input.nextDouble();
        System.out.println("Enter annual interest rate : ");
        double rate = input.nextDouble();
        double newRate = rate / 100;
        System.out.println("Enter number of years : ");
        double year = input.nextDouble();

        double total = 0;
        for (int i = 1; i <= year; i++){
             total = (total + amount) * (1 + newRate / 12);


    }
        System.out.printf("%3.3f",total);
    }
}
