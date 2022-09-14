package chapter5.Exercises;

public class Exercise5_26 {

	public static void main(String[] args) {
		// Compute e

		double q = 1;
		double e = 1;

		for (int i = 1; i < 10001; i++) {

			q *= i;

			e += (1 / q);
		}
		System.out.println(q);

	}
}