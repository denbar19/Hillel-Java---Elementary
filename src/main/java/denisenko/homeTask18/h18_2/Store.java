package denisenko.homeTask18.h18_2;

public class Store implements Runnable {

    private static volatile int capacity;
    protected static boolean working = true;

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(30000); // 30 sec lifecycle
                System.out.println("10 seconds break");
                capacity = 0;
                working = false;
                Thread.sleep(10000);
                working = true;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int getCapacity() {
        return capacity;
    }

    public static void setCapacity(int capacity) {
        Store.capacity = capacity;
    }
}
