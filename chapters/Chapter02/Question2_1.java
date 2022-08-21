package Chapter_02;

import java.util.Scanner;

public class Question2_1 {

	public static void main(String[] args) {
		// CONVERT CELSIUS TO FAHRENHEIT
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius");
		double Celsius = input.nextDouble();
		double Fahrenheit = (9.0 / 5) * Celsius + 32;
		System.out.println(Celsius + " Celsius is " + Fahrenheit + " Fahrenheit ");

	}
}