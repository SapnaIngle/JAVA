package java8;
/***
 * Lambda Expression -> anonymous function.
 * Syntax -> ()->{}
 * Advantage -> To implement functional interface and it takes less code.
 * */
public class LambdaExpression {

    public static void main(String[] args) {

        MyInterface myInterface = (i)-> {
            System.out.println("In show");
        };
        myInterface.show(6);

        MyInterface1 myInterface1 = (a,b)-> a*b;
        System.out.println(myInterface1.multi(5,8));

    }

    interface MyInterface{
        void show(int i);
    }

    interface  MyInterface1{
        int multi(int i, int j);
    }

}

