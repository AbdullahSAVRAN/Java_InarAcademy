package Chapter_02;

import java.util.Scanner;

public class Question2_5 {

	public static void main(String[] args) {
		// FINANCIAL APPLICATION;CALCULATE TIPS

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Subtotal : ");
		double Subtotal = input.nextDouble();
		System.out.println("Enter the Gratuity Rate : ");
		double GratuityRate = input.nextDouble();
		double Rate = GratuityRate / 100;
		double Gratuity = Subtotal * Rate;
		double Total = Gratuity + Rate;
		System.out.println("The Gratuity is " + "$" + Gratuity + " and Total is $ " + Total);

	}

}
