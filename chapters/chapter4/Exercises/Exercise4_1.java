package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter radius :");
		double r = input.nextDouble();

		
		double s = (2 * r * Math.sin(Math.PI / 5));

		double area = ((5 * Math.pow(s, 2)) / ((4 * Math.tan(Math.PI / 5))));

		System.out.println("The area of the pentagon : " +  area);

		
	}

}
