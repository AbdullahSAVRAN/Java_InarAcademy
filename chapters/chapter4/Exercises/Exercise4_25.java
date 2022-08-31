package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_25 {

	public static void main(String[] args) {

		String plate = "";

		char a = (char) (65 + Math.random() * 26);
		char b = (char) (65 + Math.random() * 26);
		char c = (char) (65 + Math.random() * 26);

		plate += (char) a;
		plate += (char) b;
		plate += (char) c;

		int number1 = (int) (1 + Math.random() * 9);
		int number2 = (int) (1 + Math.random() * 9);
		int number3 = (int) (1 + Math.random() * 9);
		int number4 = (int) (1 + Math.random() * 9);

		plate += number1;
		plate += number2;
		plate += number3;
		plate += number4;
		System.out.println(plate);
	}
}