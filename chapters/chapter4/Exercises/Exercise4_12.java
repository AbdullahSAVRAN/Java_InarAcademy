package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a hex digit :");
		String hex = input.next();

		int decimal = Integer.parseInt(hex, 16);

		String binary = Integer.toBinaryString(decimal);
		System.out.println(binary);

	}

}
