package chapter1;

public class Exercise1_12 {

	public static void main(String[] args) {

		// 1 hour 40 minutes and 35 seconds is counting
		double Seconds = ((100 * 60) + 35);

		// One hour = 3600 seconds
		double DistancePerHour = ((3600 * 24) / Seconds);
		System.out.println("Distance Per Hour is : " + DistancePerHour + " miles. ");
		double DistanceForKm = ((DistancePerHour * 1.6) / 1);
		System.out.println("The average speed in kilometers per hour  :  " + DistanceForKm + " km/h");

	}

}
