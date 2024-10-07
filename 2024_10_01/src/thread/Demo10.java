package thread;

public class Demo10 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("t1");
            Thread t2 = new Thread(() -> {
                System.out.println("t2");
            });
            t2.start();
        });

        t1.start();
        System.out.println("main");

    }
}
