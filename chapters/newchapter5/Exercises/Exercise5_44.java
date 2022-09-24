package chapters.newchapter5.Exercises;
import java.util.Scanner;
public class Exercise5_44 {
    public static void main(String[] args) {
        //Computer architecture: bit-level operations

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer :");
        short number = input.nextShort();

        String bit = "";

        for (int i = 0; i < 16; i++) {
            bit = (number & 1) + bit;
            number >>= 1;
        }
        System.out.println("bits : " + bit);
    }
}
