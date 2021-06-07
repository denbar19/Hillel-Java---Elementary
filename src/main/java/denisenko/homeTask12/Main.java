package denisenko.homeTask12;

import java.util.ArrayList;
import java.util.List;

/**
 * Нужно исправить 2 бага - 1 compile-time баг и 1 run-time баг. Также проведите рефакторинг.
 * Рефакторинг - изменения кода, которые делают его читабельнее и проще для дальнейшей поддержки/развития,
 * не изменяя изначальных функций кода.
 */
public class Main {

    public static void main(String[] args) {
        Report report = new Report();
        Row roW1 = new Row(new String[]{"a", "b", "c"});
        Row roW2 = new Row(new String[]{"d", "e", "f"});
        List<Row> list = new ArrayList<>();
        list.add(roW1);
        list.add(roW2);
        report.setRows(list);
        System.out.println(report.getReportToString(0, 2));
    }
}
