package polymorphism;

/**
 * Method Overriding - Two class have same method with same signature is called method overriding.
 *
 * runtime polymorphism, late binding, dynamic polymorphism
 * */



public class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    public void sound() {                         // concrete method, defined method - which have body
        System.out.println("in Cat sound");
    }


    public static void main(String[] args) {
        Cat obj = new Cat ();
        obj.sound();
    }
}

class Dog extends Cat {
    public void sound() {
        System.out.println("in Dog sound");
    }


    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
    }
}