package chapter5.Exercises;

public class Exercise5_27 {

	public static void main(String[] args) {
        //(Display leap year)
		
		int i = 1;
		for (int year = 101; year <= 2100; year++) {

			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				System.out.print(year + " ");
				if (i % 10 == 0) {
					System.out.println();
				}
				i++;

			}
		}
	}
}