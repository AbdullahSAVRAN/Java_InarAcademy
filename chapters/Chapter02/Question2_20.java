package chapter0_2;

import java.util.Scanner;

public class Question2_20 {

	public static void main(String[] args) {
		// FINANCIAL APPLICATION : CALCULATE INTEREST

		Scanner input = new Scanner(System.in);
		System.out.println("Enter balance : ");
		double balance = input.nextDouble();
		System.out.println("Enter annual interest rate : ");
		double AnnualInterestRate = input.nextDouble();
		double interest = balance * (AnnualInterestRate / 1200);
		System.out.println("The interest is : " + interest);

	}

}
