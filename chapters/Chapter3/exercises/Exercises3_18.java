package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_18 {

	public static void main(String[] args) {
		// Cost of shipping

		Scanner input = new Scanner(System.in);

		System.out.println("Enter weight of the package :");
		double weight = input.nextDouble();

		if (0 < weight && weight <= 1) {
			System.out.println("Cost of shipping is $3.5 ");
		} else if (1 < weight && weight <= 3) {
			System.out.println("Cost of shipping is $5.5 ");
		} else if (3 < weight && weight <= 10) {
			System.out.println("Cost of shipping is $8.5 ");
		} else if (10 < weight && weight <= 20) {
			System.out.println("Cost of shipping is $10.5 ");

		} else if (weight > 50) {
			System.out.println("The package cannot be shipped");
		}
	}

}
