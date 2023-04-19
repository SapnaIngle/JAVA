package thiskeyword;

import org.w3c.dom.UserDataHandler;

/**
 * this keyword is used to refer current class instance variable or global variable
 * this is used to refer current class method
 * this is used to call current class constructor
 * this is used to pass argument as in method
 * */

public class ThisKeyword {

    int id;
    String name;
    String address;

    public ThisKeyword(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

   ThisKeyword() {
        this(1, "Usha", "Pune");
   }


    public void show(A a) {
        System.out.println("In show");
    }

//    public void display() {
//        A a = new A();
//        this.show(a);
//    }


    public static void main (String[] args) {
        ThisKeyword obj = new ThisKeyword(1, "Usha", "Pune");
        System.out.println(obj);
    }
}

    class A {

    public void display() {
        ThisKeyword obj1 = new ThisKeyword();
        obj1.show(this);
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }


}


