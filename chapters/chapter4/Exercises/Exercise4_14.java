package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter grade : ");
		String grade = input.next();

		switch (grade) {
		case "A":
			System.out.println("The numeric value for grade " + grade + " is " + 4);
			break;
		case "B":
			System.out.println("The numeric value for grade " + grade + " is " + 3);
			break;
		case "C":
			System.out.println("The numeric value for grade " + grade + " is " + 2);
			break;
		case "D":
			System.out.println("The numeric value for grade " + grade + " is " + 1);
			break;
		case "F":
			System.out.println("The numeric value for grade " + grade + " is " + 0);
			break;
		}

	}
}
