package thread;

public class Demo16 {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();

        Thread t = new Thread(() -> {
            System.out.println("t线程开始等待");
            try {
                mainThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t线程结束等待");
        });

        t.start();

        Thread.sleep(2000);
        System.out.println("main线程结束");
    }


}
