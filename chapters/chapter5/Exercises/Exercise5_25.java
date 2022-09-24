package chapters.chapter5.Exercises;

public class Exercise5_25 {
    public static void main(String[] args) {
        //Compute PI

        double pi = 1.0;
        for (int i = 2; i <= 100000; i++) {

            pi += Math.pow(-1, i + 1) / (2 * i - 1.0);
            if (i % 10000 == 0) {
                System.out.println("For value of i = " + i + " -> PI =  " + (4.0 * pi));

            }

        }

    }
}