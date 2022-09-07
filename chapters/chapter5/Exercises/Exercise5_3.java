package chapter5.Exercises;

public class Exercise5_3 {

	public static void main(String[] args) {
        //Conversion from kilograms to pounds
		
		System.out.println("Kilograms\t\tPounds");

		for (int kilogram = 0; kilogram < 200; kilogram++) {
			double pound = (double) (kilogram * 2.2);
			System.out.println(kilogram + "\t\t" + pound);
		}

	}

}
