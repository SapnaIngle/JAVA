package collectionframework;


/**
 * The class is based on the basic principle of last-in-first-out.
 *  In addition to the basic push and pop operations, the class provides three more functions of empty, search, and peek
 * */
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.search(10));
        System.out.println(stack);
    }
}
