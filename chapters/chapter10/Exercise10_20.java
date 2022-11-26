package chapters.chapter10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise10_20 {
    public static void main(String[] args) {
        //Approximate e


        BigDecimal dec = new BigDecimal(1);
        BigDecimal dec2 = new BigDecimal(1);

        for (int i = 100; i <= 1000; i += 100) {
            for (BigDecimal d = BigDecimal.ONE; d.compareTo(new BigDecimal(i + "")) < 0; d = d.add(BigDecimal.ONE)) {
                BigDecimal result = BigDecimal.ONE.divide(d, 25, RoundingMode.UP);
                dec2 = dec2.multiply(result);
                dec2 = dec2.divide(BigDecimal.ONE, 25, RoundingMode.UP);
                dec = dec.add(dec2);
            }

            System.out.println("The dec value for i = " + i + " is " + dec);
        }
    }
}
