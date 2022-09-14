package chapter5.Exercises;

public class Exercise5_24 {

	public static void main(String[] args) {
		// Sum a series

		double value = 0;
		double i = 1;
		double j = 3;
		while (i < 98 && j < 100) {
			i += 2;
			j += 2;

		}

		value = i / j;
		System.out.println(value);
	}
}
