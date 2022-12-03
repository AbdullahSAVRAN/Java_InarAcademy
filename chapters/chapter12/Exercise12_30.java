package chapters.chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_30 {
    public static void main(String[] args) throws FileNotFoundException {
        //Occurrences of each letter


        File file = new File("essay.txt");
        if (!file.exists()) {
            System.out.println("FILE DOES NOT EXIST...");
            System.exit(0);
        }
        int[] count = new int[26];
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String line = (input.nextLine()).toUpperCase();
                countLetters(count, line);
            }
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println("COUNT : " + count[i]);
        }
    }

    public static void countLetters(int[] count, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                count[(int) (str.charAt(i) - 'A')]++;
            }
        }
    }
}

