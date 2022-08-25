package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_19 {

	public static void main(String[] args) {

		// Compute the perimeter of a triangle

		Scanner input = new Scanner(System.in);
		System.out.println("Enter three edges for triangle :");
		int edge1 = input.nextInt();
		int edge2 = input.nextInt();
		int edge3 = input.nextInt();
		int perimeter = edge1 + edge2 + edge3;

		if (((edge1 + edge2) > edge3) && ((edge1 + edge3) > edge2) && ((edge2 + edge3) > edge1)) {

			System.out.println("The perimeter of a triangle : " + perimeter);
		} else {
			System.out.println("The input is invalid ");
		}

	}

}
