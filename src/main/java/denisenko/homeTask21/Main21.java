package denisenko.homeTask21;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 1. С помощью Stream API отфильтровать только четные числа и сформировать новый список из квадратов их значений.
 * Input: [1, 2, 3, 4, 5]
 * Output: [4, 16]
 * <p>
 * 2. Написать функцию-Predicat.
 * Предикат должен принимать коллекцию строк и проверять содержится ли в ней больше 2 строк, которые начинаются
 * с заглавной буквы (upper case). Эту проверку также нужно сделать с помощью Stream API.
 * Используйте функцию count() из Stream
 * <p>
 * 3. Написать энам MathOperations со значениями PLUS, MINUS, DIVIDE, MULTIPLY.
 * Составить карту функций, ключи - значения энама. Значения - функции (BiFunction),
 * которые выполняют соответствующие действия.
 * <p>
 * 4*. Написать интерфейс TriFunction, который представляет собой функцию,
 * которая принимает 3 параметра и имеет возращаемое значение.
 */
public class Main21 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrOut1 = Arrays.stream(arr)
                .filter(s -> s % 2 == 0)
                .map(s -> s * s)
                .boxed().collect(Collectors.toList());
        System.out.println(arrOut1);

        List<String> upperString = new LinkedList<>(Arrays.asList("Aa", "aa", "Aa", "Aa")); // true
        Predicate<Collection<String>> upperCaseCheck = (s) -> {
            long count = s.stream()
                    .map(ss -> ss.charAt(0))
                    .filter(Character::isUpperCase)
                    .count();
            return count > 2;
        };
        System.out.println(upperCaseCheck.test(upperString));

        EnumMap<MathOperations, BiFunction<Integer, Integer, Double>> mathMap = new EnumMap<>(MathOperations.class);
        mathMap.put(MathOperations.PLUS, (a, b) -> (double) (a + b));
        mathMap.put(MathOperations.MINUS, (a, b) -> (double) (a - b));
        mathMap.put(MathOperations.DIVIDE, (a, b) -> (double) (a / b));
        mathMap.put(MathOperations.MULTIPLY, (a, b) -> (double) (a * b));
        System.out.println(mathMap.get(MathOperations.PLUS).apply(1, 2));
        System.out.println(mathMap.get(MathOperations.MINUS).apply(2, 1));
        System.out.println(mathMap.get(MathOperations.DIVIDE).apply(2, 2));
        System.out.println(mathMap.get(MathOperations.MULTIPLY).apply(2, 2));

        TriFunction<Integer, Integer, Integer, Long> function = (a, b, c) -> (long) a + b * c;
        long triFunctionRes = function.apply(2, 2, 2); // 6
        System.out.println(triFunctionRes);
    }
}
