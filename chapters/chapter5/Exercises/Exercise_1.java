package chapter5.Exercises;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		// Count positive and negative numbers and compute the average of numbers

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your numbers : ");
		int number = input.nextInt();

		int total = 0;
		int count = 0;
		double average = 0;
		int countP = 0;
		int countN = 0;

		while (number != 0) {
			total += number;
			count++;
			if (number == 0) {
				System.err.println("No numbers are entered except 0");
				System.exit(0);
			} else if (number > 0) {
				countP++;
			} else if (number < 0) {
				countN++;

			}
			number = input.nextInt();
		}

		average = total / count;
		System.out.println("The number of positives is :" + countP);
		System.out.println("The number of negative is : " + countN);
		System.out.println("The total is : " + total);
		System.out.println("The average is : " + average);
	}

}
