package chapter5.Exercises;

public class Exercise5_6 {

	public static void main(String[] args) {
        //Conversion from miles to kilometers
		
		System.out.println("Miles  Kilometers  |  Kilometers  Miles");

		for (int miles = 1, km = 20; miles < 11; miles++, km += 5) {
			double kilometers = (double) (miles * 1.609);
			if (miles < 11) {
				double mile = (double) (km / 1.609);
				System.out.println(miles + "\t" + kilometers + "\t   |\t" + km + "\t  " + mile);

			}
		}
	}

}
