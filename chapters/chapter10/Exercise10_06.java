package chapters.chapter10;

public class Exercise10_06 {
    public static void main(String[] args) {
        //Displaying the prime numbers

        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 2; i < 120; i++) {
            if (isPrime(i)) {
                stack.push(i);
            }
        }
        System.out.println("PRIME NUMBERS : ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static boolean isPrime(int n) {
        for (int j = 2; j <= n / 2; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
