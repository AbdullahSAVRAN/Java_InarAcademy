package chapter0_2;

import java.util.Scanner;

public class Question2_12 {

	public static void main(String[] args) {
		// PHYSICS : FINDING RUNWAY LENGTH

		Scanner input = new Scanner(System.in);
		System.out.println("Enter speed in meters/second : ");
		double v = input.nextDouble();
		System.out.println("Enter acceleration meters/second squared :");
		double a = input.nextDouble();
		double length = (v * v) / (2 * a);
		System.out.println("The minimum runway length for this airplane is : " + length);

	}

}
