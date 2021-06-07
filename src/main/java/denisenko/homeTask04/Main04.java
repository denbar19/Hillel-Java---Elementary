package denisenko.homeTask04;

import java.util.Arrays;

import static java.lang.Math.abs;

/**
 * Написать метод numJewelsInStones который принимает 2 параметра:
 * - String jewels: строка, каждый символ символизирует драгоценный камень, символы уникальны
 * - String stones: строка, каждый символ символизирует камень.
 * Строки могут состоять только из символов a..zA..Z
 * Метод должне вернуть количество другоценных камней в строке stones.
 * Пример:
 * jewels = "aAb"
 * stones = "caсAcA"
 * Output: 3
 * <p>
 * Написать метод.
 * Входящий параметр: отсортированный массив типа int который содержит отрицательные и положительные значения.
 * Вернуть отсортированный массив который состоит из квадратов значений.
 * Не использовать методы для сортировки, которые предоставляются JDK.
 */
public class Main04 {

    public static void main(String[] args) {
        int[] array = {-4, -1, 0, 3, 10};
        int[] array1 = arrSquare(array);
        int[] array2 = sortBubble(array1);
        System.out.println(Arrays.toString(array2));

        String jewels = "ige";
        String stones = "i was going throw the river and i felt in to the water";
        System.out.println(numJewelsInStones(jewels, stones));

    }

    public static int[] arrSquare(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = abs(array[i]) * abs(array[i]);
        }
        return array;
    }

    public static int[] sortBubble(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int bigger = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = bigger;
                }
            }
        }
        return arr;
    }

    public static int numJewelsInStones(String jewels, String stones) {
        char[] jewelsTemp = jewels.toCharArray();
        int calcGems = 0;
        char[] stone = stones.toCharArray();
        for (char j : stone) {
            String temp = String.valueOf(j);
            for (char ch : jewelsTemp) {
                if (temp.contains(Character.toString(ch))) {
                    calcGems++;
                }
            }
        }
        return calcGems;
    }
}

