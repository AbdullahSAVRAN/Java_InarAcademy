package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_30 {

	public static void main(String[] args) {
         //Show current time in am
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time zone offset to GMT : ");
		long TimeZone = input.nextInt();
		long TotalMilliSeconds = System.currentTimeMillis();

		long TotalSeconds = TotalMilliSeconds / 1000;

		long CurrentSecond = TotalSeconds % 60;

		long TotalMinutes = TotalSeconds / 60;

		long CurrentMinute = TotalMinutes % 60;

		long TotalHours = TotalMinutes / 60;

		long CurrentHour = ((TotalHours + TimeZone) % 12);

		System.out.println("Current time is " + CurrentHour + ":" + CurrentMinute + ":" + CurrentSecond + "AM");
	}

}
