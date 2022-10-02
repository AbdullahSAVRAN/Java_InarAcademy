package chapters.chapter6.Exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise6_09 {
    public static void main(String[] args) {
        //Conversions between feet and meters

        Scanner input = new Scanner(System.in);
        System.out.println("Enter feet :");
        double feet = input.nextDouble();
        System.out.println("Enter meters :");
        double meters = input.nextDouble();
        System.out.println("FEET        METERS         | METERS          FEET");
        System.out.println("----------------------------------------------------");
        for(double i =feet,j =meters; feet<=10; feet++,meters+=5){
            System.out.printf("%-12.1f%-15.3f| %-15.1f%-3.3f\n",feet,footToMeter(feet),meters,meterToFoot(meters));
        }
    }
    public static double footToMeter(double foot){
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
}
