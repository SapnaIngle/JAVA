package multithreading;


/**
 *  daemon thread is called as worker thread which has always low priority
 * **/
public class ThreadMethods {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In run");

                System.out.println(Thread.currentThread().getName());
            }
        });
        t1.setDaemon(true);

        System.out.println(t1.isDaemon());
        t1.setName("Th-01");
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In run 2");
            }
        });
        t2.start();
        t2.setPriority(Thread.MIN_PRIORITY);  // value 1
        t2.setPriority(Thread.MAX_PRIORITY);  // value 10

        System.out.println(t1.isAlive());


    }

}

