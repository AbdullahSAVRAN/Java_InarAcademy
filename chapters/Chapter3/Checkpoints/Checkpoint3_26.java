package Chapter3.Checkpoints;

import java.util.Scanner;

public class Checkpoint3_26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight :");
		int weight = input.nextInt();
		System.out.println("Enter your height :");
		int height = input.nextInt();

		boolean statu = true;

		if (weight > 50 || height > 60) {
			System.out.println(statu);

		}
	}

}
