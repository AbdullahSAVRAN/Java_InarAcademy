package chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_47 {

	public static void main(String[] args) {
		// Business: check ISBN-13

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your ISBN as a 12 digits : ");
		String isbn = input.nextLine();
		int l = isbn.length();

		int s = 0;
		int s1 = 0;
		int s2 = 0;
		int d13 = 0;

		for (int i = 1; i < l; i++) {

			if (l < 12) {
				System.err.println("Invalid input");
			}
			if (i % 2 == 0) {
				int x = isbn.charAt(i);
				s1 += x;
			} else {
				s2 += isbn.charAt(i) * 3;
			}
			s = s1 + s2;
			d13 = 10 - (s % 10);

		}
		System.out.println(isbn + d13);
	}

}
