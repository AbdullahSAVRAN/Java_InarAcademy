package chapter0_2;

import java.util.Scanner;

public class Question2_16 {

	public static void main(String[] args) {
		// GEOMETRY : AREA OF A HEXAGON

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side : ");
		double s = input.nextDouble();
		double AreaOfHexagon = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(s, 2);
		System.out.println("The area of the Hexagon : " + AreaOfHexagon);

	}

}
