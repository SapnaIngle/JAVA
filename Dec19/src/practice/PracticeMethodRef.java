package practice;

import java.util.Arrays;
import java.util.List;

public class PracticeMethodRef {

    public static void main(String[] args) {

        List<String> names= Arrays.asList("Radha", "Sapna", "Moana", "Jessi");
        names.forEach(System.out::println);


        String str= "Sapna Ingle";
        myPrinter mp = new myPrinter();
        mp.print(str);
    }
}

class myPrinter{
    public void print(String str){
        System.out.println(str);
    }
}