package chapter0_2.Exercises;

import java.util.Scanner;

public class Question2_22 {

	public static void main(String[] args) {
		// FINANCIAL APPLICATION : MONETARY UNITS

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		double amount = input.nextDouble();
		int remainingAmount = (int) (amount * 100);
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		System.out.println(numberOfOneDollars + " dollars and " + numberOfNickels + " cents");

	}

}
