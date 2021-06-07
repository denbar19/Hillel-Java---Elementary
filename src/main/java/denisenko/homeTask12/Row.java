package denisenko.homeTask12;


public class Row {

    private String[] cells;

    public Row(String[] cells) {
        this.cells = cells;
    }

    public String[] getCells() {
        return cells;
    }

    public int getSize() {
        return cells.length;
    }

}
