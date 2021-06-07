package denisenko.homeTask23;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * С помощью рефлексии изменить значение строки "hello".
 * Ожидаемое решение:
 * Решение s = "ABCDE" - не засчитывается.
 * <p>
 * 2. Написать метод objectFieldsInfo, который принимает любой объект и печатает в консоль значения его полей в формате:
 * модификаторы поля | имя_поля | значение
 * Модификаторы должны быть в читаемом виде (public, protected), а не в виде чисел (1, 3,4)
 * <p>
 * 3. Написать аннотацию @Ignore, которая может применяться только к полям класса.
 * Применить ее к заданию 2: если поле помечено @Ignore - не печатать его в консоль.
 */
public class Main23 {

    @Ignore
    private int s = 1;

    private static final String thirdTask = "yes";

    public static void main(String[] args)
            throws IllegalAccessException, NoSuchFieldException, InvocationTargetException,
            InstantiationException, NoSuchMethodException {

        String hello = "hello";
        Field fieldCharArr = hello.getClass().getDeclaredField("value");
        fieldCharArr.setAccessible(true);
        fieldCharArr.set(hello, "ABCDE".getBytes());
        System.out.println("After changing " +
                new String((byte[]) fieldCharArr.get(hello), StandardCharsets.UTF_8) + "\n");

        objectFieldsInfo(hello);
        System.out.println("\n");
        objectFieldsInfo(1);
        System.out.println("\n");
        Constructor<Main23> constructor = Main23.class.getConstructor();
        constructor.newInstance();
        objectFieldsInfo(constructor.newInstance());
    }

    public static <T> void objectFieldsInfo(T o)
            throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Ignore.class)) {
                continue;
            }
            field.setAccessible(true);
            String modifier = Modifier.toString(field.getModifiers());
            String name = field.getName();
            Field declaredFieldValue = clazz.getDeclaredField(name);
            declaredFieldValue.setAccessible(true);
            Object rawValue = declaredFieldValue.get(o);
            String value;
            if (rawValue instanceof byte[]) { //add condition as you need
                value = new String((byte[]) rawValue, StandardCharsets.UTF_8);
            } else if (rawValue instanceof char[]) {
                value = new String((char[]) rawValue);
            } else if (rawValue instanceof int[]) {
                value = Arrays.toString((int[]) rawValue);
            } else {
                value = String.valueOf(rawValue);
            }
            System.out.println(modifier + " | " + name + " | " + value);
        }
    }

}
