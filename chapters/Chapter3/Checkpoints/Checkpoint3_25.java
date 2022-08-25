package Chapter3.Checkpoints;

import java.util.Scanner;

public class Checkpoint3_25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = input.nextInt();
		boolean statu = true;

		if (age > 13 && age < 18) {
			System.out.println(statu);

		}
	}

}
