package chapters.chapter10;

public class Exercise10_28 {

    public static void main(String[] args) {
        //Implement the StringBuilder class


        char[] chars = {'j', 'a', 'v', 'a', 'c', 'o', 'd', 'e'};
        MyStringBuilder2 str1 = new MyStringBuilder2("JAVA PROGRAMMING");
        MyStringBuilder2 str2 = new MyStringBuilder2(chars);

        System.out.print("INSERT STR2 TO STR1 (INDEX 5) : ");
        MyStringBuilder2 str3 = str1.insert(5, str2);
        System.out.println(str3);
        System.out.println("STR1's REVERSE : " + str1.reverse());
        System.out.println("SUBSTRING FOR STR2 (INDEX 7) : " + str3.substring(7));
        System.out.println("\nString 2 to upper case: " + str2.toUpperCase());
    }
}