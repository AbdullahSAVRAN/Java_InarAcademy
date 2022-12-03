package chapters.chapter13;

import java.math.BigInteger;

public class Exercise13_18 {
    public static void main(String[] args) {
        //Use the Rational class


        BigRational result = new BigRational();
        for (int i = 1; i <= 99; i++) {
            result = result.add(new BigRational(new BigInteger(i + ""), new BigInteger((i + 1) + "")));
        }
        System.out.println(result);
    }
}
