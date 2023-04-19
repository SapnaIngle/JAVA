package multithreading;

/**
 *  While using Implements in class we have to create an object of Thread and have to run using "obj.start()"
 *
 *      Life Cycle of Thread
 *      New         -   Before the invocation of Thread.start().
 *      Runnable    -   After the invocation of Thread.start() method and thread scheduler is not selected as running thread.
 *      Running     -   Thread scheduler selected as running thread.
 *      Blocking    -   Thread wait or sleep state.
 *      Dead or     -   Thread execution end or stop().
 *      Terminated
 * */

public class RunnableDemo implements Runnable{

    public static void main(String[] args) {
        RunnableDemo obj = new RunnableDemo();
        Thread obj1 = new Thread(obj);
        obj1.start();

    }

    @Override
    public void run() {
        System.out.println("In Run");
    }
}

//