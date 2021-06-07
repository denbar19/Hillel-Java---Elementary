package denisenko.homeTask07.h07_1;

/**
 *  Напечатать в консоль элементы массива с помощью рекурсии.
 */
public class StringRecursive {

    public static void printElement(String[] arr, int counter) {
        if (counter < arr.length) {
            System.out.print(arr[counter] + " ");
            ++counter;
            printElement(arr, counter);
        }
    }
}
