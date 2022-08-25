package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_2 {

	public static void main(String[] args) {

		// Game : add three numbers

		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() % 10);
		int number3 = (int) (System.currentTimeMillis() % 10);

		Scanner input = new Scanner(System.in);

		System.out.println("What is " + number1 + "   " + number2 + "   " + number3 + " ? ");
		int number = input.nextInt();

		System.out.println(
				number1 + " + " + number2 + " + " + number3 + " is " + (number1 + number2 + number3 == number));
	}

}
