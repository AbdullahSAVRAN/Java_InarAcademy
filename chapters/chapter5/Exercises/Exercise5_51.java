package chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_51 {

	public static void main(String[] args) {
		// Longest common prefix

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first string : ");
		String s1 = input.nextLine();

		System.out.println("Enter first string : ");
		String s2 = input.nextLine();

		int l1 = s1.length();
		int l2 = s2.length();
		String common = "";

		if (s1.charAt(0) != s2.charAt(0)) {
			System.err.println("Invalid input.There is no common prefix.TRY AGAIN...");
			System.exit(0);
		}

		for (int i = 0; i < l1; i++) {
			for (int j = 0; j < l2; j++) {

				if (s1.charAt(i) == s2.charAt(j)) {
					common += s1.charAt(i);
				}
			}
		}
		System.out.println("The common prefix is : " + common);

	}
}
