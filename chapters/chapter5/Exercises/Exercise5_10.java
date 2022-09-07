package chapter5.Exercises;

public class Exercise5_10 {

	public static void main(String[] args) {
         //Find numbers divisible by 5 and 6
		
		int count = 0;
		for (int number = 100; number < 1000; number++) {
			if (number % 5 == 0 && number % 6 == 0) {
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
