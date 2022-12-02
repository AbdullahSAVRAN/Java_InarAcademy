package chapters.chapter13;

import java.util.*;

public class Exercise13_03 {
    public static void main(String[] args) {
        //Sort ArrayList


        ArrayList<Number> list = new ArrayList<>();
        list.add(1.2);
        list.add(13);
        list.add(5.2);
        list.add(7.43);
        list.add(19.56);
        list.add(147);
        list.add(6.246);
        list.add(1.234);
        list.add(5.421);
        list.add(1.09);

        System.out.println(list.toString());
        sort(list);
        System.out.println(list.toString());
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Number min = list.get(i);
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (min.doubleValue() > list.get(j).doubleValue()) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list.set(minIndex, list.get(i));
                list.set(i, min);
            }
        }
    }
}

