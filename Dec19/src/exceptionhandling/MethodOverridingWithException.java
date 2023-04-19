package exceptionhandling;

public class MethodOverridingWithException {

    public void show() throws RuntimeException{
        System.out.println("In show");
    }
}

    class Sample extends MethodOverridingWithException{

    public void show() throws RuntimeException{
        System.out.println("In sample show");
    }

    public static void main(String[] args){
        Sample obj = new Sample();
        obj.show();
    }
}


/**
 *  Rules :
 *      If parent class declare no exception then you can declare unchecked exception in child
 *      If parent class declare exception that you can declare same exception in child
 *      If parent class declare exception then you can declare parent exception
 *
 * **/