package chapters.chapter12;

import java.util.*;

public class Exercise12_03 {
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException

        Scanner input = new Scanner(System.in);
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (1 + Math.random() * 100);
        }
        System.out.println("ENTER AN INDEX...");

        try {
            int valueOfIndex = input.nextInt();
            System.out.println(arr[valueOfIndex]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("OUT OF BOUNDS...");
        }
    }
}
