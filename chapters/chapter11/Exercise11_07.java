package chapters.chapter11;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_07 {
    public static void main(String[] args) {
        //Shuffle ArrayList

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("ENTER NUMBERS AND 0 MUST BE LAST NUMBER : ");
        Integer number = input.nextInt();

        while (number.intValue() != 0) {
            list.add(number);
            number = input.nextInt();
        }
        shuffle(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void shuffle(ArrayList<Integer> list) {
        java.util.Collections.shuffle(list);
    }
}
