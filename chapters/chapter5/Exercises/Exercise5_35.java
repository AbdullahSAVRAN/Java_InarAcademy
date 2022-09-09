package chapter5.Exercises;

public class Exercise5_35 {

	public static void main(String[] args) {
		// Summation

		double result = 1 / (1 + Math.sqrt(2));
		for (int i = 2; i < 625; i++) {

			result += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));

		}
		System.out.println(result);
	}

}
