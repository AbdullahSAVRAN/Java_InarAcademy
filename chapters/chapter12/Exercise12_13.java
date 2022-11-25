package chapters.chapter12;

import java.io.File;
import java.util.Scanner;

public class Exercise12_13 {
    public static void main(String[] args) throws Exception {
        //Count characters, words, and lines in a file

        if (args.length != 1) {
            System.out.println("Wrong usage : TAKE ONE ARGUMENT ");
            System.exit(1);
        }
        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("NO FILE ");
            System.exit(2);
        }
        String str = "";
        int wordCount = 0;
        int lineCount = 0;
        int charCount = 0;

        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                str = input.nextLine();
                lineCount++;
                charCount += countChars(str);
                wordCount += countWords(str);
            }
        }
        System.out.println("LINES : " + lineCount + "\n CHARS : " + charCount + "\n WORDS : " + wordCount);

    }

    public static int countChars(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static int countWords(String s) {
        String[] array = s.split(" ");
        return array.length;
    }

}

