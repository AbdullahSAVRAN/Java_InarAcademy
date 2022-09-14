package chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_49 {

	public static void main(String[] args) {
		// Count vowels and consonants

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your text.");
		String s = input.nextLine();
		int countV = 0;
		int countC = 0;
		int l = s.length();
		int countSpace = 0;
		for (int i = 0; i < l; i++) {

			if (s.charAt(i) == ' ') {
				countSpace++;
			} else if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
					|| s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
					|| s.charAt(i) == 'o' || s.charAt(i) == 'u') {

				countV++;

			} else {
				countC++;

			}

		}
		System.out.println("The number of vowels is :" + countV);
		System.out.println("The number of consonants is :" + countC);
		System.out.println("The number of space is : " + countSpace);
	}

}
