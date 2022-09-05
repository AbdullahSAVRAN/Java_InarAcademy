package chapter5.Checkpoints;

public class Checkpoint5_17 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
			System.out.println(sum);

			int j = 1;

			if (i < j) {
				System.out.println(i);
			} else {
				System.out.println(j);
			}
			while (j < 10)
				;
			{
				j++;
			}
			do {
				j++;
			} while (j < 10);
		}

	}
}
