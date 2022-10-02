package chapters.chapter6.Exercises;

public class Exercise6_13 {
    public static void main(String[] args) {
        //Sum series

        System.out.println("i       m(i)");
        System.out.println("-------------");
        for (double i = 1; i <= 20; i++) {
            System.out.printf("%-6.0f %1.4f\n", i, sumSeries(i));
        }
    }
        public static double sumSeries(double num){
            double sum = 0;
            for (double i = 1; i <= num; i++) {
                sum += (i / (i + 1));
            }
            return sum;
        }
    }
