package chapter5.Checkpoints;

public class Checkpoint5_16 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; sum < 10000; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
	}

}
