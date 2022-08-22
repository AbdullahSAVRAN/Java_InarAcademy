package chapter0_2;

import java.util.Scanner;

public class Question2_13 {

	public static void main(String[] args) {
		// FINANCIAL APPLICATION : COMPOUND VALUE

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthly saving amount : ");
		double money = input.nextDouble();
		double AnnualInterestRate = 5 / 100;
		// Monthly Interest = AnnualInterestRate / 12
		double MonthlyInterestRate = 0.00417;
		double FirstMonth = money * (1 + MonthlyInterestRate);
		double SecondMonth = (FirstMonth + money) * (1 + MonthlyInterestRate);
		double ThirdMonth = (SecondMonth + money) * (1 + MonthlyInterestRate);
		double FourthMonth = (ThirdMonth + money) * (1 + MonthlyInterestRate);
		double FifthMonth = (FourthMonth + money) * (1 + MonthlyInterestRate);
		double SixthMonth = (FifthMonth + money) * (1 + MonthlyInterestRate);

		System.out.println("After the SIXTH month, the account value is : $ " + SixthMonth);

	}

}
