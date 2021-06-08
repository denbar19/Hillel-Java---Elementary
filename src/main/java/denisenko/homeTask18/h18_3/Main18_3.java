package denisenko.homeTask18.h18_3;

/**
 * Вложенные классы:
 * Написать класс MyDate. В нем должны быть определены статические классы Month и DayOfWeek. Поля класса MyDate:
 * Создать несколько объектов MyDate с помощью конструкторов:
 * Подумайте, можно ли сделать вложенные классы перечислениями (энамами).
 */
public class Main18_3 {

    public static void main(String[] args) {

        System.out.println(new MyDate("January", 1));
        System.out.println(new MyDate("February", 2, new MyDate.DayOfWeek("Tuesday")));

    }
}
