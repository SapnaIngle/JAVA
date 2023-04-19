package statickeyword;

/**
 * Static keyword is used for memory management
 * This keyword can apply with variables, methods, blocks, nested classes
 * Static method cannot be override, but it can be overload
 * */
public class StaticDemo {

    int id;
    String name;
    static String collegeName = "GVISH";


    public static void main(String[] args) {
      StaticDemo obj = new StaticDemo();
      obj.id = 1;
      obj.name = "Ana";
      System.out.println(obj.id+" "+obj.name+" "+collegeName);

      StaticDemo obj1 = new StaticDemo();
      obj1.id = 2;
      obj1.name = "Ruhi";
      System.out.println(obj1.id+" "+obj1.name+" "+collegeName);

      StaticDemo obj2 = new StaticDemo();
      obj2.id = 3;
      obj2.name = "Sunil";
      System.out.println(obj2.id+" "+obj2.name+" "+collegeName);
    }
}
