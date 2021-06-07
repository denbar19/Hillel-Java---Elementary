package denisenko.homeTask01.h01_2;

import java.util.Arrays;
import java.util.Random;

/***
 * Создать 2 массива случайного размера (от 5 до 15).
 * Один заполнить случайными четными числами от 0 до 100,
 * другой – нечетными от 0 до 100. Напечатать оба массива в консоль.
 * Найти максимальный и минимальный элементы в них и напечатать их.
 */
public class Main01_2 {
    public static void main(String[] args) {
        int[] even = constructRandomArray(5, 15);
        System.out.print(("First array = ") + Arrays.toString(even));
        System.out.println();

        int[] odd = constructRandomArray(5, 15);
        System.out.print(("Second array = ") + Arrays.toString(odd));
        System.out.println();

        even = fillEvenNums(even);
        System.out.print(("Even array = ") + Arrays.toString(even));
        System.out.println();

        odd = fillOddNums(odd);
        System.out.print(("Odd array = ") + Arrays.toString(odd));
        System.out.println();

        int Emax = findMax(even);
        System.out.print(("Max Even = ") + Emax);
        System.out.println();

        int Emin = findMin(even);
        System.out.print(("Min Even = ") + Emin);
        System.out.println();

        int Omax = findMax(odd);
        System.out.print(("Max Odd = ") + Omax);
        System.out.println();

        int Omin = findMin(odd);
        System.out.print(("Min Odd = ") + Omin);
        System.out.println();


    }

    public static int[] constructRandomArray(int arrMin, int arrMax) {
        int range, arrLength;
        range = arrMax - arrMin;
        Random random = new Random();
        arrLength = arrMin + random.nextInt(range + 1);
        int[] arr = new int[arrLength];
        System.out.println("range = " + range + "," + "arrLength = " + arrLength);
        return arr;
    }

    public static int[] fillEvenNums(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            } else {
                continue;
            }
        }
        return arr;
    }

    public static int[] fillOddNums(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            if (arr[i] % 2 == 0) {
                arr[i] += 1;
            } else if (arr[i] == 0) {
                arr[i] += 1;
            } else if (arr[i] == 100) {
                arr[i] -= 1;
            } else {
                continue;
            }
        }
        return arr;
    }

    public static int findMax(int[] arr) {
        int max, tmp;
        max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min, tmp;
        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
