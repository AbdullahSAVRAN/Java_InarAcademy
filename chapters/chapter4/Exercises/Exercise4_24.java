package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_24 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first city : ");
		String city1 = input.nextLine();
		System.out.println("Enter second city : ");
		String city2 = input.nextLine();
		System.out.println("Enter third city : ");
		String city3 = input.nextLine();

		char a = city1.charAt(0);
		char b = city2.charAt(0);
		char c = city3.charAt(0);

		if ('a' < 'b' && 'b' < 'c') {
			System.out.println("The three cities in alphabetical order are :" + city1 + " " + city2 + " " + city3);
		} else if ('a' < 'b' && 'c' < 'b') {
			System.out.println("The three cities in alphabetical order are :" + city1 + " " + city3 + " " + city2);

		} else if ('b' < 'a' && 'a' < 'c') {
			System.out.println("The three cities in alphabetical order are :" + city2 + " " + city1 + " " + city3);
		} else if ('b' < 'a' && 'c' < 'a') {
			System.out.println("The three cities in alphabetical order are :" + city2 + " " + city3 + " " + city1);

		} else if ('c' < 'a' && 'a' < 'b') {
			System.out.println("The three cities in alphabetical order are :" + city3 + " " + city1 + " " + city2);

		} else if ('c' < 'a' && 'b' < 'a') {
			System.out.println("The three cities in alphabetical order are :" + city3 + " " + city2 + " " + city1);
		}

	}

}
