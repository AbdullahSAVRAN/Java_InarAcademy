package chapter0_2;

import java.util.Scanner;

public class Question2_15 {

	public static void main(String[] args) {
		// GEOMETRY : DISTANCE OF TWO POINTS

		Scanner input = new Scanner(System.in);
		System.out.println("Enter X1 : ");
		double X1 = input.nextDouble();
		System.out.println("Enter Y1 : ");
		double Y1 = input.nextDouble();
		System.out.println("Enter X2 : ");
		double X2 = input.nextDouble();
		System.out.println("Enter Y2 : ");
		double Y2 = input.nextDouble();
		double Distance = Math.pow((Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2)), 0.5);
		System.out.println("The distance between the two points is : " + Distance);

	}

}
