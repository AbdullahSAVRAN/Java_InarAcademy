package chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_30 {

	public static void main(String[] args) {

		// Financial application : compound value

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount : ");

		double amount = input.nextDouble();

		System.out.print("Enter the annual interest rate : ");

		double interestRate = input.nextDouble();

		interestRate = interestRate / 100;

		System.out.println("Enter the number of months: ");

		int numberOfMonths = input.nextInt();

		double total = 0;

		for (int i = 1; i <= numberOfMonths; i++) {

			total = (amount + total) * (1 + (interestRate / 12));

		}

		System.out.println("After the " + numberOfMonths + "th month, " + "value : " + total);

	}

}
