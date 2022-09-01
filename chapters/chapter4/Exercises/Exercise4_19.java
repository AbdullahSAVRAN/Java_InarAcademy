package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first 9 number in ISBN : ");
		String isbn = input.nextLine();

		int digit1 = Integer.parseInt(String.valueOf(isbn.charAt(0)));
		int digit2 = Integer.parseInt(String.valueOf(isbn.charAt(1)));
		int digit3 = Integer.parseInt(String.valueOf(isbn.charAt(2)));
		int digit4 = Integer.parseInt(String.valueOf(isbn.charAt(3)));
		int digit5 = Integer.parseInt(String.valueOf(isbn.charAt(4)));
		int digit6 = Integer.parseInt(String.valueOf(isbn.charAt(5)));
		int digit7 = Integer.parseInt(String.valueOf(isbn.charAt(6)));
		int digit8 = Integer.parseInt(String.valueOf(isbn.charAt(7)));
		int digit9 = Integer.parseInt(String.valueOf(isbn.charAt(8)));

		int sum = ((digit1 * 1) + (digit2 * 2) + (digit3 * 3) + (digit4 * 4) + (digit5 * 5) + (digit6 * 6)
				+ (digit7 * 7) + (digit8 * 8) + (digit9 * 9));

		int digit10 = sum % 11;
		if (digit10 == 10) {
			isbn += "X";
		} else {
			isbn += digit10;
		}
		System.out.println("The ISBN-10 is " + isbn);
	}

}
