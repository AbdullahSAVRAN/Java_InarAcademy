package chapters.chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_01 {
    public static void main(String[] args) {
        //Count positive and negative numbers and compute the average of numbers

        Scanner input = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        double total = 0;
        double sum = 0;
        double average = 0;
        int num = -1;
        while (num != 0){

            System.out.println("Enter a number :");
            num = input.nextInt();
            if (num < 0){
                neg++;

                sum += num;
            }else if(num > 0){
                pos++;

                sum += num;
            }
            total++;
            average = sum / (total - 1);

        }
              System.out.println("The number of positives : " + pos);
              System.out.println("The number of negatives : " + neg);
              System.out.println("The total is : " + total);
              System.out.println("The average is : " + average);
    }
}
