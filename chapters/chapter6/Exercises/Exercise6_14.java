package chapters.chapter6.Exercises;

public class Exercise6_14 {
    public static void main(String[] args) {
        //Estimate PI

        System.out.println("i       m(i)");
        System.out.println("-------------");
        for(double i =1; i<1000; i+= 100){
            System.out.printf("%-5.0f   %1.3f\n",i,estimatePi(i));
        }
    }
    public static double estimatePi(double d){
        double pi = 0;
        for (int i = 1; i <= d; i++){
            pi += Math.pow(-1, i +1) / (2 * i - 1);
        }
        pi *= 4;
        return pi;
    }
}
