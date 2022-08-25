package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_31 {

	public static void main(String[] args) {
		// Financials : currency exchange

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the exchange rate from dollars to RMB :");
		double rmb = input.nextDouble();

		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa ");
		double click = input.nextDouble();

		if (click == 0) {
			System.out.println("Enter the dollar amount :");
			double dollars = input.nextDouble();
			double yuan = dollars * 6.81;
			System.out.println("$ " + dollars + " is " + yuan + " yuan");
		} else if (click != 0) {
			System.out.println("Enter the RMB amount :");
			double yuan = input.nextDouble();
			double dollars = yuan * 0.146843;
			System.out.println(yuan + " yuan is $" + dollars);

		}

	}

}
