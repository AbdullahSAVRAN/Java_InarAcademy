package chapters.chapter5.Exercises;

import java.util.Scanner;

public class Exercise5_49 {
    public static void main(String[] args) {
       //Count vowels and consonants

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String s = input.nextLine();
        int l= s.length();
        String s1 = s.toLowerCase();
        int vowel = 0;
        int space = 0;
        for (int i = 0; i < l; i++){
            char c = s1.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowel++;
            }else if (c == ' '){
                space++;
            }
        }
        System.out.println("Vowel : " + vowel);
        System.out.println("Consonant : " + (l-vowel));
        System.out.println("Space : " + space);
    }
}
