package Chapter3.Checkpoints;

import java.util.Scanner;

public class Checkpoint3_12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter count : ");
		double count = input.nextDouble();
		boolean newLine = true;
		boolean line = false;
		System.out.println(count % 10 == 0 ? newLine : line);

	}

}
