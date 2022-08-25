package Chapter3.Checkpoints;

public class Checkpoint3_30 {

	public static void main(String[] args) {

		int x = 3;
		int y = 3;
		switch (x + 3) {
		case 6:
			y = 1;
		default:
			y += 1;
		}
		System.out.println(y);

		int a = 3;
		int b = 3;

		if (a + 3 == 6) {
			b = 1;
		} else
			b += 1;

		System.out.println(b);

	}
}
