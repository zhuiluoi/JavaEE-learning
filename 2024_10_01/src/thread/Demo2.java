package thread;
//通过Runnable实现多线程

class MyRunnable implements Runnable{

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
}

public class Demo2 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        //创建线程
        Thread t = new Thread(runnable);
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
