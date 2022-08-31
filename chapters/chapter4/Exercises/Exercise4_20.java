package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a message");
		String message = input.nextLine();

		int length = (int) message.length();
		char first = (char) message.charAt(0);

		System.out.println("Length of message is : " + length);
		System.out.println("First character of message is :" + first);

	}

}
