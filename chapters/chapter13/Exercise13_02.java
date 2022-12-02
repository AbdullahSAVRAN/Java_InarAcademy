package chapters.chapter13;

import java.util.*;

public class Exercise13_02 {
    public static void main(String[] args) {
        //Shuffle ArrayList

        ArrayList<Number> list = new ArrayList<>();
        list.add(13);
        list.add(89);
        list.add(9);
        list.add(1.2);
        list.add(56);
        list.add(3.12);
        list.add(2.789);
        list.add(195);
        list.add(123);
        list.add(8.12345);
        System.out.println(list.toString());
        shuffle(list);
        System.out.println(list.toString());
    }

    public static void shuffle(ArrayList<Number> list) {
        java.util.Collections.shuffle(list);
    }
}