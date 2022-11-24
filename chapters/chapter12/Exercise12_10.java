package chapters.chapter12;

public class Exercise12_10 {
    public static void main(String[] args) {
        //OutOfMemoryError

        try {
            int value = 1111100000;
            value = value * 10000;
        } catch (OutOfMemoryError ex) {
            System.out.println(ex.getMessage());
        }
        System.err.println("OUT OF MEMORY ERROR...");
    }
}
