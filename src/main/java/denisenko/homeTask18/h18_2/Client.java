package denisenko.homeTask18.h18_2;

import java.util.Random;

import static denisenko.homeTask18.h18_2.Store.*;

public class Client implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                Random number = new Random();
                int peroid = number.nextInt(5000 - 2000) + 2000; // between 2-5 s

                int timeSpentStore = number.nextInt(8000 - 1000) + 1000; // between 1-8 s
                Thread.sleep(peroid);

                if (getCapacity() < 5 && working) {
                    setCapacity(getCapacity() + 1);
                    System.out.println("Client came in, capacity - " + getCapacity());
                    Thread.sleep(timeSpentStore);
                    if (getCapacity() > 0) {
                        setCapacity(getCapacity() - 1);
                        System.out.println("Client left, capacity - " + getCapacity()
                                + ", time spent = " + timeSpentStore / 1000
                                + " sec, thread -> " + Thread.currentThread().getName());
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
