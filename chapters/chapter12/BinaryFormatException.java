package chapters.chapter12;

public class BinaryFormatException extends NumberFormatException {


    private String binString;

    public BinaryFormatException(String binString) {
        super(binString + " IS NOT BINARY STRING ");
        this.binString = binString;
    }

    public String getBinString() {
        return binString;
    }
}
