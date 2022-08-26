package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_25 {

	public static void main(String[] args) {
		// Geometry : Intersecting points

		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1, x2, x3, x4, y1, y2, y3, y4;
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		x4 = input.nextDouble();
		y4 = input.nextDouble();

		double a, b, c, d, e, f;
		a = y1 - y2;
		b = -(x1 - x2);
		c = y3 - y4;
		d = -(x3 - x4);
		e = a * x1 - b * y1;
		f = c * x3 - d * y3;

		double DxDy = a * d - b * c;

		if (DxDy < 0.000000001) {
			System.out.println("The lines are parallel.");

		} else {

			double x = (e * d - b * f) / DxDy;
			double y = (a * f - e * c) / DxDy;

			System.out.println("The intersecting point is at (" + x + "," + y + ")");
		}

	}

}
