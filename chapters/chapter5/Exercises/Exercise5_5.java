package chapter5.Exercises;

public class Exercise5_5 {

	public static void main(String[] args) {
        //Conversion from kilograms to pounds and pounds to kilograms
		
		System.out.println("Kilograms Pounds | Pounds Kilograms");
		for (int i = 1, j = 20; i < 200; i++, j += 5) {
			double pound = i * 2.2;
			if (i < 200) {
				System.out.print(i + "  ");

			}

			System.out.printf("%12.1f |", pound);
			System.out.printf("%4d    ", j);

			double kilo = j / 2.2;
			System.out.printf("%8.2f\n", kilo);

		}
	}
}
