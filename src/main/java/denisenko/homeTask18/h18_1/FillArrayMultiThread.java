package denisenko.homeTask18.h18_1;

import java.util.concurrent.CountDownLatch;

public class FillArrayMultiThread implements Runnable {

    private static volatile int threadIndex = 0;
    protected static String[] fizzBuzzMulti;
    private static int numberOfThreads;
    private static CountDownLatch cd;

    FillArrayMultiThread(int size, int numberOfThreads) {
        fizzBuzzMulti = new String[size];
        FillArrayMultiThread.numberOfThreads = numberOfThreads;
    }

    public static void multipleThread(FillArrayMultiThread Runnable) {
        cd = new CountDownLatch(numberOfThreads);
        for (int i = 0; i < numberOfThreads; i++) {
            Thread th = new Thread(Runnable);
            th.start();
        }
        try {
            cd.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        int begin = 0;
        int end = fizzBuzzMulti.length;
        int partSize = end / numberOfThreads;

        if (threadIndex == 0) {
            end = partSize;
        }
        if (threadIndex > 0) {
            begin = partSize * threadIndex;
            end = partSize * (threadIndex + 1);
        }
        if (threadIndex == numberOfThreads) {
            begin = partSize * threadIndex;
        }
        for (int i = begin; i < end; i++) {
            fizzBuzzMulti[i] = MultiFizzBuzzString(i);
        }
        cd.countDown();
    }

    private String MultiFizzBuzzString(int n) {
        if (n % 5 == 0 && n % 3 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(n);
    }
}
