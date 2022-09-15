package chapter5.Exercises;

public class Exercise5_20 {

	public static void main(String[] args) {
		// Display prime numbers between 2 and 1,000

		int nextLineCount = 8;
		for (int i = 2; i <= 1000; i++) {

			if (isPrime(i)) {
				System.out.print(i + " ");
				nextLineCount--;
				if (nextLineCount == 0) {
					System.out.println();
					nextLineCount = 8;
				}
			}
		}
	}

	public static boolean isPrime(int n) {
		boolean notPrime = false;
		int d = 2;
		while (d <= n / 2) {
			if (n % d == 0) {
				notPrime = true;
				break;
			}
			d++;
		}
		return !notPrime;
	}
}
