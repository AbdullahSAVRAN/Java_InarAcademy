package chapter5.Exercises;

public class Exercise5_13 {

	public static void main(String[] args) {
		//Find the largest n such that n3 6 12,000
		
		int i = 1;
		int n = 0;
		double n3 = 0;
		while ((n3 = Math.pow(i, 3)) < 12000) {
			n = i;
			i++;
		}

		System.out.println("The largest integer : " + n);
	}
}
