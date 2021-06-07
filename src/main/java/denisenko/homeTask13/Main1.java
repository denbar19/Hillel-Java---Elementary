package denisenko.homeTask13;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.util.Locale.ENGLISH;

/**
 * 1. С помощью класса LocalDateTime посчитать сколько дней, часов, минут и секунд проходит между началом лекции в понедельник и концом лекции в четверг.
 * 2. С помощью класса Duration посчитать количество минут и секунд в лекции (http://www.seostella.com/ru/article/2014/07/11/data-i-vremya-v-java-8-prodolzhitelnost-klass-duration.html)
 * 3. С помощью класса DateTimeFormatter парсить строку в формате "1999/Jun/18 07:34:56 PM" (год/аббревиатура месяца/число часы в 12часовом формате:минута:секунда) в LocalDateTime.
 * 4. С помощью класса DateTimeFormatter форматировать дату в строку вида "23:56 2001/15/01" (часы:минуты год/месяц/день)
 * 5*. Посчитать сколько минут длится весна, лето, осень и зима.
 */
public class Main1 {

    public static void main(String[] args) {

        LocalDateTime mondayBegin = LocalDateTime.of(2021, 1, 11, 20, 0);
        LocalDateTime thursdayEnd = LocalDateTime.of(2021, 1, 14, 22, 0);
        int passedDays = thursdayEnd.getDayOfMonth() - mondayBegin.getDayOfMonth();
        int passedHours = thursdayEnd.getHour() - mondayBegin.getHour();
        int passedMinutes = thursdayEnd.getMinute() - mondayBegin.getMinute();
        int passedSeconds = thursdayEnd.getSecond() - mondayBegin.getSecond();
        System.out.printf("\nIt's been %d days, %d hours, %d minutes, %d seconds", passedDays, passedHours,
                passedMinutes, passedSeconds);
        int passedHours1 = passedDays * 24 + passedHours;
        int passedMinutes1 = passedHours1 * 60 + passedMinutes;
        int passedSeconds1 = passedMinutes1 * 60 + passedSeconds; // second are 0
        System.out.printf("\nIt's been %d days, or %d hours, or %d minutes, or %d seconds", passedDays, passedHours1,
                passedMinutes1, passedSeconds1);

        LocalDateTime endOfLecture = mondayBegin.plusHours(2);
        Duration duration = Duration.between(mondayBegin, endOfLecture);
        long lectureDuration = duration.toMinutes();
        System.out.printf("\nDuration of the lecture: %d minutes", lectureDuration);

        String parseSting = "1999/Jun/18 07:34:56 PM";
        String pattern = "yyyy/MMM/dd hh:mm:ss a";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, ENGLISH);
        LocalDateTime parseDate = LocalDateTime.parse(parseSting, formatter);
        System.out.print("\n" + parseDate);

        LocalDateTime date4 = LocalDateTime.of(2001, 1, 15, 23, 56);
        String pattern4 = "HH:mm yyyy/dd/MM";
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern(pattern4);
        String parsedDate4 = date4.format(formatter4);
        System.out.print("\n" + parsedDate4);

        LocalDateTime springBegin = LocalDateTime.of(2020, 3, 1, 0, 0);
        LocalDateTime february5 = LocalDateTime.of(2020, 2, 1, 0, 0);
        LocalDateTime winterEnd = LocalDateTime.of(2021, 2, february5.getDayOfMonth(), 23, 0);
        Duration duration5 = Duration.between(springBegin, winterEnd);
        long seasonsDuration = duration5.toMinutes();
        System.out.printf("\nIt's been %d minutes in spring, summer, autumn and winter", seasonsDuration);

        Duration durationSpring = Duration.between(LocalDateTime.of(2020, 3, 1, 0, 0),
                LocalDateTime.of(2020, 5, 31, 0, 0));
        long springDuration = durationSpring.toMinutes();
        System.out.printf("\n%d minutes in spring", springDuration);

        Duration durationSummer = Duration.between(LocalDateTime.of(2020, 6, 1, 0, 0),
                LocalDateTime.of(2020, 8, 31, 0, 0));
        long summerDuration = durationSummer.toMinutes();
        System.out.printf("\n%d minutes in summer", summerDuration);

        Duration durationAutumn = Duration.between(LocalDateTime.of(2020, 9, 1, 0, 0),
                LocalDateTime.of(2020, 11, 30, 0, 0));
        long autumnDuration = durationAutumn.toMinutes();
        System.out.printf("\n%d minutes in autumn", autumnDuration);

        LocalDateTime february5_1 = LocalDateTime.of(2021, 2, 1, 0, 0);
        Duration durationWinter = Duration.between(LocalDateTime.of(2020, 12, 1, 0, 0),
                LocalDateTime.of(2021, 2, february5_1.getDayOfMonth(), 0, 0));
        long WinterDuration = durationWinter.toMinutes();
        System.out.printf("\n%d minutes in winter", WinterDuration);
    }
}