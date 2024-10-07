package thread;

class MyThread extends Thread {
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

public class Demo1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        //创建线程
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
