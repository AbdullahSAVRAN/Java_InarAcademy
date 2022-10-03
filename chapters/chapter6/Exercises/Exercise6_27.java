package chapters.chapter6.Exercises;

public class Exercise6_27 {
    public static void main(String[] args) {
        //Emirp

        int count = 0;
        int n = 2;
        while (count < 100) {
            if (isEmirp(n)) {
                count++;
                if (count % 10 == 0) {
                    System.out.printf("%7d\n", n);
                } else {
                    System.out.printf("%7d", n);
                }
            }
            n++;
        }
    }

    public static boolean isEmirp(int number) {
        return isPrime(number) && isPalindrome(number) && isPrime(reverse(number));
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number) ? true : false;
    }

    public static int reverse(int number) {
        String reverse = "";
        String n = number + "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse);
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