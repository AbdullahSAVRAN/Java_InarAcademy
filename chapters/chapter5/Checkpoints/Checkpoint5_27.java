package chapter5.Checkpoints;

public class Checkpoint5_27 {

	public static void main(String[] args) {

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (i * j > 2)
					break;
				System.out.println(i * j);
			}
			System.out.println(i);
		}

		for (int a = 1; a < 4; a++) {
			for (int b = 1; b < 4; b++) {
				if (a * b > 2)
					continue;
				System.out.println(a * b);
			}
			System.out.println(a);
		}
	}

}
