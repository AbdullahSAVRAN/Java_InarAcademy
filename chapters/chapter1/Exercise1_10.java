package chapter1;

public class Exercise1_10 {

	public static void main(String[] args) {

		double TotalDistance = ((60 * 14) / 45.30);
		double TotalMil = TotalDistance / 1.6;
		double AverageSpeed = TotalMil / 60;

		System.out.println("The average speed in miles per hour : " + AverageSpeed + "mil/h");
	}

}
