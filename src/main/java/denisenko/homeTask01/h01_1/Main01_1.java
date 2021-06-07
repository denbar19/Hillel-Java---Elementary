package denisenko.homeTask01.h01_1;

/**
 * Напечатать числа от 30 до 0 с использованием for И while И do-while (3 цикла).
 * Если число кратно 3, то не выводить его.
 */
public class Main01_1 {
    public static void main(String[] args) {
        int i = 30;
        do {
            if (i % 3 != 0) {
                System.out.print(i + " ");
            } else if (i == 0) {
                System.out.print(i + " ");
            }
            i--;
        }
        while (i >= 0);
        System.out.println();

        for (int j = 30; j >= 0; j--) {
            if (j % 3 != 0) {
                System.out.print(j + " ");
            }
            if (j == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        int k = 30;
        while (k >= 0) {
            if (k % 3 != 0) {
                System.out.print(k + " ");
            } else if (k == 0) {
                System.out.print(k + " ");
            }
            k--;

        }
    }
}
