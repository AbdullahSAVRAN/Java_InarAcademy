package chapters.chapter10;

import java.util.Scanner;

public class Exercise10_05 {
    public static void main(String[] args) {
        //Displaying the prime factors

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        System.out.print("FACTORS  " + number + " : ");
        StackOfIntegers stack = new StackOfIntegers();
        isSmallestFactors(number, stack);
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static void isSmallestFactors(int number, StackOfIntegers stack) {
        int i = 2;
        while (number / i != 1) {
            if (number % i == 0) {
                stack.push(i);
                number /= i;
            } else
                i++;
        }
        stack.push(number);
    }
}
