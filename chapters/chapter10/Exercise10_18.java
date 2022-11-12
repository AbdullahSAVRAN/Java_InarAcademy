package chapters.chapter10;

import java.math.BigInteger;

public class Exercise10_18 {
    public static void main(String[] args) {
        //Large prime numbers

        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        int count = 0;
        while (count < 5) {
            number = number.add(new BigInteger("1"));
            if (isPrime(number)) {
                count++;
                System.out.println(number);
            }
        }
    }

    public static boolean isPrime(BigInteger number) {
        for (BigInteger value = new BigInteger("2");
             value.compareTo(number.divide(new BigInteger("2"))) <= 0;
             value = value.add(new BigInteger("1"))) {
            if (number.remainder(value).compareTo(new BigInteger("0")) == 0) {
                return false;
            }
        }
        return true;
    }

}