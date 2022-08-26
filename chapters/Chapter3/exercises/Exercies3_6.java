package Chapter3.exercises;

import java.util.Scanner;

public class Exercies3_6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter weight in pounds : ");
		double weight = input.nextDouble();

		System.out.println("Enter feet :");
		double feet = input.nextDouble();

		System.out.println("Enter inches :");
		double inches = input.nextDouble();

		double newWeight = (weight * 0.45359237);
		double newInches = (inches * 0.0254);

		double bmi = newWeight / (newInches * newInches);
		System.out.println("bmi is :" + bmi);
		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (bmi > 18.5 && bmi < 25) {
			System.out.println("Normal");
		} else if (bmi > 25 && bmi < 30) {
			System.out.println("Overweight");
		} else
			System.out.println("Obese");

	}

}
