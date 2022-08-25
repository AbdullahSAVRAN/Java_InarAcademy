package Chapter3.Checkpoints;

public class Checkpoint3_33 {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.println("Enter three number :");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		System.out.println((x < y && y < z) ? "sorted" : "not sorted");

	}

}
