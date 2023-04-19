package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * The ArrayDeque in Java provides a way to apply resizable-array in addition to the implementation of the Deque interface.
 * It is also known as Array Double Ended Queue or Array Deck.
 * */
public class ArrayDequeDemo {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.offer(50);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
//        System.out.println(deque.remove());    //- returns exception
//        System.out.println(queue.poll());      //- returns null
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

//        System.out.println(deque.peek());      //- returns null
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.element());     //- returns exception

        System.out.println(deque);

    }
}
