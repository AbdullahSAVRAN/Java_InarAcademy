package chapters.chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_37 {
    public static void main(String[] args) {
        //Decimal to binary
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal : ");
        int decimal = input.nextInt();
        String binary = "";
        for(int i = decimal; i > 0; i /= 2){
            binary = (i % 2) + binary;
        }
        System.out.println("The binary value is : " + binary);
    }
}
