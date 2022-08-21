package chapter0_2;
import java.util.Scanner;
public class Question2_6 {

	public static void main(String[] args) {
		// SUM THE DIGITS IN AN INTEGER
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between o and 1000 : ");
		int Number = input.nextInt();
		int c = Number % 10;
		int d = (Number - c) / 10;
		int e = d % 10;
		int f = (d  - e) / 10;
		int g = f % 10;
		int h = c + e + g;
		System.out.println("The sum of the digits is : " + h);

	}

}
