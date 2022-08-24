package Chapter3.Checkpoints;

import java.util.Scanner;

public class Checkpoint3_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a new score : ");
		int score = input.nextInt();
		System.out.println("Enter a new pay : ");
		double pay = input.nextDouble();
		pay = (pay + ((pay * 3) / 100));
		if (score > 90) {
			System.out.println("Your new payment is : " + pay);
		} else {
			System.out.println("You are lucky.Your payment doesnt change");
		}
	}

}
