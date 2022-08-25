package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_26 {

	public static void main(String[] args) {
		// Use the &&, || and ^ operators

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int number = input.nextInt();
		boolean statu = true;
		boolean statu1 = false;
		if (number % 6 == 0 && number % 5 == 0) {
			System.out.println("Is " + number + " divisible by 6 and 5 ?" + " " + statu);
		} else if ((number % 6 != 0 && number % 5 == 0) || (number % 5 != 0 && number % 6 == 0)) {
			System.out.println("Is " + number + " divisible by 6 or 5 ? " + " " + statu);
		} else if (number % 6 != 0 && number % 5 != 0) {
			System.out.println("Is " + number + " divisible by 6 and 5 ? " + " " + statu1);
		}
	}

}
