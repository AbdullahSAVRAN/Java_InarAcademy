package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a SSN");
		String ssn = input.nextLine();

		String s1 = "   ";
		String s2 = "  ";
		String s3 = "    ";

		String ssn1 = s1 + s2 + s3;

		if (ssn.length() != ssn1.length()) {
			System.err.println("Invalid social security number");
		} else {
			System.out.println("Valid social security number");
		}

	}

}
