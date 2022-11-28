package chapters.chapter12;

import java.util.*;

public class Exercise12_23 {
    public static void main(String[] args) {
        //Process scores in a text file on the Web


        ArrayList<Double> list = new ArrayList<>();
        try {
            java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Scores.txt");
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                list.add(input.nextDouble());
            }
            double total = sum(list);
            System.out.printf("TOTAL : %.0f\n", total);
            System.out.printf("AVERAGE : %.0f\n", (total / list.size()));

        } catch (java.net.MalformedURLException ex) {
            System.out.println("INVALID URL...");
        } catch (java.io.IOException ex) {
            System.out.println("NO FILE...");
        }
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
