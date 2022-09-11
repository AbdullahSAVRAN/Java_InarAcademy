package chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_46 {

	public static void main(String[] args) {
        //Reverse a string
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a text");
		String s = input.nextLine();
		int l = s.length();
		String s1 = "";
		for (int i = l - 1; i >= 0; i--) {
			s1 += s.charAt(i);
		}
		System.out.println(s1);
	}

}
