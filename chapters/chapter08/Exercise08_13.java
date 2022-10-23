package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_13 {
    public static void main(String[] args) {
        //Locate the largest element

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array : ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] arr = new double[row][column];
        System.out.println("Enter the array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
        int[] location = locateLargest(arr);
        System.out.println("The location of the largest element is at (" + location[0] + " ," + location[1] + ")");
    }

    public static int[] locateLargest(double[][] a) {
        int[] x = new int[2];
        x[0] = 0;
        x[1] = 0;
        double max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    x[0] = i;
                    x[1] = j;
                    max = a[i][j];
                }
            }
        }
        return x;
    }
}
