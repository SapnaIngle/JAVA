package java8;

public class MethodRefToConstructor {

    public MethodRefToConstructor(){
        System.out.println("In Constructor");
    }

    public static void main (String[] args){
        MyInterface4 myInterface4 = MethodRefToConstructor::new;
        // OR
//        MethodRefToConstructor obj = new MethodRefToConstructor();

        myInterface4.methodReference();

    }
}


interface MyInterface4 {
    MethodRefToConstructor methodReference();
}