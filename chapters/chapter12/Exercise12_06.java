package chapters.chapter12;

import java.util.Scanner;

public class Exercise12_06 {
    public static void main(String[] args) {
        ////NumberFormatException

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("ENTER HEX VALUE : ");
            String hex = input.next();
            System.out.println("HEX VALUE : " + hex + " INTEGER VALUE FOR HEX : " + hex2Dec(hex));
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int hex2Dec(String hex) {
        int result = 0;
        int pow = hex.length() - 1;
        for (int i = 0; i < hex.length(); i++) {
            if (!isLegalHexValue(hex.charAt(i))) {
                throw new NumberFormatException("ILLEGAL VALUE...");
            } else {
                if (hex.charAt(i) >= 'A') {
                    result += Math.pow(16, pow--) * (hex.charAt(i) - 'A' + 10);
                } else {
                    result += Math.pow(16, pow--) * (hex.charAt(i) - '0');
                }
            }
        }
        return result;

    }

    public static boolean isLegalHexValue(char c) {
        if (('A' <= c && c <= 'F') || ('0' <= c && c <= '9')) {
            return true;
        }
        return false;
    }
}