package multithreading;

public class YieldDemo extends  Thread {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.yield();
                for (int i = 1; i <= 5; i++) {
                    System.out.println("in T1 method");
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.yield();
                for (int i = 1; i <= 5; i++) {
                    System.out.println("In T2 method");
                }
            }
        });

        t1.start();
        t2.start();

    }
}