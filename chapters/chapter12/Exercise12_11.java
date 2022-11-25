package chapters.chapter12;

import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class Exercise12_11 {
    public static void main(String[] args) throws IOException {
        //Remove text

        if (args.length != 2) {
            System.out.println("Usage: delete filename ");
            System.exit(1);
        }

        File file = new File(args[0]);
        Scanner input = new Scanner(file);
        String result = "";
        while (input.hasNext()) {
            String s = input.nextLine();
            String[] split = s.split("\\s");
            String str = "";
            for (int i = 0; i < split.length; i++) {
                if (split[i].equals(args[1])) {
                    continue;
                }
                result += str + " ";
            }

            result += "\n";
        }

        PrintWriter output = new PrintWriter(file);
        output.println(result);
        output.close();
    }
}


