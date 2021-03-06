package denisenko.homeTask18.h18_2;

/**
 * В городе успешно работает ювелирный магазин, так как к магазину постоянно приходят клиенты.
 * Из-за карантина в магазине не может одновременно находится больше 5 клиентов.
 * Клиенты прохотят мимо магазина 1 раз в 2-5 секунд и заходят в магазин если он открыт и в нем есть место.
 * Иначе клиент уходит. Магазин закрывается на 10-секундный перерыв один раз в 30 секунд.
 * В перерыв все клиенты выходят из магазина и новые не могут зайти.
 * Каждый клиент находится в магазине в промежутке от 1 до 8 секунд.
 */
public class Main18_2 {

    public static void main(String[] args) {

        Store store = new Store();
        Thread storeBreak = new Thread(store);
        storeBreak.start();

        for (int i = 0; i < 10; i++) {
            Thread clientVisit = new Thread(new Client());
            clientVisit.start();
        }
    }
}
