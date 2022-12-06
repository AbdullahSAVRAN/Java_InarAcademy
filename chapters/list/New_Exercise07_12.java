package chapters.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class New_Exercise07_12 {
    public static void main(String[] args) {
        //Reverse an array


        List<Integer> list = getNumbers();
        System.out.println(" BEFORE ");
        System.out.println("--------");
        display(list);
        reverse(list);
        System.out.println(" AFTER ");
        System.out.println("-------");
        display(list);
    }

    public static List<Integer> getNumbers() {
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER TEN NUMBERS : ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        return list;
    }

    public static void display(List<Integer> list) {
        for (Integer number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void reverse(List<Integer> list) {
        for (int begin = 0, end = list.size() - 1; begin < end; begin++, end--) {
            int temp = list.get(begin);
            list.set(begin, list.get(end));
            list.set(end, temp);
        }
    }
}
