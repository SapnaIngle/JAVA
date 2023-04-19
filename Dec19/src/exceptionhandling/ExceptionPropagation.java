package exceptionhandling;

/**
 * checked exception cannot be propagated
 */

public class ExceptionPropagation {

    public void a(){
        int i = 10/0;
    }
    public void b(){
        this.a();
    }

    public void c(){
        this.b();
    }

    public static void main(String[] args) {
        ExceptionPropagation obj = new ExceptionPropagation();
        try{
            obj.c();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
