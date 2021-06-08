package denisenko.homeTask18.h18_1;

import static denisenko.homeTask18.h18_1.FillArrayOneThread.oneThread;
import static denisenko.homeTask18.h18_1.FillArrayMultiThread.multipleThread;

/**
 * С помощью многопоточности заполнить массива строк из 100 млн элементов.
 * Если индекс делится на 3 без остатка - записать в ячейку "Fizz",
 * если делится на 5 без остатка - "Buzz", если делится и на 3 и на 5 - "FizzBuzz".
 * Во всех остальных случаях записать в ячейку строковое представление ее индекса.
 * Сравнить время выполнения программы с одним потоком и с несколькими.
 * Количество потоков на ваше усмотрение.
 */
public class Main18_1 {

    public static void main(String[] args) {
        FillArrayOneThread array = new FillArrayOneThread(10000000);
        long begin = System.currentTimeMillis();
        oneThread(array);
        long end = System.currentTimeMillis() - begin;
        System.out.printf("\ntime spent in ONE %d", end);

        FillArrayMultiThread arrayM = new FillArrayMultiThread(10000000, 2);
        begin = System.currentTimeMillis();
        multipleThread(arrayM);
        end = System.currentTimeMillis() - begin;
        System.out.printf("\ntime spent in MULTI %d", end);
    }

}
