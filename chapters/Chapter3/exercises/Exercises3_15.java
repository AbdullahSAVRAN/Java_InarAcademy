package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_15 {

	public static void main(String[] args) {
		// Game : lottery

		int lottery = (int) (100 + Math.random() * 1000);

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your guess :");
		int guess = input.nextInt();

		System.out.println(lottery);
		int lotteryDigit1 = lottery % 10;
		int lotteryDigit2 = (lottery / 10) % 10;
		int lotteryDigit3 = (lottery / 100) % 100;

		int guessDigit1 = guess % 10;
		int guessDigit2 = (guess / 10) % 10;
		int guessDigit3 = (guess / 100) % 100;

		if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit3) {
			System.out.println("The award is $10.000 ");
		} else if ((guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3 || guessDigit1 == lotteryDigit1)
				&& (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit3 || guessDigit2 == lotteryDigit2)
				&& guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) {
			System.out.println("The award is $3.000 ");
		} else if ((guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3)
				|| (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit3)
				|| (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2)) {
			System.out.println("The award is $1.000");

		}

	}
}