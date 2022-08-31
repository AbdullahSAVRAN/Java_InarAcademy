package chapter4.Exercises;

import java.util.Scanner;

public class Exercise4_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter empleyee's name :");
		String name = input.next();
		System.out.println("Enter number of hours worked in a week :");
		double hour = input.nextDouble();
		System.out.println("Enter hourly pay rate :");
		double hourlyRate = input.nextDouble();

		System.out.println("Enter federal tax withholding rate : ");
		double fedTax = input.nextDouble();
		System.out.println("Enter state tax withholding rate : ");
		double stateTax = input.nextDouble();

		double grossPay = hourlyRate * hour;
		double fedWh = grossPay * fedTax;
		double stateWh = grossPay * stateTax;
		double totalDeduction = fedWh + stateWh;
		double netPay = grossPay - totalDeduction;

		System.out.println("Employee Name : " + name);
		System.out.println("Hours worked : " + hour);
		System.out.println("Pay rate : $" + hourlyRate);
		System.out.println("Gross Pay : $" + grossPay);
		System.out.println("Deductions : ");
		System.out.println("  Federal withholding : $" + fedWh);
		System.out.println("  State withholding : $" + stateWh);
		System.out.println("  Total Deduction : $" + totalDeduction);
		System.out.println("NET PAY : $" + netPay);

	}

}
