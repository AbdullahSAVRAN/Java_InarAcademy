package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_9 {

	public static void main(String[] args) {

		// Business : check ISBN -10

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer : ");
		int d1 = input.nextInt();
		int d2 = input.nextInt();
		int d3 = input.nextInt();
		int d4 = input.nextInt();
		int d5 = input.nextInt();
		int d6 = input.nextInt();
		int d7 = input.nextInt();
		int d8 = input.nextInt();
		int d9 = input.nextInt();

		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		System.out.println("The ISBN number is : " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
	}

}
