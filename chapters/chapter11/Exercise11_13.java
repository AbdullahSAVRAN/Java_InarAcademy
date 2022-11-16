package chapters.chapter11;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_13 {
    public static void main(String[] args) {
        //Remove duplicates

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("ENTER TEN NUMBERS : ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        System.out.println("LIST : " + list);
        removeDuplicate(list);
        System.out.print("NEW LIST : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j))
                    list.remove(j);
            }
        }
    }
}
