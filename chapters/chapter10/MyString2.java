package chapters.chapter10;

public class MyString2 {



    private String s;
    public MyString2(String s) {
        this.s = "";
        for (int i = 0; i < s.length(); i++) {
            this.s += s.charAt(i) + "";
        }
    }
    public MyString2 substring(int begin) {
        String s = "";
        for (int i = begin, j = 0; i < this.s.length(); i++, j++) {
            s += this.s.charAt(i) + "";
        }
        return new MyString2(s);
    }
    public MyString2 toUpperCase() {
        String s = "";
        for (int i = 0; i < this.s.length(); i++) {
            if (this.s.charAt(i) >= 'a' && this.s.charAt(i) <= 'z') {
                s += String.valueOf((char) (this.s.charAt(i) - 32));
            } else {
                s += String.valueOf(this.s.charAt(i));
            }
        }
        return new MyString2(s);
    }
    public char[] toChars() {
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        return ch;
    }
}
