package chapters.chapter10;

public class Exercise10_27 {
    public static void main(String[] args) {
        //Implement the StringBuilder class

        MyStringBuilder1 str1 = new MyStringBuilder1("JAVA PROGRAM");

        System.out.println("\nDisplay string: " + str1.toString());
        System.out.println("APPEND NEW STRING : " + str1.append(new MyStringBuilder1(" NEW JAVA PROGRAM :) ")));
        System.out.println("APPEND NEW INTEGER : " + str1.append(1290));
        System.out.println("LENGTH OF STR1: " + str1.length());
        System.out.println("CHARACTER AT INDEX 6 : " + str1.charAt(6));
        System.out.println("LOWERCASE : " + str1.toLowerCase());
        System.out.println("SUBSTRING : " + str1.substring(2, 7));

    }
}