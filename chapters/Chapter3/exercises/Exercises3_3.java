package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_3 {

	public static void main(String[] args) {

		// Algebra : solve 2 * 2 linear equations

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a,b,c,d,e,f :");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		double x;
		double y;

		// e = (a * x) + (b * y);
		// f = (c * x) + (d * y);

		x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		y = ((a * f) - (e * c)) / ((a * d) - (b * c));

		System.out.println("x is " + x + " and " + " y is " + y);

	}

}
