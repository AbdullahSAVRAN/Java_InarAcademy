package chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_14 {

	public static void main(String[] args) {
        
		//Compute the greatest common divisor
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first positive integer: ");
		int number1 = input.nextInt();

		System.out.println("Enter the second positive integer: ");
		int number2 = input.nextInt();

		int divisor = Math.min(number1, number2);

		while (number1 % divisor != 0 || number2 % divisor != 0) {
			divisor--;
		}
		System.out.println("The GCD of " + number1 + " and " + number2 + " is " + divisor);
	}
}
