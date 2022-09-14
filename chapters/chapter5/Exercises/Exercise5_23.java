package chapter5.Exercises;

public class Exercise5_23 {

	public static void main(String[] args) {
		// Demonstrate cancellation errors

		double value = 0;

		double value1 = 1;
		for (int i = 1; i <= 50000; i++) {

			value1 += 1 / i;
		}
		System.out.println(value1);

		for (int j = 50000; j >= 1; j--) {

			value += (1 / j);

		}

		System.out.println(value);
	}
}