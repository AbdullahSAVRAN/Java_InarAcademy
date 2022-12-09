package chapters.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class New_Exercise07_03 {
    public static void main(String[] args) {
        //Count occurrence of numbers


        Map<Integer, Integer> occurrences = new HashMap<>();
        getNumbers(occurrences);
        print(occurrences);
    }

    public static void getNumbers(Map<Integer, Integer> occurrences) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE INTEGERS 1 BETWEEN 100 (0 = END): ");
        int number;
        do {
            number = input.nextInt();
            if (number < 101 && number > 0) {
                if (occurrences.containsKey(number)) {
                    int value = occurrences.get(number);
                    occurrences.put(number, value + 1);
                } else {
                    occurrences.put(number, 1);
                }
            }
        } while (number != 0);

    }

    public static void print(Map<Integer, Integer> map) {
        Set<Integer> keys = map.keySet();

        for (int key : keys) {
            System.out.println(key + " OCCURS " + map.get(key) + " TIME " + ((map.get(key) > 1) ? "s" : ""));
        }
    }
}

