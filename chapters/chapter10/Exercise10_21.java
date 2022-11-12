package chapters.chapter10;

import java.math.BigInteger;

public class Exercise10_21 {
    public static void main(String[] args) {
        //Divisible by 5 or 6

        BigInteger number = new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger five = new BigInteger("5");
        BigInteger six = new BigInteger("6");
        BigInteger zero = new BigInteger("0");
        System.out.println("NUMBERS : ");
        int count = 0;
        while (count < 10) {
            number = number.add(new BigInteger("1"));
            if ((number.remainder(five)).compareTo(zero) == 0 || (number.remainder(six)).compareTo(zero) == 0) {
                System.out.println(number);
                count++;
            }
        }
    }
}