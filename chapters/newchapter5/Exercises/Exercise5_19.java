package chapters.newchapter5.Exercises;
public class Exercise5_19 {
    public static void main(String[] args) {
        // Display numbers in a pyramid pattern

        int num = 0, num2 = 7;
        for (int i = 1; i <= 128; i += i) {
            for (int s = 0; s < num2; s++) {
                System.out.print("    ");
            }
            for (int j = 1; j <= i; j += j) {
                System.out.printf("%4d", (j));
            }
            for (int x = num; x > 0; x /= 2) {
                System.out.printf("%4d", (x));
            }
            num = i;
            num2--;
            System.out.println();
        }
    }
}
