package denisenko.homeTask05.h05_3;

public class Liquid extends Bottle {
    int density;
    String color;
    boolean soda;

    public Liquid(int density, String color, boolean soda) {
        this.density = density;
        this.color = color;
        this.soda = soda;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null && getClass() != o.getClass()) {
            return false;
        }
        Liquid liquid = (Liquid) o;
        return density == liquid.density && color.equals(liquid.color);
    }
}
