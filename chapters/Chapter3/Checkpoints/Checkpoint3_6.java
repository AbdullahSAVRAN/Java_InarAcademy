package Chapter3.Checkpoints;

import java.util.Scanner;

public class Checkpoint3_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a new score : ");
		int score = input.nextInt();
		System.out.println("Enter your pay : ");
		double pay = input.nextDouble();

		if (score > 90) {
			pay = (pay + ((pay * 3) / 100));
			System.out.println("Your new payment is : " + pay);
		} else {
			pay = (pay + ((pay * 1) / 100));
			System.out.println("Your new payment is : " + pay);
		}

	}

}
