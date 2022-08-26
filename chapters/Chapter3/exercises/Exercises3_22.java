package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_22 {

	public static void main(String[] args) {
		// Geometry : point in a circle?

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point with two coordinates :");
		int a = input.nextInt();
		int b = input.nextInt();

		int radius = 10;

		double x = ((a * a) - (2 * a * 10) + (10 * 10));
		double y = ((b * b) - (2 * b * 10) + (10 * 10));
		double distance = (Math.pow(x + y, 0.5));

		if (distance < radius) {
			System.out.println("Point is in the circle");
		} else if (distance > radius) {
			System.out.println("Point is not in the circle");
		}

	}

}
