package thread;

public class Demo3 {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                //这里写的代码， 就是即将创建出的线程， 要执行的逻辑
                while (true) {
                    System.out.println("Hello Thread");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
        while (true) {
            System.out.println("Hello Main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
