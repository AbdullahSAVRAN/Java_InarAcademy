package chapter5.Exercises;

public class Exercise5_4 {

	public static void main(String[] args) {
        //Conversion from miles to kilometers
		
		System.out.println("Miles\t\tKilometers");
		for (int mile = 1; mile < 11; mile++) {
			double kilometers = (double) (mile * 1.609);

			System.out.println(mile + "\t\t" + kilometers);
		}
	}

}
