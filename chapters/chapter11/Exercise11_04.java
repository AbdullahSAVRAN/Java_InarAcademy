package chapters.chapter11;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_04 {
    public static void main(String[] args) {
        //Maximum element in ArrayList

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("ENTER NUMBERS AND 0 MUST BE LAST NUMBER : ");
        Integer number = input.nextInt();
        while (number.intValue() != 0) {
            list.add(number);
            number = input.nextInt();
        }
        System.out.println("LARGEST NUMBER : " + max(list));
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.size() == 0) {
            return null;
        }
        Integer max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}
