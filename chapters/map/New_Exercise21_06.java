package chapters.map;

import java.util.*;

public class New_Exercise21_06 {
    public static void main(String[] args) {
        //Most Occurrences


        Map<Integer, Integer> occurrences = new HashMap<>();
        getNumbers(occurrences);
        display(occurrences);
    }

    public static void getNumbers(Map<Integer, Integer> occurrences) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE INTEGERS BETWEEN 1 AND 1OO (0 = END): ");
        int number;

        do {
            number = input.nextInt();
            if (occurrences.containsKey(number)) {
                int value = occurrences.get(number);
                occurrences.put(number, value + 1);
            } else
                occurrences.put(number, 1);
        } while (number != 0);
    }

    public static void display(Map<Integer, Integer> occurrences) {
        Set<Integer> keys = occurrences.keySet();
        Set<Integer> mostOccur = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for (int key : keys) {
            if (max < occurrences.get(key)) {
                max = occurrences.get(key);
            }
        }
        for (int key : keys) {
            if (occurrences.get(key) == max) {
                mostOccur.add(key);
            }
        }
        System.out.print("MOST OCCURRENCES : " + mostOccur);

    }
}