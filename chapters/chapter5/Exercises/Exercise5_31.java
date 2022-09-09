package chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_31 {

	public static void main(String[] args) {
        //Financial application : compute CD value
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the initial amount: ");
		double amount = input.nextDouble();

		System.out.print("Enter annual percentage: ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200.0;

		System.out.print("Enter months: ");
		double numberOfMonths = input.nextInt();

		System.out.print("Months\t\tCD Value\n");
		double amountInAccount = amount;
		for (int i = 1; i <= numberOfMonths; i++) {
			amountInAccount *= (1 + monthlyInterestRate);
			System.out.printf("%4d%20.2f\n", i, amountInAccount);

		}

	}
}
