package Chapter3.Checkpoints;

public class Checkpoint3_40 {

	public static void main(String[] args) {

		int x = 5;

		System.out.println(x > 0 && x < 10);
		System.out.println((x > 0) && (x < 10));

		int a = 7;

		System.out.println(a > 0 || a < 10);
		System.out.println((a > 0) || (a < 10));

		int b = 4;
		int c = -2;
		System.out.println(b > 0 || b < 10 && c < 0);
		System.out.println(b > 0 || (b < 10 && c < 0));

	}

}
