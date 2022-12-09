package chapters.set;

import java.util.*;

public class New_Exercise07_05 {
    public static void main(String[] args) {
        //Print distinct numbers

        Scanner input = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        System.out.print("ENTER TEN INTEGERS : ");
        for (int i = 0; i < 10; i++) {
            set.add(input.nextInt());
        }
        System.out.println("NUMBER OF DISTINCT NUMBERS : " + set.size());
        System.out.println("DISTINCT NUMBERS : " + Arrays.toString(set.toArray()));
    }

}
