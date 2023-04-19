package stringdemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

/**
 * String is basically an object that represents sequence of char values.
 * Heap :- It can create multiple of similar objects.
 * String Constant Pool(SCP) :- It will not create repeated objects.
 * We can never modify String. Strings are immutable.
 * In string literal case 1 or 0 objects may create
 *
 *
 * */
public class StringDemo {

    public static void main(String[] args) {


        String string = "I am Indian" +
                "fe;wnr am lrewn" +
                "rerewrrwerer" +
                "werwrewrewre";

//        String str2 = " ";
        String str = "Pune";
        String str1 = "pune";
//        String string = new String("Pune");

        System.out.println(str==str1);
        System.out.println(str.equalsIgnoreCase(str1));

        str = str.concat("Kolhapur");

        System.out.println(str);
//        System.out.println(str.charAt(2));
//        System.out.println(str.indexOf('n'));
//        System.out.println(str2.isBlank());  //consider space
//        System.out.println(str2.isEmpty());
//        System.out.println(str.chars().count());

        String obj1 = "obj1";
        String obj2 = "obj1";
        String obj3 = "obj1";
        String obj4 = "obj1";

        char[] arr = {'w', 'e', 'l', 'c', 'o', 'm', 'e'};
        String str4 = new String(arr);
        System.out.println(str4);


    }
}
