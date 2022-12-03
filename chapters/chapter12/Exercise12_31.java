package chapters.chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_31 {
    public static void main(String[] args) {


        //Baby name popularity ranking
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER YEAR : ");
        int year = input.nextInt();
        System.out.print("ENTER GENDER : ");
        char gender = input.next().charAt(0);
        System.out.print("ENTER NAME : ");
        String name = input.next();
        File file = new File("babyNameRanking" + year + ".txt");

        try {
            findNameRank(file, gender, name, year);
        } catch (FileNotFoundException ex) {
            System.out.println("FILE DOES NOT EXIST...!");
        }
    }

    public static void findNameRank(File file, char gender, String name, int year) throws FileNotFoundException {
        try (
                Scanner input2 = new Scanner(file)
        ) {
            while (input2.hasNext()) {
                int rank = input2.nextInt();
                String maleName = input2.next();
                String femaleName = input2.next();
                if ((Character.toUpperCase(gender) == 'M' && maleName.equalsIgnoreCase(name)) ||
                        (gender == 'F' && femaleName.equalsIgnoreCase(name))) {
                    System.out.println(name + " is ranked #" + rank + " in the year " + year);
                    return;
                }
            }
            System.out.println("The name " + name + " is not ranked in the year " + year);
        }
    }
}
