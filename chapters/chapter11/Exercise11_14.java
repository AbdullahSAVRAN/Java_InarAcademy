package chapters.chapter11;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_14 {
    public static void main(String[] args) {
        //Combine two lists

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("ENTER FIVE INTEGERS FOR LIST1 : ");
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }
        System.out.print("ENTER FIVE INTEGERS FOR LIST2 : ");
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }

        System.out.println("NEW LIST : " + union(list1, list2));
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;

    }
}