package Chapter3.Checkpoints;

import java.util.Scanner;

public class Checkpoint3_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number :");
		int x = input.nextInt();
		System.out.println(Math.abs(x - 5) < 4.5);
		System.out.println(Math.abs(x - 5) > 4.5);

	}

}
