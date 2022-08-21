package Chapter_02;

import java.util.Scanner;

public class Question2_2 {

	public static void main(String[] args) {
		// COMPUTE THE VOLUME OF A CYLINDER
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of a cylinder : ");
		double radius = input.nextDouble();
		System.out.println("Enter the length of a cylinder : ");
		double length = input.nextDouble();
		double π = 3.14159;

		double area = radius * radius * π;
		double volume = area * length;
		System.out.println("The area is : " + area);
		System.out.println("The volume is : " + volume);

	}

}
