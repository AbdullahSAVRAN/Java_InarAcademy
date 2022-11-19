package chapters.chapter10;

public class MyStringBuilder1 {


    private String s;

    public MyStringBuilder1(String s) {
        this.s = s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        String newS = this.s;
        newS += s;
        return new MyStringBuilder1(newS);
    }

    public MyStringBuilder1 append(int i) {
        String newS = this.s;
        newS += i + "";
        return new MyStringBuilder1(newS);
    }

    public int length() {
        return s.length();
    }

    public char charAt(int index) {
        return s.charAt(index);
    }

    public MyStringBuilder1 toLowerCase() {
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                newS += (char) (s.charAt(i) + 32) + "";
            }
        }
        return new MyStringBuilder1(newS);
    }

    public MyStringBuilder1 substring(int begin, int end) {
        String newS = "";
        for (int i = begin; i < end; i++) {
            newS += s.charAt(i) + "";
        }
        return new MyStringBuilder1(newS);
    }

    public String toString() {
        return s;
    }
}
