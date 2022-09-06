package chapter5.Checkpoints;

import java.util.Scanner;

public class Checkpoint5_21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer : ");
		int n1 = input.nextInt();

		System.out.println("Enter first integer : ");
		int n2 = input.nextInt();

		int gcd = 1;
		
		int k = 2;
		
		while (k <= n1 /2 && k <= n2 / 2) {
			if(n1 %k == 0 && n2 % k ==0) {
				gcd = k;
			}k++;
		}
		System.out.println(n1 + " and " + n2 + " = " + gcd);
	}
	

}
