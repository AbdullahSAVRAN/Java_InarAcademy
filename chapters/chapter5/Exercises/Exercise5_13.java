package chapters.chapter5.Exercises;

public class Exercise5_13 {
    public static void main(String[] args) {
       //Find the largest n such that n^3 < 12,000

        int n = 1;

        while (Math.pow(n, 3) < 12000) {

                n++;
        }
            if (Math.pow(n,3) > 12000){
                System.out.println("The largest integer is : " + (n - 1));
            }
    }
}