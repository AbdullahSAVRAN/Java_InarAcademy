package chapters.map;

import java.util.*;

public class SortOnKeys {
    public static void main(String[] args) {
        //Create a Map with 10 key-values and sort then on the keys


        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= 10; i++) {
            int key = (int) (Math.random() * 20);
            int value = (int) (Math.random() * 20);
            map.put(key, value);
        }
        display(map);
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for (Integer key : keys) {
            System.out.println(key + " : ");
        }
    }

    public static void display(Map<Integer, Integer> map) {
        Set<Integer> keys = map.keySet();
        for (int key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("---------------------------");
    }
}
