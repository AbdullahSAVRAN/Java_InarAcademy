package chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_16 {

	public static void main(String[] args) {
         //Find the factors of an integer
         		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer :");
		int number = input.nextInt();

		for (int i = 2; number / i != 1;) {
			if (number % i == 0) {
				System.out.print(i + ",");
				number = number / i;
			} else {
				i++;
			}

		}

		System.out.print(number);
	}

}
