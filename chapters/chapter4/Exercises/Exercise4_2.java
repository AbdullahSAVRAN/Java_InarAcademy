package chapter4.Exercises;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Exercise4_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter point 1 (latitute and longidute) in degrees :");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.println("Enter point 2 (latitute and longitute) in degrees ;");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double radian1 = Math.toRadians(x1);
		double radian2 = Math.toRadians(y1);
		double radian3 = Math.toRadians(x2);
		double radian4 = Math.toRadians(y2);

		double a = Math.sin(radian1);
		double radius = 637101;
		double distance = (radius * Math.acos(a) * Math.sin(radian3) * Math.cos(radian1) * Math.cos(radian3)
				* Math.cos(radian2 - radian4));

		System.out.println("The distance between the two points is : " + distance);
	}

}
