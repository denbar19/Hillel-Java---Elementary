package denisenko.homeTask01.h01_3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Написать метод, который принимает массив String и возвращает String,
 * в котором все строки из массива объединены в одну строку через разделитель “|”.
 * Пример: *
 * input: [“ab”, “cd”, “ef”]
 * output: “ab|cd|ef”
 */
public class Main01_3 {

    public static void main(String[] args) {
        String[] arr = {"ab", "cd", "ef"};
        ArrayList<String> str = new ArrayList<>(Arrays.asList(arr));
        System.out.print("Initial array of strings: ");
        for (String i : str) {
            System.out.print(i + " ");
        }
        System.out.println();
        String outString = gatherString(str);
        System.out.println("United into one String: " + outString);

        String[] str2 = {"ab", "cd", "ef"};

    }

    public static String gatherString(ArrayList<String> o) {
        int l = o.size();
        int L = l * 2 - 1;
        ArrayList<String> B = new ArrayList<>(L);
        for (String str : o) {
            B.add(str);
            B.add("|");
        }
        B.remove(B.size() - 1);

        String[] C = B.toArray(new String[L]);
        String A = Arrays.toString(C);
        return A;
    }

}