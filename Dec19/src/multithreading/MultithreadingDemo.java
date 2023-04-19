package multithreading;

/**
 * Foreground Services
 * Background Services
 * Thread is a subprocess
 * Two ways to write multithread code or How to achieve multithreading?
 * --> Extending the thread class
 * --> Runnable Interface
 * To run the class use "obj.start()".
 * If we use "obj.run()" it is not multithreading.
 * */
public class MultithreadingDemo extends Thread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        MultithreadingDemo obj = new MultithreadingDemo();
        obj.start();

    }


    public void run(){
        System.out.println("Run Method");
        System.out.println(Thread.currentThread().getName());
    }

}
