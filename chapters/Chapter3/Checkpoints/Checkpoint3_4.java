package Chapter3.Checkpoints;

import java.util.Scanner;

public class Checkpoint3_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number for y :");
		int y = input.nextInt();

		if (y > 0) {
			System.out.println("x = 1");
		} else {
			System.out.println("Tekrar deneyin");
		}

	}

}
