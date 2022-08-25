package Chapter3.Checkpoints;

public class Checkout3_31 {

	public static void main(String[] args) {

		int x = 1, a = 3;
		if (a == 1)
			x += 5;
		else if (a == 2)
			x += 10;
		else if (a == 3)
			x += 16;
		else if (a == 4)
			x += 34;

		System.out.println(x);

		int y = 1, b = 3;
		switch (b) {
		case 1:
			y += 5;
			break;
		case 2:
			y += 10;
			break;
		case 3:
			y += 16;
			break;
		case 4:
			y += 34;
			break;
		}
		System.out.println(y);

	}
}
