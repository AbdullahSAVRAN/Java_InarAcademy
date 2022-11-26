package chapters.chapter12;

import java.util.Scanner;

public class Exercise12_19 {
    public static void main(String[] args) {
        //Count words

        try {
            java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                if (Character.isLetter((input.next()).charAt(0))) {
                    count++;
                }
            }
            System.out.println("NUMBER OF WORDS : " + count);
        } catch (java.net.MalformedURLException ex) {
            System.out.println("INVALID URL...");
        } catch (java.io.IOException ex) {
            System.out.println("NO FILE...");
        }
    }
}
