package denisenko.homeTask09.h09_1;

import java.util.HashMap;
import java.util.Map;

/**
 * Добавить в карту Map<String, Integer> 10 записей.
 * Поменять местами ключи и значения (ключи становятся значениями, значения становятся ключами).
 */
public class MapSwap {

    public static void main(String[] args) {
        Map<String, Integer> mapto = new HashMap<>();
        mapto.put("first", 1);
        mapto.put("second", 2);
        mapto.put("third", 3);
        mapto.put("forth", 4);
        mapto.put("fifth", 5);
        mapto.put("sixth", 6);
        mapto.put("seventh", 7);
        mapto.put("eights", 8);
        mapto.put("ninth", 9);
        mapto.put("tenth", 10);

        for (Map.Entry<String, Integer> item : mapto.entrySet()) {
            System.out.printf("Key: %s Value: %d \n", item.getKey(), item.getValue());
        }

        Map<Integer, String> mapSwapped = mapSwap(mapto);

        System.out.println();
        for (Map.Entry<Integer, String> item : mapSwapped.entrySet()) {
            System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
        }
    }

    public static Map<Integer, String> mapSwap(Map<String, Integer> map) {
        Map<Integer, String> mapTemp = new HashMap<>();
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            Integer key = item.getValue();
            String value = item.getKey();
            mapTemp.put(key, value);
        }
        return mapTemp;
    }

}
