package Chapter3.exercises;

import java.util.Scanner;

public class Exercices3_34 {

	public static void main(String[] args) {
		// Geometry : point on line segment

		Scanner input = new Scanner(System.in);

		System.out.println("Enter three points for p0 , p1 , p2 :");
		double p0 = input.nextDouble();
		double p1 = input.nextDouble();
		double p2 = input.nextDouble();

		if ((p0 > p1) && (p1 > p2)) {
			System.out.println(p1 + " is on the line segment from " + p0 + " to " + p2);
		} else if ((p1 > p0) && (p0 > p2)) {
			System.out.println(p0 + " is on the line segment from " + p1 + " to " + p2);
		} else if ((p2 > p1) && (p1 > p0)) {
			System.out.println(p1 + " is on the line segment from " + p0 + " to " + p2);
		} else if ((p2 > p0) && (p0 > p1)) {
			System.out.println(p0 + " is on the line segment from " + p1 + " to " + p2);
		} else if ((p0 > p2) && (p2 > p1)) {
			System.out.println(p2 + " is on the line segment from " + p0 + " to " + p1);
		} else if ((p1 > p2) && (p2 > p0)) {
			System.out.println(p2 + " is on the line segment from " + p0 + " to " + p1);
		}
	}

}
