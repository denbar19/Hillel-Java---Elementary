package denisenko.homeTask14;

import java.util.List;
import java.util.Random;

public class Writer<T extends Number> implements Runnable {

    private final List<T> list;

    public Writer(List<T> list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Random randomNumber = new Random();
                list.add((T) (Number) randomNumber.nextInt());
                Thread.sleep(2500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
