package chapter5.Checkpoints;

public class Checkpoint5_25 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i < 4; i++) {
			if (i % 3 == 0)
				continue;
			sum += i;

		}
		System.out.println(sum);

		int a = 0, top = 0;
		while (a < 4) {
			if (a % 3 == 0)
				continue;
			top += a;
			a++;
		}
		System.out.println(top);
	}
}