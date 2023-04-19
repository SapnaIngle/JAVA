package collectionframework;

/**
 * FIFO(First In First Out) order.
 *
 * */
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.offer(50);

//        System.out.println(queue.remove());    //- returns exception
//        System.out.println(queue.poll());      //- returns null

//        System.out.println(queue.peek());      //- returns null
        System.out.println(queue.element());     //- returns exception

        System.out.println(queue);
    }
}
