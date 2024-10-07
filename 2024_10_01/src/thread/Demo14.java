package thread;

public class Demo14 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("====t线程====");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("t线程结束");
        });

        t.start();
        System.out.println("主线程开始等待");
        t.join();
        System.out.println("主线程结束等待");
    }
}
