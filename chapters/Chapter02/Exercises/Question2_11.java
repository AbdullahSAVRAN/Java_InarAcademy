package chapter0_2.Exercises;

import java.util.Scanner;

public class Question2_11 {

	public static void main(String[] args) {
		// POPULATION PROJECTION

		int Population = 312032486;
		Scanner input = new Scanner(System.in);
		// One day has 24 * 60 * 60 seconds
		int OneDaySeconds = 24 * 60 * 60;
		// One year has 365 * OneDaySeconds seconds
		int OneYearSeconds = 365 * OneDaySeconds;
		int TotalBirth = OneYearSeconds / 7;
		int TotalDeath = OneYearSeconds / 13;
		int TotalImmigrant = OneYearSeconds / 45;
		int AnnualIncrease = TotalBirth - TotalDeath + TotalImmigrant;
		System.out.println("Enter the number of years : ");
		int year = input.nextInt();
		int NewPopulation = Population + (year * AnnualIncrease);
		System.out.println("The population in " + year + " years is : " + NewPopulation);
	}

}
