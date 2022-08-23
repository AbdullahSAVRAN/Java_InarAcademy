package chapter0_2.Exercises;
import java.util.Scanner;
public class Question2_3 {

	public static void main(String[] args) {
		// CONVERT FEET INTO METERS
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for feet :");
		double feet = input.nextDouble();
		double meter = 0.305 * feet;
		System.out.println(feet + " feet is " + meter + " meters ");

	}

}
