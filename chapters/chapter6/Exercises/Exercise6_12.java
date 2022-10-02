package chapters.chapter6.Exercises;

public class Exercise6_12 {
    public static void main(String[] args) {
        //Display characters

        int numberPerLine = 10;
        char ch1 = '1';
        char ch2 = 'Z';
        printChars(ch1,ch2,numberPerLine);
        System.out.println();
    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        int count = 0;

        for(char c = ch1; c <= ch2; c++){
             count++;
            if (count % numberPerLine != 0){
                System.out.print(c + " ");
            }else {
                System.out.println(c);
            }

        }

    }
}
