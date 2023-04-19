package abstraction;

import encapsulation.Encapsulation;

/**
 *  Abstraction -- Hiding details and showing functionality.
 * */

public class Football implements Sports{
    @Override
    public void play() {
        System.out.println("In football");
    }

    @Override
    public void play2() {

    }

    public static void main (String[] args) {
//        Football obj = new Football();
//        obj.play();
//
//        Encapsulation obj = new Encapsulation();
//        obj.id = 1;
//        obj.name = "Akash";
//        obj.address = "Pune";
//        System.out.println(obj.id+" "+obj.name+" "+obj.address);

    }
}
