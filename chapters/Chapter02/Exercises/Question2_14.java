package chapter0_2.Exercises;

import java.util.Scanner;

public class Question2_14 {

	public static void main(String[] args) {
		// HEALTH APPLICATION : COMPUTING BMI

		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds : ");
		double pounds = input.nextDouble();
		System.out.println("Enter height in inches : ");
		double inches = input.nextDouble();
		double kilograms = pounds * 0.45359237;
		double meters = inches * 0.0254;
		double BMI = kilograms / (meters * meters);
		System.out.println("BMI is : " + BMI);

	}

}
