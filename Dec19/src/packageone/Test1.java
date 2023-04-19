package packageone;

public class Test1 {

    // global variable  // instance variable

    public int i=10;
//    private int i =10;

    public static void main(String[]args) {

        int i=10; // local variable
        Test1 obj= new Test1();
        System.out.println(obj.i);
    }



}


// private is accessible within class only
// default is accessible within package only
// protected is accessible within package only and through inheritance outside
// public is accessible everywhere