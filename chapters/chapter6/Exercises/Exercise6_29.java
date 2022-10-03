package chapters.chapter6.Exercises;

public class Exercise6_29 {
    public static void main(String[] args) {
        //Twin primes


        int n = 2;
        while (n < 1000) {
            if (isTwinPrime(n)) {
                System.out.println("(" + n + "," + (n + 2) + ")");
            }
            n++;
        }
    }
    public static boolean isTwinPrime(int number) {
        return isPrime(number) && isPrime(number + 2);
    }
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}