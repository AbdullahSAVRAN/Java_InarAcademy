package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter : ");
		String letter = input.next();
		char value = letter.charAt(0);

		if (value < 65 || value > 122) {
			System.err.println("Invalid input, try again");
		}
		if (value == 65 || value == 69 || value == 73 || value == 79 || value == 85 || value == 97 || value == 101
				|| value == 105 || value == 111 || value == 117) {

			System.out.println(value + " is vowel");
		} else {
			System.out.println(value + " is consonant");
		}

	}
}
