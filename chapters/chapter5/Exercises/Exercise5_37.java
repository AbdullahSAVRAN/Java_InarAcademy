package chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_37 {

	public static void main(String[] args) {
		// Decimal to binary

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number as an integer");
		int number = input.nextInt();

		String bin = "";
		String value = "";
		int l = bin.length();
		for (int i = number; i > 0; i = i / 2) {
			int x = i % 2;

			bin = " " + x;
			System.out.print(bin);
		}
	}
}
