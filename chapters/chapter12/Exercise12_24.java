package chapters.chapter12;

import java.io.*;

public class Exercise12_24 {
    public static void main(String[] args) throws FileNotFoundException {
        //Create large dataset


        File file = new File("Salary.txt");
        if (file.exists()) {
            System.out.println("FILE EXISTS");
            System.exit(0);
        }
        String rank = "";
        double salary;
        try (

                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 1; i <= 1000; i++) {
                output.print("FIRST NAME : " + i + " LAST NAME : " + i);
                rank = getRank();
                salary = getSalary(rank);
                output.printf(" " + rank + " %.2f\n", salary);
            }
        }
    }

    public static String getRank() {
        String[] ranks = {"ASSISTANT", "ASSOCIATE", "FULL"};
        return ranks[(int) (Math.random() * ranks.length)];
    }

    public static double getSalary(String rank) {
        if (rank.equals("ASSISTANT")) {
            return 50000 + (double) (Math.random() * 30001);
        } else if (rank.equals("ASSOCIATE")) {
            return 60000 + (double) (Math.random() * 50001);
        } else {
            return 75000 + (double) (Math.random() * 55001);
        }
    }

}
