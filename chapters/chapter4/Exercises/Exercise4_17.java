package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a year :");
		int year = input.nextInt();

		System.out.println("Enter a month with the first letter in uppercase :");
		String month = input.next();
		char ch = (char) month.charAt(0);
		if (ch < 65 || ch > 90) {
			System.err.println("Please try again,Write a month with the first letter in uppercase");
		}

		switch (month) {
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":
			System.out.println(month + " " + year + " has 31 days ");
			break;
		case "Apr":
		case "Jun":
		case "Nov":
		case "Sep":
			System.out.println(month + " " + year + " has 30 days ");
			break;
		case "Feb":
			if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
				System.out.println(month + " " + year + " has 28 days ");
			} else {
				System.out.println(month + " " + year + " has 29 days ");
			}
		}

	}

}
