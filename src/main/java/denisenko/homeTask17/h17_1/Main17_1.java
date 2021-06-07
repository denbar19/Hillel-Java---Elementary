package denisenko.homeTask17.h17_1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.util.Locale.ENGLISH;

/**
 * 1. Написать тесты для ДЗ 13. Перед этим лучше сделать рефакторинг и поместить код каждого задания в отдельный метод (не важно статический или нет). Проверять возвращаемое из метода значение.
 */
public class Main17_1 {

    public static void main(String[] args) {

        LocalDateTime mondayBegin = LocalDateTime.of(2021, 1, 11, 20, 0);
        LocalDateTime thursdayEnd = LocalDateTime.of(2021, 1, 14, 22, 0);
        durationBetweenLections(mondayBegin, thursdayEnd);
        System.out.printf("\nIt's been %d seconds", durationBetweenLections(mondayBegin, thursdayEnd));

        LocalDateTime endOfLecture = mondayBegin.plusHours(2);
        System.out.printf("\nDuration of the lecture: %d minutes", lectionDuration(mondayBegin, endOfLecture));

        String parseSting = "1999/Jun/18 07:34:56 PM";
        String pattern = "yyyy/MMM/dd hh:mm:ss a";
        System.out.print("\n" + parseStringLDTime(parseSting, pattern));

        LocalDateTime date4 = LocalDateTime.of(2001, 1, 15, 23, 56);
        String pattern4 = "HH:mm yyyy/dd/MM";
        System.out.print("\n" + formatDateToString(date4, pattern4));
    }

    public static long durationBetweenLections(LocalDateTime Begin, LocalDateTime End) {
        int passedDays = End.getDayOfMonth() - Begin.getDayOfMonth();
        int passedHours = End.getHour() - Begin.getHour();
        int passedMinutes = End.getMinute() - Begin.getMinute();
        int passedSeconds = End.getSecond() - Begin.getSecond();
        int passedHours1 = passedDays * 24 + passedHours;
        int passedMinutes1 = passedHours1 * 60 + passedMinutes;
        return passedMinutes1 * 60 + passedSeconds;
    }

    public static long lectionDuration(LocalDateTime begin, LocalDateTime end) {
        Duration duration = Duration.between(begin, end);
        return duration.toMinutes();
    }

    public static LocalDateTime parseStringLDTime(String parseSting, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, ENGLISH);
        return LocalDateTime.parse(parseSting, formatter);
    }

    public static String formatDateToString(LocalDateTime date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }

}
