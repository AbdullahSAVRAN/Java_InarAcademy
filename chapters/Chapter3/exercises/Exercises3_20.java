package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_20 {

	public static void main(String[] args) {

		// Science : wind-chill temperature

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the temperature in Fahrenheit between -58 F and 41 F ");
		double ta = input.nextDouble();
		System.out.println("Enter the wind speed ");
		double v = input.nextDouble();

		double twc = (35.74 + (0.6215 * ta) - (35.75 * (Math.pow(v, 0.16)) + (0.4275 * ta * (Math.pow(ta, 0.16)))));

		if ((-58 < ta && ta < 41) && v >= 2) {
			System.out.println("The wind-chiil temperature is : " + twc);
		} else {
			System.out.println("The temperature and/or wind speed is invalid");
		}

	}

}
