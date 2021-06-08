package denisenko.homeTask20;

public final class City {

    private final String ID;
    private final String NAME;

    public City(String id, String name) {
        ID = id;
        NAME = name;
    }

    public final String getID() {
        return this.ID;
    }

    public String getNAME() {
        return this.NAME;
    }

    @Override
    public String toString() {
        return "id + " + ID + " " + NAME;
    }

}
