package finalkeyword;

/***
 * Final variable :- if you declare final variable then you cannot reassign value to variable
 * final method :- if you declare final method then you cannot override
 * final class :- if you declare final class then you cannot inherit class
 * */
public class FinalDemo {

   final int i = 10;

    public final void show(){
        System.out.println("In final method");
    }

    public static void main(String[] args){
        FinalDemo obj = new FinalDemo();
//        obj.show();
        System.out.println(obj.i);
    }

}

class C extends FinalDemo{

//    public void show(){  // cannot override

    public static void main(String[] args) {
        C obj = new C();
        System.out.println("");
    }
}

