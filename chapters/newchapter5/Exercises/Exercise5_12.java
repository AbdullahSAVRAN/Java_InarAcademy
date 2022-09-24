package chapters.newchapter5.Exercises;

public class Exercise5_12 {
    public static void main(String[] args) {
        //Find the smallest n such that n^2 > 12,000

        int n = 1;
        int n2 = 1;
        while (n2 < 12000) {
            n++;
            n2 = n * n;
        }
            if (n2 > 12000) {

                System.out.println("The smallest integer n : " + n);
            }
        }

    }

