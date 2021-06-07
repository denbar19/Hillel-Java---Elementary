package denisenko.homeTask14;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Написать класс Reader, который реализует интерфейс Runnable.
 * Должен быть конструктор, который принимает список чисел.
 * В методе run() 1 раз в 1 секунду нужно проверять есть ли элементы в списке.
 * Если есть - печатать их в консоль и удалять. Если нет - печатать в консоль дату и сообщение "The list is empty".
 * <p>
 * Написать класс Writer, который реализует интерфейс Runnable.
 * Должен быть конструктор, который принимает список чисел.
 * В методе run() 1 раз в 2.5 секунды нужно добавлять случайные числа в список.
 * Создать список и объекты Reader и Writer, передать один и тот же список обоим.
 * Создать 1 поток для Reader и 1 для Writer, запустить их.
 */
public class Main14 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Reader<Integer> reader = new Reader<>(list);
        Writer<Integer> writer = new Writer<>(list);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(reader);
        executorService.execute(writer);
    }
}