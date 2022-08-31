package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_18 {

	public static void main(String[] args) {
		// Student major and status

		Scanner input = new Scanner(System.in);

		System.out.println("Enter two charaters :");
		String status = input.nextLine();

		char major = status.charAt(0);
		char year = status.charAt(1);

		String s1 = "";
		String s2 = "";

		if (major == 'M') {
			s1 = "Mathematics";
		} else if (major == 'I') {
			s1 = "Information Technology";
		} else if (major == 'C') {
			s1 = "Computer Science";
		}
		if (year == '1') {
			s2 = "Freshman";
		} else if (year == '2') {
			s2 = "Sophomore";
		} else if (year == '3') {
			s2 = "Junior";
		} else if (year == '4') {
			s2 = "Senior";
		}

		System.out.println(s1 + "  " + s2);
	}
}
