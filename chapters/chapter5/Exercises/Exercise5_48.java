package chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_48 {

	public static void main(String[] args) {
		// Process String

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a text ");
		String s = input.nextLine();
		int l = s.length();
		String newS = "";
		for (int i = 0; i < l; i = i + 2) {
			newS += s.charAt(i);
		}
		System.out.println(newS);
	}

}
