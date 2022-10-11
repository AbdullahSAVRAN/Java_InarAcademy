package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_11 {
    public static void main(String[] args) {
        //Statistics: compute deviation

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter ten numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.printf("The mean : %.2f\n", mean(numbers));
        System.out.printf("The deviation : %.3f", deviation(numbers));
    }

    public static double deviation(double[] n) {
        double deviation = 0;
        double mean = mean(n);
        for (double e : n) {
            deviation += Math.pow(e - mean, 2);
        }
        return Math.sqrt(deviation / (n.length - 1));
    }

    public static double mean(double[] n) {
        double mean = 0;
        for (double e : n) {
            mean += e;
        }
        return mean / n.length;
    }
}
