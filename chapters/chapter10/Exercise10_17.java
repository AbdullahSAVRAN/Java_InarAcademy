package chapters.chapter10;

import java.math.BigInteger;

public class Exercise10_17 {
    public static void main(String[] args) {
        //Square numbers

        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        BigInteger result = number.add(new BigInteger("10"));
        for (number = new BigInteger(Long.MAX_VALUE + "");
             number.compareTo(result) <= 0;
             number = number.add(new BigInteger("1"))) {
            System.out.println(number.multiply(number));
        }
    }
}
