package multithreading;

/**
 *  Marker Interface :- no method
 *  Functional :- Only one abstract (Single) method
 *  Normal :- More than one method
 *
 *
 *  Lambda Expression:-
 *
 *
 * */
public class HiHelloDemo extends Thread {

    public static void main(String[] args) throws InterruptedException {

        Thread obj = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hii");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread obj2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        obj.start();
        obj2.start();

        obj.join();
        obj2.join();

        System.out.println("Exit");

    }
}