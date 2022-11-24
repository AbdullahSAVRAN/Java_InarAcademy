package chapters.chapter12;

import java.util.Scanner;

public class Exercise12_08 {
    public static void main(String[] args) {
        //HexFormatException


        Scanner input = new Scanner(System.in);
        try {
            System.out.println("ENTER HEX : ");
            String hex = input.nextLine();
            control(hex);
            System.out.println("HEX : " + hex);
        } catch (HexFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void control(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!isHex(str.charAt(i))) {
                throw new HexFormatException(str);
            }
        }
    }

    public static boolean isHex(char c) {
        return ('A' <= c && c <= 'F') || ('0' <= c && c <= '9');
    }
}