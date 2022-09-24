package chapters.chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_16 {
    public static void main(String[] args) {
        //Find the factors of an integer

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int num1 = input.nextInt();


        for( int i = 2; num1 >= i;){
             if (num1 % i == 0){
                 System.out.print(i + ", ");
                 num1 = num1 / i;
             }else {
                 i++;
             }
        }
             System.out.println();

    }
}
