package chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_41 {

	public static void main(String[] args) {
		// Occurence of max numbers

		Scanner input = new Scanner(System.in);

		int max = 0;
		int count = 0;
		int num = 0;

		do {
			System.out.println("Enter an integer (0 ends the input): ");

			num = input.nextInt();

			if (num > max) {
				count = 1;
				max = num;
				continue;
			}
			if (num == max) {
				count++;
			}

		} while (num != 0);

		System.out.println("MAX : " + max);
		System.out.println("COUNT : " + count);
	}
}