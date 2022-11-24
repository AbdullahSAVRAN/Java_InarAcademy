package chapters.chapter12;

import java.util.Scanner;

public class Exercise12_07 {
    public static void main(String[] args) {
        //NumberFormatException


        Scanner input = new Scanner(System.in);
        try {
            System.out.print("ENTER BINARY... ");
            String binValue = input.nextLine();
            System.out.println("BINARY : " + binValue + " DECIMAL " + binToDec(binValue));
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int binToDec(String binValue) {
        int result = 0;
        int pow = binValue.length() - 1;
        for (int i = 0; i < binValue.length(); i++) {
            if (!isBinValue(binValue.charAt(i))) {
                throw new NumberFormatException(binValue + " IS NOT BINARY...");
            }
            result += Math.pow(2, pow--) * Integer.parseInt(binValue.charAt(i) + "");
        }
        return result;
    }

    public static boolean isBinValue(char c) {
        if (c == '0' || c == '1') {
            return true;
        }
        return false;
    }
}