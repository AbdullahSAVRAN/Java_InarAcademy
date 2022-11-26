package chapters.chapter12;

import java.util.*;
import java.io.*;

public class Exercise12_21 {
    public static void main(String[] args) throws Exception {
        //Data sorted?


        File file = new File("SortedString.txt");
        if (!file.exists()) {
            System.out.println("FILE DOES NOT EXIST...");
            System.exit(0);
        }

        boolean isSorted = true;
        String s1 = "";
        String s2 = "";
        try (
                Scanner input = new Scanner(file);
        ) {
            if (input.hasNext()) {
                s1 = input.next();
            }
            while (input.hasNext() && isSorted) {
                s2 = input.next();
                if (s1.compareTo(s2) > 0) {
                    System.out.println("S1 AND S2 ARE OUT OF ORDER...");
                }
                s1 = s2;
            }
        }
        if (isSorted) {
            System.out.println("STRING IS STORED IN INCREASING ORDER...");
        }

    }
}
