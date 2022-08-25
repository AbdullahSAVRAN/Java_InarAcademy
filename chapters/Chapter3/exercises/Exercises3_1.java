package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_1 {

	public static void main(String[] args) {

		// Algebra: solve quadratic equations

		Scanner input = new Scanner(System.in);

		System.out.println("Enter three number : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double r1 = (-b + (Math.pow((b * b) - 4 * a * c, 0.5))) / (2 * a);
		double r2 = (-b - (Math.pow((b * b) - 4 * a * c, 0.5))) / (2 * a);

		if (((b * b) - 4 * a * c) > 0) {
			System.out.println("The equtation has two roots " + r1 + " and " + r2);

		} else if (((b * b) - 4 * a * c) == 0) {
			System.out.println("The equtation has one root " + (int) r1);
		} else if (((b * b) - 4 * a * c) < 0) {
			System.out.println("The equtation has no real roots ");

		}

	}

}
