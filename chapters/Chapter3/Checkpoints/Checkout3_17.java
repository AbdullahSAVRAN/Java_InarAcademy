package Chapter3.Checkpoints;

public class Checkout3_17 {

	public static void main(String[] args) {
		// Two statements are equivalent

		double tax;
		int income = 15000;
		if (income <= 10000) {
			tax = income * 0.1;

			System.out.println(tax);
		} else if (income > 10000 && income <= 20000) {
			tax = 1000 + (income - 10000) * 0.15;
			System.out.println(tax);
		}
		double tax1;
		int income1 = 15000;
		if (income1 <= 10000) {
			tax1 = income1 * 0.1;
			System.out.println(tax1);
		} else if (income <= 20000) {
			tax1 = 1000 + (income1 - 10000) * 0.15;
			System.out.println(tax1);
		}

	}
}
