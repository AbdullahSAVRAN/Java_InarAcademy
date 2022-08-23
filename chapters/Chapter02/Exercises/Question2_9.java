package chapter0_2.Exercises;

import java.util.Scanner;

public class Question2_9 {

	public static void main(String[] args) {
		// PHYSICS : ACCELERATION

		Scanner input = new Scanner(System.in);
		System.out.println("Enter V0 in m/s : ");
		double v0 = input.nextDouble();
		System.out.println("Enter V1 in m/s : ");
		double v1 = input.nextDouble();
		System.out.println("Enter Time in second :");
		double t = input.nextDouble();

		double acceleration = (v1 - v0) / t;

		System.out.println("The average acceleration is : " + acceleration);
	}

}
