package chapters.newchapter5.Exercises;

public class Exercise5_26 {
    public static void main(String[] args) {
       //Compute e

        double e = 0.0,
                value = 10000.0;
        for (double i = 1; i <= value; i++) {
            double denominator = i;
            for (double k = i - 1; k >= 1; k--) {
                denominator *= k;
            }
            e += 1 / denominator;

        }
        System.out.println("The e value for i = 10000: " + e);
    }
    }

