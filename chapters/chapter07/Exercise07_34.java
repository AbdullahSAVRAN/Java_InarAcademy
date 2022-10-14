package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_34 {
    public static void main(String[] args) {
        //Sort characters in a string

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s = input.nextLine();
        s = sort(s);
        System.out.println("Result : " + s);
    }

    public static String sort(String s) {
        char[] charArr = new char[s.length()];
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = s.charAt(i);
        }
        charArr = sort(charArr);
        String result = "";
        for (int i = 0; i < charArr.length; i++) {
            result += charArr[i];
        }
        return result;
    }

    public static char[] sort(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
