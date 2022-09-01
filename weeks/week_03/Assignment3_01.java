package week_03;

import java.util.Scanner;

public class Assignment3_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your salary :");
		double salary = input.nextDouble();

		System.out.println("Enter your year of service :");
		double yearOfService = input.nextDouble();

		if (yearOfService > 5) {
			salary += (salary * 0.05);
			System.out.println("Your new salary is : " + salary);
		} else {
			System.err.println("NO BONUS ");
			System.out.println("Your salary is : " + salary);
		}
	}

}
