package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_33 {

	public static void main(String[] args) {
		// Financial : compare costs

		Scanner input = new Scanner(System.in);

		System.out.println("Enter weight and price for package 1 : ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		System.out.println("Enter weight and price for package 2 : ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();

		if ((weight1 < weight2) && (price2 < price1)) {
			System.out.println("Package 2 has a better price.");
		} else if ((weight1 == weight2) && (price2 < price1)) {
			System.out.println("Package 2 has a better price.");
		} else if ((weight2 < weight1) && (price2 < price1)) {
			System.out.println("Package 2 has a better price.");
		} else if ((weight1 > weight2) && (price2 > price1)) {
			System.out.println("Package 1 has a better price.");
		} else if ((weight1 == weight2) && (price1 < price2)) {
			System.out.println("Package 1 has a better price");
		} else if ((weight1 < weight2) && (price1 < price2)) {
			System.out.println("Package 1 has a better price");

		}

		else if ((weight1 == weight2) && (price1 == price2)) {
			System.out.println("Equality");
		}

	}

}
