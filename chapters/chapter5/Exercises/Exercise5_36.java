package chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_36 {

	public static void main(String[] args) {
        //Business application : checking ISBN
		
		Scanner input = new Scanner(System.in);

		String number = "";
		int d10 = 0;
		for (int j = 1; j < 10; j++) {
			System.out.println("Enter digit for ISBN : ");
			int d1 = input.nextInt();
			number += d1;
			d10 += (d1 * j);
			d10 %= 11;

			System.out.print("ISBN :" + "  " + number + d10);

		}
	}
}
