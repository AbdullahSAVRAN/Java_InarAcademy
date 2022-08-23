package chapter0_2.Exercises;
import java.util.Scanner;
import java.util.Date;
public class Question2_8 {

	public static void main(String[] args) {
		// CURRENT TIME
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time zone offset to GMT : ");
		long TimeZone = input.nextInt();
	    long TotalMilliSeconds =System.currentTimeMillis();

        long TotalSeconds = TotalMilliSeconds / 1000;

        long CurrentSecond = TotalSeconds % 60;

        long TotalMinutes = TotalSeconds / 60;

        long CurrentMinute = TotalMinutes % 60;

        long TotalHours = TotalMinutes / 60;

        long CurrentHour = ((TotalHours + TimeZone) % 24);

        System.out.println("Current time is " + CurrentHour + ":" + CurrentMinute + ":" + CurrentSecond);
    }

		
	
		

	}


