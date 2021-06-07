package denisenko.homeTask14;

import java.time.LocalDateTime;
import java.util.List;

public class Reader<T extends Number> implements Runnable {

    private final List<T> list;

    public Reader(List<T> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            if (list == null) {
                System.out.println(LocalDateTime.now() + " The list is empty");
                break;
            }
            synchronized (list) {
                System.out.println(list);
                list.clear();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}