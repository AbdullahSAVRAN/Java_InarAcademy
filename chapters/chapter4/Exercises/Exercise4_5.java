package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of sides :");
		double numberOfSide = input.nextDouble();

		System.out.println("Enter the side : ");
		double side = input.nextDouble();
		double π = 180;
		double x = Math.toRadians(π / numberOfSide);

		double area = ((numberOfSide * (Math.pow(side, 2))) / (4 * (Math.tan(x))));

		System.out.println("The area of the polygon is : " + area);

	}

}
