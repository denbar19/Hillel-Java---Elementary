package denisenko.homeTask06.h06_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1. Написать регулярное выражение для формата даты YYYY/MM/dd HH:mm
 * Примеры:
 * 2020/12/23 05:30 - valid
 * 2020/13/77 99:99 - invalid
 * asdasdasd - invalid
 * <p>
 * 2. Написать регулярное выражение, которое будет искать домен почтового ящика и возвращать его
 * Примеры:
 * abc@mail.com -> main.com
 * zzz@ccc.v -> ccc.y
 * <p>
 * 3. Разобраться с логикой паттерна Singleton:
 * https://habr.com/ru/post/27108/ - первые две реализации
 * https://refactoring.guru/ru/design-patterns/singleton
 * ЗАДАЧА БЕЗ КОДА
 * <p>
 * 4. Написать enum Сolor, в нем должны быть объекты RED, GREEN, BLUE, WHITE и BLACK.
 * У каждого объекта должны быть поле hex
 * https://www.w3schools.com/colors/colors_rgb.asp
 * https://www.color-hex.com/
 * <p>
 * 4*
 * добавить в enum поля r, g, b.
 * Добавить второй конструктор Color(int r, int g, int b), который также по входным значениям вычисляет hex.
 * В конструкторе Color(String hex) добавить логику вычисления r, g и b по hex
 */
public class Main {

    public static void main(String[] args) {

        String input = "Present time - 2020/12/23 05:30 - valid, Present time - 2020/12/23 05:30 - valid";
        String input1 = "Present time - 2020/13/77 99:99 - invalid, Present time - 2020/13/77 99:99 - invalid";
        String input2 = "my mail is denisenko924@gmail.com la la la, my mail is denisenko924@gmail.com la la la";

        String regex1 = "\\d{4}/\\d[1-9]/[0-3][0-9]\\s\\d[0-59]:\\d[0-59]"; // формата даты "YYYY/MM/dd HH:mm"
        String regex2 = "@\\w{1,20}\\.\\w{1,10}\\w{1,10}?\\w{1,10}?";// домен почтового ящика

        System.out.println(input.matches(regex1));
        System.out.println(input1.matches(regex1));
        System.out.println(input2.matches(regex2));

        Pattern patern1 = Pattern.compile(regex1);
        Matcher dateOccurrence = patern1.matcher(input);
        System.out.println(dateOccurrence);

        while (dateOccurrence.find()) {
            System.out.print("Start index: " + dateOccurrence.start() + "\n");
            System.out.print("End index: " + dateOccurrence.end() + "\n");
            System.out.println(dateOccurrence.group());
        }

        Pattern patern2 = Pattern.compile(regex2);
        Matcher mailOccurrence = patern2.matcher(input2);
        System.out.println(mailOccurrence);

        while (mailOccurrence.find()) {
            System.out.println(mailOccurrence.group());
        }
    }
}
