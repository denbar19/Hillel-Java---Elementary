package denisenko.homeTask05.h05_3;

public class Bottle {
    private double volume;
    private String liquid;

    public Bottle() {
    }

    public Bottle(double volume, String liquid) {
        this.volume = volume;
        this.liquid = liquid;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null && getClass() != o.getClass()) {
            return false;
        }
        Bottle bottle = (Bottle) o;
        return volume == bottle.volume && liquid.equals(bottle.liquid);
    }

    public void setLiquid(int density, String color, boolean soda) {
        new Liquid(density, color, soda);
    }
}
