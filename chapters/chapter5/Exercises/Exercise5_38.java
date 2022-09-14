package chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_38 {

	public static void main(String[] args) {
		// Decimal to octal

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a decimal ");
		int dec = input.nextInt();
		String oct = "";
		for (int i = dec; i > 0; i /= 8) {
			oct = i % 8 + oct;
		}
		System.out.println(oct);
	}

}
