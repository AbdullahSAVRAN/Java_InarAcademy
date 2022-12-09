package chapters.set;

import java.util.HashSet;
import java.util.Set;

public class New_Exercise07_06 {
    public static void main(String[] args) {
        //Prime Number


        final int NUMBER_OF_PRIMES = 50;
        final int PRIME_PER_LINE = 10;
        Set<Integer> primeNum = new HashSet<>();
        primeNum.add(2);
        int count = 1;
        int n = 3;

        while (count < NUMBER_OF_PRIMES) {
            if (isPrime(n)) {
                primeNum.add(n);
                count++;
            }
            n += 2;
        }
        display(primeNum, PRIME_PER_LINE);
    }

    public static boolean isPrime(int n) {
        for (int i = 3; i < (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void display(Set<Integer> set, int primePerLine) {
        for (int i = 0; i < set.size(); i++) {
            System.out.printf("%4s", set.toArray()[i]);
            if ((i + 1) % primePerLine == 0) {
                System.out.println();
            }
        }
    }

}
