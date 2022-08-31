package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter : ");
		String letter = input.next();
		letter = letter.toLowerCase();

		int num = 0;

		if ("abc".contains(letter)) {
			num = 1;
			System.out.println("number is " + num);
		} else if ("def".contains(letter)) {
			num = 2;
			System.out.println("number is " + num);
		} else if ("ghi".contains(letter)) {
			num = 3;
			System.out.println("number is " + num);
		} else if ("jkl".contains(letter)) {
			num = 4;
			System.out.println("number is " + num);
		} else if ("mno".contains(letter)) {
			num = 5;
			System.out.println("number is " + num);
		} else if ("pqr".contains(letter)) {
			num = 6;
			System.out.println("number is " + num);
		} else if ("stu".contains(letter)) {
			num = 7;
			System.out.println("number is " + num);
		} else if ("vwx".contains(letter)) {
			num = 8;
			System.out.println("number is " + num);
		} else if ("yz".contains(letter)) {
			num = 9;
			System.out.println("number is " + num);
		} else {
			System.out.println("invalid character ");
		}

	}

}
