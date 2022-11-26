package chapters.chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_17 {
    public static void main(String[] args) {
        //Algebra: perfect square

        Scanner input = new Scanner(System.in);
        System.out.print("ENTER M VALUE : ");
        int m = input.nextInt();
        ArrayList<Integer> factors = factors(m);
        ArrayList<Integer> factorsN = factorsN(factors, m);
        displayResult(factorsN, m);
    }

    public static ArrayList<Integer> factors(int m) {
        ArrayList<Integer> factors = new ArrayList<>();
        int divisor = 2;
        while (divisor <= m) {
            while (m % divisor == 0) {
                m /= divisor;
                factors.add(divisor);
            }
            divisor++;
        }
        return factors;
    }

    public static ArrayList<Integer> factorsN(ArrayList<Integer> f, int m) {
        ArrayList<Integer> factorsOfN = new ArrayList<>();
        for (int i = 2; i <= m; i++) {
            int count = 0;
            for (int j = 0; j < f.size(); j++) {
                if (f.get(j) == i) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                factorsOfN.add(i);
            }
        }
        return factorsOfN;
    }

    public static void displayResult(ArrayList<Integer> f, int m) {
        int n = 1;
        for (int i = 0; i < f.size(); i++) {
            n *= f.get(i);
        }
        System.out.println("THE SMALLEST NUMBER N FOR M * N TO BE A PERFECT SQUARE IS " + n + " AND  M * N IS " + m * n);

    }
}


