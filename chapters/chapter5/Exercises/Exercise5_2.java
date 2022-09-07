package chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_2 {

	public static void main(String[] args) {
		//Repeat additions
		
		Scanner input = new Scanner(System.in);

		long startTime = System.currentTimeMillis();
		int count = 0;
		int correct = 0;
		int wrong = 0;
		while (count < 11) {
			int number1 = (int) (1 + Math.random() * 16);
			int number2 = (int) (1 + Math.random() * 16);
			count++;
			System.out.println(number1 + " " + number2);
			System.out.println("\"What is \" + number1 + \" - \" + number2 + \"? \"");
			int answer = input.nextInt();

			if (number1 - number2 == answer) {
				System.out.println("You are correct ");
				correct++;
			} else {
				System.out.println("You are wrong");
				wrong++;
			}
		}
		long finishTime = System.currentTimeMillis();
		long time = (finishTime - startTime) / 1000;
		System.out.println("System time is : " + time);
		System.out.println("Correct answer is :" + correct);
		System.out.println("Wrong answer is " + wrong);
	}

}
