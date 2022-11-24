package chapters.chapter12;

public class HexFormatException extends NumberFormatException {

    private String hex;

    public HexFormatException(String hex) {
        super(hex + " IS NOT HEX STRING...");
        this.hex = hex;
    }

    public String getHex() {
        return hex;
    }

}
