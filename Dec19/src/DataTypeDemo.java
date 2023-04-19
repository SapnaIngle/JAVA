import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class DataTypeDemo {
// primitive DataType

    byte b = 127;
    short s = 32767;
    int i = 2245656;
    long l = 312589647936598875L;
    float f = 23589844566955369956987413658966566698.0f;
    double d = 14859632569874563256985412365898744558996563258974523695456982397589d;
    boolean aBoolean = true;
    char ch = 'h';







 // Non-Primitive DataType

 String str = "pune";
 String str1 = new String("mumbai");
 Byte aByte;
 Short aShort;
 Integer integer;
 Long aLong;
 Float aFloat;
 Double aDouble;
 Boolean Boolean;
 Character character;


 // Object Creation

    String show() {return "pune";}

 public static void main(String[]args) {
//     List<Integer> list = new ArrayList<>();
     DataTypeDemo obj = new DataTypeDemo();
     System.out.println(obj.b);
     System.out.println(obj.show());


 }
    }



    class data extends DataTypeDemo {
        public static void main(String[] args) {

            byte age = 34;
            char aChar = 'A';
            float f1 = 5.6f;
            double d1 = 4.66d;
            long l1 = 5999565466136L;
            boolean a = true;

            System.out.println(age);
            System.out.println(aChar);
            System.out.println(f1);
            System.out.println(d1);
            System.out.println(l1);
            System.out.println(a);
        }

   }

   // A variable is a container that stores a value. This value can be changed during the execution of the program.
  //  (data type)int (variable)number = (value it stores)8;


  /***
   *    Interface:- Normal, Marker, functional
   * */