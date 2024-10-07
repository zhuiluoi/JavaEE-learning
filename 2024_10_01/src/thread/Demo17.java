package thread;

public class Demo17 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println(t.getState());

        t.start();

        Thread.sleep(500);
        System.out.println(t.getState());
        Thread.sleep(2000);

        System.out.println(t.getState());
    }
}
