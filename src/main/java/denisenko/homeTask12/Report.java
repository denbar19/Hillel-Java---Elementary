package denisenko.homeTask12;

import java.util.List;

public class Report {

    private List<Row> rows;

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public Row getRowByIndex(int index) {
        return this.rows.get(index);
    }

    public String getReportToString(int from, int to) {
        StringBuilder str = new StringBuilder();
        int i = from;
        while (i < to) {
            String[] arrayStr = getRowByIndex(i).getCells();
            for (String s : arrayStr) {
                str.append(s + " ");
            }
            i++;
        }
        return str.toString();
    }

}
