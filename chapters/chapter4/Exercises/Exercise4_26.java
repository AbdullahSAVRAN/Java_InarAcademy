package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount (i.e = 11.56) : ");
		String amount = input.next();

		if (amount.length() > 5) {
			System.err.println("Invalid amount, try again");
			System.exit(0);
		}

		String Dollars = amount.substring(0, amount.indexOf(","));

		String cents = amount.substring(amount.indexOf(",") + 1);

		System.out.println(Dollars + " dollars " + cents + " cents");
	}

}
