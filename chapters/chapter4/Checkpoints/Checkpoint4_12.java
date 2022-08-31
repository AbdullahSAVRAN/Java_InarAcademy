package chapter4.Checkpoints;

public class Checkpoint4_12 {

	public static void main(String[] args) {

		char c = 'A';
		int i = (int) c;

		float f = 1000.34f;
		i = (int) f;

		double d = 1000.34;
		i = (int) d;

		i = 97;
		c = 'i';

		System.out.println(i);
		System.out.println(d);
		System.out.println(f);
		System.out.println(c);

	}

}
