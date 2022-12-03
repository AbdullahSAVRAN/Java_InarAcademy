package chapters.chapter13;

import java.math.*;

public class BigRational extends Number implements Comparable {


    private BigInteger[] r = new BigInteger[2];

    public BigRational() {
        this(new BigInteger("0"), new BigInteger("1"));
    }

    public BigRational(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);
        r[0] = (denominator.compareTo(BigInteger.ZERO) > 0
                ? BigInteger.ONE :
                new BigInteger("-1")).multiply(numerator.divide(gcd));
        r[1] = denominator.divide(gcd);
    }

    private static BigInteger gcd(BigInteger n, BigInteger d) {
        BigInteger n1 = n;
        BigInteger n2 = d;
        BigInteger gcd = BigInteger.ONE;
        for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0 && k.compareTo(n2) <= 0; k = k.add(BigInteger.ONE)) {
            if (n1.remainder(k).compareTo(BigInteger.ZERO) == 0 && n2.remainder(k).compareTo(BigInteger.ZERO) == 0) {
                gcd = k;
            }
        }
        return gcd;
    }

    public BigInteger getNumerator() {
        return r[0];
    }

    public BigInteger getDenominator() {
        return r[1];
    }

    public BigRational add(BigRational secondRational) {
        BigInteger n = (r[0].multiply(secondRational.getDenominator())).add(r[1].multiply(secondRational.getNumerator()));
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new BigRational(n, d);
    }

    public BigRational subtract(BigRational secondRational) {
        BigInteger n = (r[0].multiply(secondRational.getDenominator())).subtract(r[1].multiply(secondRational.getNumerator()));
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new BigRational(n, d);
    }

    public BigRational multiply(BigRational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getNumerator());
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new BigRational(n, d);
    }

    public BigRational divide(BigRational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator());
        BigInteger d = r[1].multiply(secondRational.getNumerator());
        return new BigRational(n, d);
    }

    public String toString() {
        if (r[1].compareTo(BigInteger.ONE) == 0) {
            return r[0] + "";
        } else {
            return r[0] + "/" + r[1];
        }
    }

    public boolean equals(Object other) {
        if (((this.subtract((BigRational) (other))).getNumerator()).compareTo(BigInteger.ZERO) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int intValue() {
        return (int) doubleValue();
    }

    public float floatValue() {
        return (float) doubleValue();
    }

    public double doubleValue() {
        return this.getNumerator().doubleValue() / this.getDenominator().doubleValue();
    }

    public long longValue() {
        return (long) doubleValue();
    }

    public int compareTo(Object o) {
        BigInteger zero = BigInteger.ZERO;
        BigInteger n = this.subtract((BigRational) o).getNumerator();
        if (n.compareTo(zero) > 0) {
            return 1;
        } else if (n.compareTo(zero) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
