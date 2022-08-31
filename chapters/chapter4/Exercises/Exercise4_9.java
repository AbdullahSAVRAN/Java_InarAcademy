package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a character : ");
		char ch = input.next().charAt(0);

		int code = (int) ch;

		System.out.println("The unicode for the character " + ch + " is " + code);

	}

}
