package Chapter3.Checkpoints;

import java.util.Scanner;

public class Checkpoint3_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter new number :");
		int number = input.nextInt();
		if (1 < number && number < 100) {
			boolean statu = true;
			System.out.println(statu);
		}
		System.out.println("Enter number2 : ");
		int number2 = input.nextInt();
		if (1 < number2 && number2 < 100 || number2 < 0) {
			boolean statu2 = false;
			System.out.println(statu2);

		}
	}
}
