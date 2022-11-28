package chapters.chapter12;

import java.io.File;
import java.util.Scanner;

public class Exercise12_26 {
    public static void main(String[] args) {
        //Create a directory

        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER PATH : ");
        String path = input.nextLine();
        File file = new File(path);
        if (file.exists()) {
            System.out.println("DIRECTORY ALREADY EXIST...");
        } else if (file.mkdirs()) {
            System.out.println("DIRECTORY CREATED SUCCESSFULLY...");
        }
    }
}
