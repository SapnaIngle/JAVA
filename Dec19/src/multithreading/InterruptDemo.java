package multithreading;

public class InterruptDemo extends Thread {

//    public static void main(String[] args) {
//        InterruptMethodDemo obj = new InterruptMethodDemo();
//        obj.start();
//
//        obj.interrupt();
//    }
//
//
//        public void run () {
//            try {
//                Thread.sleep(100);
//                System.out.println("sapna");
//            } catch (InterruptedException e) {
//                System.out.println("Exception Handled");
//
//            }
//            System.out.println("Thread is running");
//        }


    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t1.interrupt();
        System.out.println(t1.isInterrupted());
        System.out.println("In main thread");

        }

    }
