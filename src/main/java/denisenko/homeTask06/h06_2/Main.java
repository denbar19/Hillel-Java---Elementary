package denisenko.homeTask06.h06_2;

public class Main {

    public static void main(String[] args) {
        Color red = Color.RED;
        Color green = Color.GREEN;

        System.out.println("Red color hex code " + red.getHex());
        System.out.println("Green color hex code " + green.getHex() + "\n");
        System.out.println("r, g, b - " + Color.BLUE.getRgb());
        System.out.println("r, g, b - " + Color.WHITE.getRgb());
        System.out.println("r, g, b - " + Color.BLACK.getRgb());
    }
}