package chapters.newchapter5.Exercises;

public class Exercise5_43 {
    public static void main(String[] args) {
        // Math: combinations

        int count = 0;
        String value = "";
        for (int i = 1; i < 7; i++) {
            for (int j = i + 1; j < 8; j++) {
                value = i + " " + j;

                count++;
                System.out.println(value);

            }
        }
        System.out.println(count);
    }
    }

