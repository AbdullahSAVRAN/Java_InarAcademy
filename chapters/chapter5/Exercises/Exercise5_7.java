package chapter5.Exercises;

public class Exercise5_7 {

	public static void main(String[] args) {
        //Financial application: compute future tuition
		
		double tuition = 10000;
		double increasePerYear = 0.05;
		double lastFourYear;
		int total = 0;
		for (int year = 1; year < 15; year++) {
			tuition = tuition + (tuition * 0.05);
			if (year > 0 && year < 11) {
				System.out.println(year + ". year : " + tuition);
				tuition = tuition;
			}
			if (year > 10 && year < 15) {
				tuition = tuition + (tuition * 0.05);
				total += tuition;
				if (year == 14)
					System.out.println("Total cost of last four year : " + total);
			}
		}
	}
}
