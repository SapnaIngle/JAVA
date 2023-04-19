package exceptionhandling;

// We can use Try catch, final keyword as well
public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        int i = 10;
        int j = 0;

        try {
            try {
                int c = i / j;
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            String str = null;
            System.out.println(str.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("Hello World");
    }



}
