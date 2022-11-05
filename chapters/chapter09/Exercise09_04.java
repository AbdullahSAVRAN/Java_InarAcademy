package chapters.chapter09;

import java.util.Random;

public class Exercise09_04 {
    //Use the Random class

    private static final int seed = 1000;
    private static final int n = 100;

    public static void main(String[] args) {
        Random r = new Random(seed);
        for (int i = 0; i < 50; i++) {
            if (i % 5 == 0) {
                System.out.println();
            }
            System.out.print(r.nextInt(n) + " ");
        }
    }
}
