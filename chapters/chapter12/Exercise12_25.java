package chapters.chapter12;

import java.util.*;

public class Exercise12_25 {
    public static void main(String[] args) {
        //Process large dataset


        ArrayList<Double> assistant = new ArrayList<>();
        ArrayList<Double> associate = new ArrayList<>();
        ArrayList<Double> full = new ArrayList<>();
        try {
            java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Salary.txt");
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String[] line = (input.nextLine()).split(" ");
                matchData(assistant, associate, full, line[2], new Double(line[3]));
            }
        } catch (java.net.MalformedURLException ex) {
            System.out.println("INVALID URL...");
            System.exit(0);
        } catch (java.io.IOException ex) {
            System.out.println("NO FILE...");
            System.exit(1);
        }
        double totalAssistant = getTotal(assistant);
        double totalAssociate = getTotal(associate);
        double totalFull = getTotal(full);
        double totalFaculty = (totalAssistant + totalAssociate + totalFull);


        System.out.println("\n   TOTAL SALARY ");
        System.out.println("---------------------");
        System.out.printf("ASSISTANT : $%.2f\n", totalAssistant);
        System.out.printf("ASSOCIATE : $%.2f\n", totalAssociate);
        System.out.printf("FULL : $%.2f\n", totalFull);
        System.out.printf("ALL FACULTY : $%.2f\n", totalFaculty);

        System.out.println("\n   AVERAGE SALARY ");
        System.out.println("---------------------");
        System.out.printf("ASSISTANT : $%.2f\n", (totalAssistant / assistant.size()));
        System.out.printf("ASSOCIATE : $%.2f\n", (totalAssociate / associate.size()));
        System.out.printf("FULL : $%.2f\n", (totalFull / full.size()));
        System.out.printf("ALL FACULTY : $%.2f\n", (totalFaculty / (assistant.size() + associate.size() + full.size())));
    }

    public static double getTotal(ArrayList<Double> list) {
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }

    public static void matchData(ArrayList<Double> x, ArrayList<Double> y, ArrayList<Double> z, String rank, double salary) {
        if (rank.equals("ASSISTANT")) {
            x.add(salary);
        } else if (rank.equals("ASSOCIATE")) {
            y.add(salary);
        } else if (rank.equals("FULL")) {
            z.add(salary);
        }
    }
}
