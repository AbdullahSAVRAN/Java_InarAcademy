package chapter0_2.Exercises;

import java.util.Scanner;

public class Question2_4 {

	public static void main(String[] args) {
		// CONVERT POUNDS INTO KILOGRAMS

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in pounds : ");
		double pounds = input.nextDouble();
		double kilograms = pounds * 0.454;
		System.out.println(pounds + " Pounds is " + kilograms + " kilograms ");

	}

}
