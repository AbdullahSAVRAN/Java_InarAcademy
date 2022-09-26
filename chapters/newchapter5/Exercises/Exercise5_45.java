package chapters.newchapter5.Exercises;
import java.util.Scanner;
public class Exercise5_45 {
    public static void main(String[] args) {
        //Statistics: compute mean and standard deviation

        Scanner input = new Scanner(System.in);

        double number ;
        System.out.println("Enter ten number : ");
        double mean = 0;
        double deviation = 0;


        for (int i = 1; i <= 10; i++) {
            number = input.nextDouble();
            mean += number;
            deviation += Math.pow(number, 2);
        }
        deviation =  Math.sqrt((deviation - (Math.pow(mean, 2) / 10)) / (9));
        mean /= 10;

        System.out.println("MEAN : " + mean);
        System.out.printf("DEVIATION : %1.5f" ,deviation);
    }
    }

