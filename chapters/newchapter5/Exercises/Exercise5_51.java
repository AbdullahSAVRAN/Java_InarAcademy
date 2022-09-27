package chapters.newchapter5.Exercises;
import java.util.Scanner;
public class Exercise5_51 {
    public static void main(String[] args) {
        //Longest common prefix

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();
        int i = 0;
        String prefix = "";
        while (s1.charAt(i) == s2.charAt(i)) {
            prefix = prefix + s1.charAt(i);
            i++;
        }
        if (prefix.length() > 0)
            System.out.println("The commmon prefix is " + prefix);
        else
            System.out.println(s1 + " and " + s2 + " have no commmon prefix");
    }
}
