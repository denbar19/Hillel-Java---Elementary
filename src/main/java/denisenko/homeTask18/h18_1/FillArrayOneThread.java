package denisenko.homeTask18.h18_1;

public class FillArrayOneThread implements Runnable {

    private static String[] fizzBuzzOne;

    FillArrayOneThread(int size){
        fizzBuzzOne = new String[size];
    }

    public static void oneThread(FillArrayOneThread Runnable){
        Thread oneThread = new Thread(Runnable);
        oneThread.start();
        try {
            oneThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < fizzBuzzOne.length; i++) {
            fizzBuzzOne[i] = singleFizzBuzzString(i);
        }
    }

    private String singleFizzBuzzString(int n) {
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