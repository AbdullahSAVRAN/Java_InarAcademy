package chapter0_2.Exercises;

import java.util.Scanner;

public class Question2_10 {

	public static void main(String[] args) {
		// SCIENCE : CALCULATING ENERGY

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of water in kilograms : ");
		double M = input.nextDouble();
		System.out.println("Enter the initial temperature in celsius : ");
		double InitialTemperature = input.nextDouble();
		System.out.println("Enter the final temperature in celsius : ");
		double FinalTemperature = input.nextDouble();
		// Q = NEEDED ENERGY

		double Q = M * (FinalTemperature - InitialTemperature) * 4184;
		System.out.println("The energy needed is : " + Q + " joules");

	}

}
