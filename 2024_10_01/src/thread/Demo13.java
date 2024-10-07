package thread;

public class Demo13 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            Thread currentThread = Thread.currentThread();
            while (!currentThread.isInterrupted()) {
                System.out.println("hello thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        });

        t.start();

        Thread.sleep(3000);

        t.interrupt();
    }
}
