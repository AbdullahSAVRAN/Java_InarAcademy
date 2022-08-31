package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the radius of the bounding circle : ");
		double radius = input.nextDouble();

		double angle = Math.toRadians(360 / 5.0);

		double p1 = angle;
		double p2 = angle * 2;
		double p3 = angle * 3;
		double p4 = angle * 4;
		double p5 = angle * 5;

		System.out.print(radius * Math.sin(p1));
		System.out.println(radius * Math.cos(p1));

		System.out.print(radius * Math.sin(p2));
		System.out.println(radius * Math.cos(p2));

		System.out.print(radius * Math.sin(p3));
		System.out.println(radius * Math.cos(p3));

		System.out.print(radius * Math.sin(p4));
		System.out.println(radius * Math.cos(p4));

		System.out.print(radius * Math.sin(p5));
		System.out.println(radius * Math.cos(p5));
	}

}
