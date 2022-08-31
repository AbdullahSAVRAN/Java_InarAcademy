package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the side :");
		double side = input.nextDouble();

		double c = Math.toRadians(30);
		double area = ((6 * (Math.pow(side, 2))) / (4 * (Math.tan(c))));
		System.out.println("The area of the hexagon is : " + area);

	}

}
