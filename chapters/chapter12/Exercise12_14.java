package chapters.chapter12;

import java.io.*;
import java.util.Scanner;

public class Exercise12_14 {
    public static void main(String[] args) throws Exception {
        //Process scores in a text file

        Scanner input = new Scanner(System.in);
        File file = new File(input.nextLine());
        if (!file.exists()) {
            System.out.println("FILE DOES NOT EXIST...");
            System.exit(1);
        }
        int count = 0;
        double total = 0;
        try (
                Scanner newInput = new Scanner(file);
        ) {
            while (newInput.hasNext()) {
                total += newInput.nextInt();
                count++;
            }
        }
        System.out.println("FILE : " + file.getName());
        System.out.println("SCORES : " + total);
        System.out.println("AVERAGE : " + (total / count));
    }

}
