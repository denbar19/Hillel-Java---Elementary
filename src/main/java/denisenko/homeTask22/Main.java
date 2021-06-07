package denisenko.homeTask22;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Напишите Supplier-функцию (которая ничего не принимает, но возращает значение),
 * которая рандомно возращает число от 0 до 10 с задержкой 500 мс.
 * С помощью этой функции создайте стрим (метод generate у интерфейса Stream).
 * Возведите каждый элемент потока в 3 степень. Если результат больше 100, то печатайте его в консоль.
 * Ограничьте поток 100 элементами.
 * В задании можно использовать только лямбды.
 * Из новых методов Stream API, которые мы не рассмотрели на лекции,
 * здесь должны быть использованы методы limit и forEach
 */
public class Main {

    public static void main(String[] args) {

        Supplier<Integer> randomIntDelay = () -> {
            Random r = new Random();
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return r.nextInt(11);
        };

        Stream.generate(randomIntDelay)
                .map(i -> i * i * i)
                .filter(n -> n > 100)
                .limit(100)
                .forEach(e -> System.out.print(e + " "));
    }
}

