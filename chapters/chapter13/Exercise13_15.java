package chapters.chapter13;

import java.math.BigInteger;

public class Exercise13_15 {
    public static void main(String[] args) {
        //Use BigInteger for the Rational class


        BigRational r1 = new BigRational(new BigInteger("3000000"), new BigInteger("5000000"));
        BigRational r2 = new BigRational(new BigInteger("4000000"), new BigInteger("8000000"));

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
