package chapters.chapter6.Exercises;

import java.util.Scanner;

public class Exercise6_04 {
    public static void main(String[] args) {
       //Display an integer reversed

        Scanner input =new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int number = input.nextInt();
        reverse(number);
    }
    public static void reverse(int number){
        while (number > 0){
            int n = number % 10;
            System.out.print(n);
            number = number / 10;
        }
    }
}
