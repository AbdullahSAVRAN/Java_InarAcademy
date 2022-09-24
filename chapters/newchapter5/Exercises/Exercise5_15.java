package chapters.newchapter5.Exercises;

public class Exercise5_15 {
    public static void main(String[] args) {
        //Display the ASCII character table
        int count = 0;

        for (char i = '!'; i <= '~'; i++) {
            System.out.print(i + " ");
            count++;

            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}