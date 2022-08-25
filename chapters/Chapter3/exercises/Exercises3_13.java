package Chapter3.exercises;

import java.util.Scanner;

public class Exercises3_13 {

	public static void main(String[] args) {
		// Financial application : compute taxes

		Scanner input = new Scanner(System.in);

		System.out.print(
				"(0-single filer, 1-married jointly or qualifying widow(er), 2-married separately, 3-head of household) Enter the filing status: ");
		int status = input.nextInt();

		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();

		double tax = 0;

		if (status == 0)
			tax = income * 0.10;
		else if (income <= 33950)
			tax = 8350 * 0.10 + (income - 8350) * 0.15;
		else if (income <= 82250)
			tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
		else if (income <= 171550)
			tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;

		else if (income <= 372950)
			tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
					+ (income - 171550) * 0.33;
		else {
			tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
					+ (372950 - 171550) * 0.33 + (income - 372950);
		}
		double tax1 = 0;
		if (status == 1)
			tax1 = income * 0.10;

		else if (income <= 67900)
			tax1 = 16700 * 0.10 + (income - 16700) * 0.15;
		else if (income <= 137050)
			tax1 = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
		else if (income <= 208850)
			tax1 = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25 + (income - 137050) * 0.28;
		else if (income <= 372950)
			tax1 = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25 + (income - 137050) * 0.28
					+ (income - 208850) * 0.33;
		else {
			tax1 = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25 + (income - 137050) * 0.28
					+ (income - 208850) * 0.33 + (income - 372950);

a		}
		System.out.println(tax1);
	}
}
