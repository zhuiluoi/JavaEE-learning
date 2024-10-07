package thread;

public class Demo8 {
    public static void main(String[] args) {
        Thread t = new Thread(() ->{
            while (true) {
                System.out.println("hello thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 把 t 设为 守护线程（后台线程）
        t.setDaemon(true);
        t.start();



    }
}
