package week_03;

import java.util.Scanner;

public class Assignment3_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter 4 digit number : ");
		int number = input.nextInt();

		String newNumber = "";

		if (number < 1000 || number > 9999) {
			System.err.println("TRY AGAIN , INVALID NUMBER");
		}

		int d = number % 10;
		int c = (number / 10) % 10;
		int b = (number / 100) % 10;
		int a = (number / 1000) % 10;

		String t = String.valueOf(d);
		String z = String.valueOf(c);
		String y = String.valueOf(b);
		String x = String.valueOf(a);

		newNumber += t;
		newNumber += z;
		newNumber += y;
		newNumber += x;

		System.out.println(newNumber);
	}

}
