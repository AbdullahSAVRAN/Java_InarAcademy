package week_03;

import java.util.Scanner;

public class Assignment3_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter 3 age :");
		double age1 = input.nextDouble();
		double age2 = input.nextDouble();
		double age3 = input.nextDouble();

		if (age1 > age2 && age2 > age3) {
			System.out.println("Max : " + age1 + " Min : " + age3);
		} else if (age1 > age3 && age3 > age2) {
			System.out.println("Max : " + age1 + " Min : " + age2);
		} else if (age2 > age1 && age1 > age3) {
			System.out.println("Max : " + age2 + " Min : " + age3);
		} else if (age2 > age1 && age3 > age1) {
			System.out.println("Max : " + age2 + " Min : " + age1);
		} else if (age3 > age1 && age1 > age2) {
			System.out.println("Max : " + age3 + " Min : " + age2);
		} else if (age3 > age1 && age2 > age1) {
			System.out.println("Max : " + age3 + " Min : " + age1);

		}

	}

}
