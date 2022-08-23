package chapter0_2.Exercises;

import java.util.Scanner;

public class Question2_21 {

	public static void main(String[] args) {
		// FINANCIAL APPLICATION : CALCULATE FUTURE INVESTMENT VALUE

		Scanner input = new Scanner(System.in);
		System.out.println("Enter investment amount : ");
		double InvestmentAmount = input.nextDouble();
		System.out.println("Enter annual interest rate in percentage : ");
		double AnnualInterestRate = input.nextDouble();
		AnnualInterestRate = AnnualInterestRate / 100;
		double MonthlyInterestRate = AnnualInterestRate / 12;
		System.out.println("Enter number of years : ");
		double years = input.nextDouble();
		double FutureInvestmentValue = InvestmentAmount * Math.pow((1 + MonthlyInterestRate), years * 12);
		System.out.println("Accumulated value is : " + FutureInvestmentValue);

	}

}
