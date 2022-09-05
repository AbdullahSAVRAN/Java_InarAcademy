package chapter5.Checkpoints;

public class Checkpoint5_13 {

	public static void main(String[] args) {

		long sum = 0;
		int i = 0;
		while (i < 1001) {
			i++;
			sum = sum + i;
		}
		System.out.println(sum);

		long x = 0;
		int a = 0;

		do {
			x = x + a;
			a++;

		} while (a < 1001);
		System.out.println(x);
	}
}