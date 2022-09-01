package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double x1 = (int) (Math.random() * 41);
		double y1 = (int) (Math.random() * 41);
		double x2 = (int) (Math.random() * 41);
		double y2 = (int) (Math.random() * 41);
		double x3 = (int) (Math.random() * 41);
		double y3 = (int) (Math.random() * 41);

		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		double angle1 = Math.toDegrees(Math.acos(((a * a) - (b * b) - (c * c)) / (-2 * b * c)));
		double angle2 = Math.toDegrees(Math.acos(((b * b) - (a * a) - (c * c)) / (-2 * a * c)));
		double angle3 = Math.toDegrees(Math.acos(((c * c) - (b * b) - (a * a)) / (-2 * a * b)));

		System.out.println("The three angles are " + Math.round(angle1 * 100) / 100.0 + " "
				+ Math.round(angle2 * 100) / 100.0 + " " + Math.round(angle3 * 100) / 100.0);
		System.out.println("The sum of the angles is : " + (angle1 + angle2 + angle3));

	}

}
