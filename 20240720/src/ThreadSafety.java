public class ThreadSafety {
    static int count = 0;
    private static final Object locker = new Object();

    static synchronized public void add() {
        count++;
    }
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                add();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                add();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count);
    }
}
