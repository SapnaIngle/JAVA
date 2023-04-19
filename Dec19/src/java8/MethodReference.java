package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReference {

// method reference to instance method

    public static void main(String[] args) {

        // refer method
        MethodReference methodReference = new MethodReference();
        // calling method
        MyInterface2 myInterface2 = methodReference::display;

        System.out.println(myInterface2.msg());

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.forEach(System.out::println);
    }

    public String display(){
        return "Good Morning";
    }
}


interface MyInterface2{
    String msg();

}