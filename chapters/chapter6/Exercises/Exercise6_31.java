package chapters.chapter6.Exercises;

import java.util.Scanner;

public class Exercise6_31 {
    public static void main(String[] args) {
        //Financial: credit card number validation

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your credit card number : ");
        long number = input.nextLong();
        if (isValid(number)) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
    }

    public static boolean isValid(long number) {
        boolean valid = (getSize(number) >= 13 && getSize(number) <= 16) && (prefixMatched(number, 4) ||
                prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6)) &&
                ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);

        return valid;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String s = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(s.charAt(i) + "") * 2);
        }
        return sum;
    }

    public static int getDigit(int number) {
        if (number < 9) {
            return number;
        } else {
            return (number / 10) + (number % 10);
        }
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String s = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(s.charAt(i) + "");
        }
        return sum;
    }

    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    public static long getPrefix(long number, int k) {
        if (getSize(number) > k) {
            String s = number + "";
            return Long.parseLong(s.substring(0, k));
        }
        return number;
    }

    public static int getSize(long d) {
        String s = d + "";
        return s.length();
    }
}
