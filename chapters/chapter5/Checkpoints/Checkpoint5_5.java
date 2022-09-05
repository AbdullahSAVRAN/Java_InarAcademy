package chapter5.Checkpoints;

public class Checkpoint5_5 {

	public static void main(String[] args) {

		// -2147483648 < VALUE OF INTEGER < 2147483648
		int x = 80000000;

		while (x > 0) {
			x++;
		}
		System.out.println("x is " + x);
	}

}
