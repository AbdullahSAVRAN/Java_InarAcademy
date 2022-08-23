package chapter0_2.Exercises;

import java.util.Scanner;

public class Question2_17 {

	public static void main(String[] args) {
		// SCIENCE : WIND-CHILL TEMPERATURE

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58F and 41F : ");
		double temperature = input.nextDouble();
		System.out.println("Enter the wind speed (>=2) in miles per hour : ");
		double wind = input.nextDouble();
		double WindChillTemperature = (35.74 + (0.6215 * temperature) - (35.75 * Math.pow(wind, 0.16))
				+ (0.4275 * temperature * Math.pow(wind, 0.16)));
		System.out.println("The wind chill index is : " + WindChillTemperature);

	}

}
