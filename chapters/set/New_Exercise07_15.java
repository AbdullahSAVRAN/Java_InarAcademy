package chapters.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class New_Exercise07_15 {
    public static void main(String[] args) {
        //Eliminate duplicates

        Scanner input = new Scanner(System.in);
        System.out.print("ENTER TEN NUMBERS : ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("DISTINCT NUMBERS : " + Arrays.toString(eliminateDuplicates(numbers).toArray()));

    }

    public static Set<Integer> eliminateDuplicates(int[] arr) {
        Set<Integer> distinct = new HashSet<>();
        for (int number : arr) {
            distinct.add(number);
        }
        return distinct;
    }
}
