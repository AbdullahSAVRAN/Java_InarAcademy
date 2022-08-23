package chapter0_2.Exercises;

import java.util.Scanner;

public class Question2_23 {

	public static void main(String[] args) {
		// COST OF DRIVING

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the driving distance : ");
		double distance = input.nextDouble();
		System.out.println("Enter miles per gallon : ");
		double miles = input.nextDouble();
		System.out.println("Enter price per gallon : ");
		double price = input.nextDouble();
		double cost = (distance / miles) * price;
		System.out.println("The cost of driving is : $ " + cost);

	}

}
