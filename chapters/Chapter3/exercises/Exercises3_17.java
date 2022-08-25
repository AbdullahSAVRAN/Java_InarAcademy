package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_17 {

	public static void main(String[] args) {

		// Game : scissor . rock , paper

		Scanner input = new Scanner(System.in);
		int computer = (int) (Math.random() * 3);

		System.out.println("Enter a number : (scissor = 0 , rock = 1 , paper = 2 ");
		int user = input.nextInt();

		if ((user == 0 && computer == 0) || (user == 1 && computer == 1) || (user == 1 && computer == 1)) {
			System.out.println("It is a draw");
		} else if (user == 1 && computer == 0) {
			System.out.println("The computer is scissor.You are rock.You won ");
		} else if (computer == 2 && user == 1) {
			System.out.println("The computer is paper.You are rock.It won");
		} else if (user == 2 && computer == 0) {
			System.out.println("Computer won");
		} else if (user == 2 && computer == 1) {
			System.out.println("You won");
		} else if (user == 0 && computer == 1) {
			System.out.println("Computer won");
		} else if (user == 0 && computer == 2) {
			System.out.println("You won");
		}
	}

}
