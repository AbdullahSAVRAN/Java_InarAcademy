package chapters.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class New_Exercise08_26 {
    public static void main(String[] args) {
        //Row sorting


        System.out.println("ENTER A 3-3 MATRIX ROW BY ROW :");
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add(input.nextInt());
        }
        System.out.println(" BEFORE ");
        System.out.println("--------");
        display(list);
        sortRows(list);
        System.out.println(" AFTER ");
        System.out.println("-------");
        display(list);
    }

    private static void display(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void sortRows(List<Integer> list) {
        for (int i = 0; i <= 6; i += 3) {
            for (int j = i; j < i + 2; j++) {
                for (int k = j + 1; k < i + 3; k++) {
                    if (list.get(j) > list.get(k)) {
                        int temp = list.get(j);
                        list.set(j, list.get(k));
                        list.set(k, temp);
                    }
                }
            }
        }
    }
}
