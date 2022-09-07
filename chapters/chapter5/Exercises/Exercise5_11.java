package chapter5.Exercises;

public class Exercise5_11 {

	public static void main(String[] args) {
        //Find numbers divisible by 5 or 6, but not both)
		
		int count = 0;
		for (int number = 100; number < 200; number++) {
			if ((number % 5 == 0 || number % 6 == 0) && !(number % 5 == 0 && number % 6 == 0)) {
				System.out.print(number + " ");
				count++;
			}
			if (count == 10) {
				System.out.println();
				count = 0;

			}

		}
	}
}
