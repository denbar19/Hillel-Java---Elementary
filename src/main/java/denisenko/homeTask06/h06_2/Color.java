package denisenko.homeTask06.h06_2;

public enum Color {

    RED("#ff0000"),
    GREEN("#00ff00"),
    BLUE("#0000ff"),
    WHITE("#ffffff"),
    BLACK("#000000");

    private String hex;
    private int red;
    private int green;
    private int blue;

    Color(String hex) { // Принимает hex пересчитывает RGB
        this.hex = hex;
        this.red = Integer.parseInt(hex.substring(1, 3), 16);
        this.green = Integer.parseInt(hex.substring(3, 5), 16);
        this.blue = Integer.parseInt(hex.substring(5), 16);
    }

    Color(int r, int g, int b) { // Принимает rgb пересчитывает HEX,
        this.red = r;
        this.green = g;
        this.blue = b;
        String red = Integer.toHexString(r);
        String green = Integer.toHexString(g);
        String blue = Integer.toHexString(b);
        this.hex = "#" + red + green + blue;
    }

    public String getHex() {
        return hex;
    }

    public String getRgb() {
        return (red + ", " + green + ", " + blue);
    }
}
