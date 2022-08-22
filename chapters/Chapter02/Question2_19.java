package chapter0_2;

import java.util.Scanner;

public class Question2_19 {

	public static void main(String[] args) {
		// GEOMETRY : AREA OF A TRIANGLE

		Scanner input = new Scanner(System.in);
		System.out.println("Enter X1 : ");
		double X1 = input.nextDouble();
		System.out.println("Enter Y1 : ");
		double Y1 = input.nextDouble();
		System.out.println("Enter X2 : ");
		double X2 = input.nextDouble();
		System.out.println("Enter Y2 : ");
		double Y2 = input.nextDouble();
		System.out.println("Enter X3 : ");
		double X3 = input.nextDouble();
		System.out.println("Enter Y3 : ");
		double Y3 = input.nextDouble();
		double side1 = Math.pow((Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2)), 0.5);
		double side2 = Math.pow((Math.pow((X3 - X2), 2) + Math.pow((Y3 - Y2), 2)), 0.5);
		double side3 = Math.pow((Math.pow((X1 - X3), 2) + Math.pow((Y1 - Y3), 2)), 0.5);
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
		System.out.println("The are of the triangle is : " + area);

	}

}
