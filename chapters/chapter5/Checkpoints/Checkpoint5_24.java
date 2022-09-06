package chapter5.Checkpoints;

import java.util.Scanner;

public class Checkpoint5_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter balance :");
		int balance = input.nextInt();

		while (true) {
			if (balance < 9)
				break;
			balance = balance - 9;
		}
		System.out.println("Balance is " + balance);

		System.out.println("Enter new number");
		int x = input.nextInt();
		while (true) {
			if (x < 9)
				continue;
			x = x - 9;

			System.out.println("x is " + x);
		}
	}
}