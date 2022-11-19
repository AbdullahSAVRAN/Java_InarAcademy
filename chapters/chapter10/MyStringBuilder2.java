package chapters.chapter10;

public class MyStringBuilder2 {


    private String s;

    public MyStringBuilder2() {
        s = "";
    }

    public MyStringBuilder2(char[] chars) {
        s = String.valueOf(chars);
    }

    public MyStringBuilder2(String s) {
        this.s = s;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        String newStr = "";
        int i;
        for (i = 0; i < offset; i++) {
            if (i < offset)
                newStr += this.s.charAt(i) + "";
        }
        newStr += s;
        return new MyStringBuilder2(newStr + substring(offset));
    }

    public MyStringBuilder2 reverse() {
        String newS = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            newS += s.charAt(i) + "";
        }
        return new MyStringBuilder2(newS);
    }

    public MyStringBuilder2 substring(int begin) {
        String newS = "";
        for (int i = begin; i < s.length(); i++) {
            newS += s.charAt(i) + "";
        }
        return new MyStringBuilder2(newS);
    }

    public MyStringBuilder2 toUpperCase() {
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                newS += (char) (s.charAt(i) - 32) + "";
            } else {
                newS += s.charAt(i) + "";
            }
        }
        return new MyStringBuilder2(newS);
    }

    public String toString() {
        return s;
    }

    public int length() {
        return s.length();
    }

    public char charAt(int index) {
        return s.charAt(index);
    }
}


