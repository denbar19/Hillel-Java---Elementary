package denisenko.homeTask05.h05_3;

/**
 * Написать 2 класса - Bottle (бутылка) и Liquid (жидкость).
 * Поля Bottle: объем, жидкость
 * Поля Liquid: плотность, цвет, газированная/не газированная
 * В обоих класса переопределить метод equals(). Создать 3 объекта Bottle, заполнить их жидкостью и сравнить.
 * Автогенерацию метода equals() использовать нельзя (конечно, я не отличу автогенерацию от рукописного кода,
 * но все же постарайтесь написать метод самостоятельно).
 */
public class Main05_3 {

    public static void main(String[] args) {
        Bottle beer = new Bottle(0.5, "beer");
        beer.setLiquid(1050, "brown", true);

        Bottle soda = new Bottle(1.0, "soda");
        soda.setLiquid(900, "yellow", true);

        Bottle tea = new Bottle(0.2, "tea");
        tea.setLiquid(1050, "black", false);

        System.out.println(beer.equals(tea));
        System.out.println(beer.equals(soda));
        System.out.println(tea.equals(soda));

    }
}
