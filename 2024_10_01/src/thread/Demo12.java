package thread;

public class Demo12 {
    private static boolean isQuit = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (!isQuit) {
                System.out.println("hello thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("线程结束");
        });

        t.start();

        Thread.sleep(2000);
        System.out.println("尝试终止线程t");
        isQuit = true;

    }
}
