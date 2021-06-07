package denisenko.homeTask09.h09_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Пользователь вводит с клавиатуры любые строки.
 * Нужно посчитать сколько раз какая строка была введена. Вывести 2 строки, которые вводились чаще остальных.
 */
public class StringCalc {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter char sequence ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> calcLines = new HashMap<>();
        String line = "";
        String exitInput = "end";
        while (!(line = reader.readLine()).equals(exitInput)) {
            if (calcLines.containsKey(line)) {
                int count = calcLines.get(line);
                count = count + 1;
                calcLines.put(line, count);
            } else {
                calcLines.put(line, 1);
            }
        }
        System.out.println(calcLines);

        List<Integer> calcLinesList = new ArrayList<>(calcLines.values());
        Collections.sort(calcLinesList);
        System.out.println(calcLines);
        int bigger = calcLinesList.get(calcLinesList.size() - 2);
        int big = calcLinesList.get(calcLinesList.size() - 2);

        for (Map.Entry<String, Integer> item : calcLines.entrySet()) {
            if (calcLines.containsValue(bigger) | calcLines.containsValue(big)) {
                if (item.getValue().equals(bigger) | item.getValue().equals(big)) {
                    System.out.println("Biggest " + item.getKey() + " entered " + bigger + " times");
                }
            }
        }


    }
}
