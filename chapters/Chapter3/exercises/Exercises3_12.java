package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_12 {

	public static void main(String[] args) {
		// Palindrome number

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a three-digit integer :");
		int number = input.nextInt();

		int c = number % 10;
		int number1 = number / 10;
		int b = number1 % 10;
		int a = number / 100;

		if (a == c) {
			System.out.println(number + " is a palindrome");

		}

	}

}
