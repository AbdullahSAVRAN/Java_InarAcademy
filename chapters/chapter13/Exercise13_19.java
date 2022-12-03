package chapters.chapter13;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise13_19 {
    public static void main(String[] args) {
        //Convert decimals to fractions

        Scanner input = new Scanner(System.in);
        System.out.print("ENTER DECIMAL NUMBER :");
        String[] decimal = input.nextLine().split("[.]");
        BigRational r1 = new BigRational(new BigInteger(decimal[0]), BigInteger.ONE);
        BigRational r2 = new BigRational(new BigInteger(decimal[1]), new BigInteger(String.valueOf((int) Math.pow(10, decimal[1].length()))));
        System.out.println("FRACTION NUMBER : " + (decimal[0].charAt(0) == '-' ? (r1).subtract(r2) : (r1).add(r2)));

    }
}
