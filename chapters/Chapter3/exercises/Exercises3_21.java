package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_21 {

	public static void main(String[] args) {

		// Science: day of the week

		Scanner input = new Scanner(System.in);

		System.out.println("Enter year : ");
		int year = input.nextInt();
		System.out.println("Enter month (1-12) :");
		int m = input.nextInt();
		System.out.println("Enter the day of the month (1-31)");
		int q = input.nextInt();
		double j = year / 100;
		int k = year % 100;
		int h = (int) ((q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7);

		if (h == 0) {
			System.out.println("Saturday");
		} else if (h == 1) {
			System.out.println("Sunday");
		} else if (h == 2) {
			System.out.println("Monday");
		} else if (h == 3) {
			System.out.println("Tuesday");
		} else if (h == 4) {
			System.out.println("Wednesday");
		} else if (h == 5) {
			System.out.println("Thursday");

		} else if (h == 6) {
			System.out.println("Friday");
		}

	}

}
