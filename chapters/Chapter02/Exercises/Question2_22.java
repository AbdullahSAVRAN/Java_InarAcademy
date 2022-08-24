package chapter0_2.Exercises;

import java.util.Scanner;

public class Question2_22 {

	public static void main(String[] args) {
		// FINANCIAL APPLICATION : MONETARY UNITS

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the amount : ");
		int amount = input.nextInt();
		int dollars = amount / 100;
		dollars = dollars % 100;
		int cents = amount % 100;
		System.out.println(dollars + " dollars and " + cents + " cents ");

	}

}
