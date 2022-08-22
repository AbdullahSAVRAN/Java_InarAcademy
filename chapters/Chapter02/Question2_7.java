package chapter0_2;

import java.util.Scanner;

public class Question2_7 {

	public static void main(String[] args) {
		// FIND THE NUMBER OF YEARS

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes : ");
		int minute = input.nextInt();

		int MinutesOfDay = 24 * 60;
		int MinutesOfYear = 365 * MinutesOfDay;
		int year = minute / MinutesOfYear;
		int day = (minute - (MinutesOfYear * year)) / MinutesOfDay;
		System.out.println(minute + " minutes is approximately " + year + " years and " + day + " days");

	}

}
