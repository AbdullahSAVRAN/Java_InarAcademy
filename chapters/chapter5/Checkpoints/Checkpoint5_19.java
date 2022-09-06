package chapter5.Checkpoints;

public class Checkpoint5_19 {

	public static void main(String[] args) {
		int sayac = 0;
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < i; j++)

				System.out.println(sayac + " " + (i * j));
		sayac++;
	}

}
