package chapters.chapter10;

public class Exercise10_23 {
    public static void main(String[] args) {
        //Implement the String class

        MyString2 str1 = new MyString2("java program");
        MyString2 str2 = new MyString2("java");

        System.out.println("SUBSTRING FOR STR2 :");
        print(str2.substring(2));

        System.out.println("UPPERCASE FOR STR1 :");
        print(str1.toUpperCase());

    }

    public static void print(MyString2 str) {
        print(str.toChars());
    }

    public static void print(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
    }
}
