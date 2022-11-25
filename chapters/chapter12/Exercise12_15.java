package chapters.chapter12;

import java.util.*;
import java.io.*;

public class Exercise12_15 {
    public static void main(String[] args) throws Exception {
        //Write/read data

        File file = new File("Exercise12_15.txt");
        if (file.exists()) {
            System.out.println("FILE EXISTS...");
            System.exit(0);
        }

        try (PrintWriter output = new PrintWriter(file);) {
            for (int i = 0; i < 100; i++) {
                output.print(((int) (1 + Math.random() * 1000)));
                output.print(" ");
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        try (Scanner input = new Scanner(file);) {
            while (input.hasNext()) {
                list.add(input.nextInt());
            }
        }
        Collections.sort(list);
        System.out.print(list.toString());
        System.out.println();
    }
}

