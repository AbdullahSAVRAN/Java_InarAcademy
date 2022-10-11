package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_12 {
    public static void main(String[] args) {
        //Reverse an array

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter ten numbers : ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        reverse(numbers);
        for (int e : numbers){
            System.out.print(" " + e);
        }
        System.out.println();
    }
    public static void reverse(int[] list){
        int temp;
        for(int i = 0, j = list.length -1; i < list.length; i++,j--){
            temp = list[i];
            list[i] = list[j];
            list[i] = temp;
        }
    }
}
