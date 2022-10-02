package chapters.chapter6.Exercises;

import java.util.Scanner;

public class Exercise6_17 {
    public static void main(String[] args) {
        //Display matrix of 0s and 1s


        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int n = input.nextInt();
        System.out.println(n + " * " + n + " MATRIX :");
        System.out.println("--------------");
        printMatrix(n);
    }
    public static void printMatrix(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                int a =(int)(Math.random()*2);
                System.out.print(a);
            }
            System.out.println();
    }
    }
}
