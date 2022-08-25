package Chapter3.exercises;

import java.util.Scanner;

public class Exercises2_14 {

	public static void main(String[] args) {
		// Game : heads or tails

		Scanner input = new Scanner(System.in);

		int a = (int) Math.random() * 2;
		System.out.println("Please enter 1 for head and enter 2 for tails : ");
		int choice = input.nextInt();

		if (a == 1 && choice == 1) {
			System.out.println("Your guess is correct ");
		} else if (a == 0 && choice == 0) {
			System.out.println("Your guess is correct ");
		} else
			System.out.println("Your guess is incorrect");

	}

}
