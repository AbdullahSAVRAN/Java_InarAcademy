package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_8 {

	public static void main(String[] args) {
		// Sort three integers

		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers :");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();

		if (number1 > number2 && number2 > number3) {
			System.out.println(number1 + " " + number2 + " " + number3);

		} else if (number1 > number2 && number3 > number2 && number1 > number3) {
			System.out.println(number1 + " " + number3 + " " + number2);
		} else if (number2 > number1 && number1 > number3 && number1 > number3) {
			System.out.println(number2 + " " + number1 + " " + number3);

		} else if (number2 > number1 && number3 > number1 && number2 > number3) {
			System.out.println(number2 + " " + number3 + " " + number1);

		} else if (number3 > number1 && number1 > number2) {
			System.out.println(number3 + " " + number1 + " " + number2);
		} else if (number3 > number1 && number2 > number1) {
			System.out.println(number3 + " " + number2 + " " + number1);
		}

	}

}
