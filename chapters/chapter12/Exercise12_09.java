package chapters.chapter12;

import java.util.Scanner;

public class Exercise12_09 {
    public static void main(String[] args) {
        //BinaryFormatException

        Scanner input = new Scanner(System.in);
        try {
            System.out.print("ENTER BINARY : ");
            String binaryValue = input.nextLine();
            System.out.println("BINARY : " + binaryValue + "DECIMAL : " + binToDec(binaryValue));
        } catch (BinaryFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int binToDec(String binValue) {
        int result = 0;
        int pow = binValue.length() - 1;
        for (int i = 0; i < binValue.length(); i++) {
            if (!isLegalBinaryValue(binValue.charAt(i))) {
                throw new BinaryFormatException(binValue);
            }
            result += Math.pow(2, pow--) * Integer.parseInt(binValue.charAt(i) + "");
        }
        return result;
    }

    public static boolean isLegalBinaryValue(char c) {
        if (c == '0' || c == '1') {
            return true;
        }
        return false;
    }
}
