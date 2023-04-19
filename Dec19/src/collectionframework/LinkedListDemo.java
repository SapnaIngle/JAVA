package collectionframework;

/**
 * Arraylist have bitshifting whereas Linked list don't have
 * */
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        //
//        list.addLast(35);
        list.add(10);
        list.add(20);
        list.add(30);
//        list.addFirst(5);
        System.out.println(list.offer(40));
        System.out.println(list.offer(40));
        ;

//        System.out.println(list.element());
//        System.out.println(list.peek());
//        System.out.println(list.poll());
//        System.out.println(list.remove());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

//        System.out.println(list);
//        Iterator<Integer> integerIterator = list.descendingIterator();
//        while (integerIterator.hasNext()){
//            System.out.println(integerIterator.next());
//        }
    }
}

