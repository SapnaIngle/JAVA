package constructor;

/**
 * Constructor - it is special type of function which execute when you create object of class
 * rule -
 *
 * 1.your function should be class name
 * 2.there is no explicit return type
 * 3.final,static,synchronized keyword are not allowed
 * 4. We cannot write final constructor
 * 5. we can also make private constructor
 *
 * types of constructor - parameter constructor
 * default constructor
 */

public class Constructor {
    public Constructor() {
        System.out.println("In constructor");
    }

    public Constructor(int i) {
        System.out.println("In constructor" +i);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor(23);
    }
}
