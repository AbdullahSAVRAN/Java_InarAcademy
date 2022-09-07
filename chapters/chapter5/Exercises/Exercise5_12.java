package chapter5.Exercises;

public class Exercise5_12 {

	public static void main(String[] args) {
        //Find the smallest n such that n2 7 12,000
		
		int i = 1;
		int n = 0;
		double n2 = 0;
		while ((n2 = Math.pow(i, 2)) < 12300) {
			n = i;
			i++;

		}
		if (n2 > 12000) {
			System.out.println("The smallest integer : " + n);
		}

	}
}
