package polymorphism;

// Method overloading increases the readability of program

/**
 * Polymorphism - The ability to take one form to many form
 *
 * or
 *
 * one thing have many options
 * e.g 1- method overloading- a class have some methods name with different number of argument
 *
 * rule - 1. changing the number
 *        2. changing type of argument
 *
 *  Compile time polymorphism, early binding, static polymorphism
 * */



public class PolymorphismDemo {

    public static void main(String[] args) {
        PolymorphismDemo obj = new PolymorphismDemo();
        obj.add(7,9, 8);
        obj.add(7,9, 8);

    }

    public void add(int i, int j) {

        System.out.println(i + j);
    }


    public void add(int i, int j, int k) {

        System.out.println(i + j + k);
    }
}