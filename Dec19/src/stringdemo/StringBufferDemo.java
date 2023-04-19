package stringdemo;

/**
 * StringBuffer is synchronized while StringBuilder is non-synchronized
 * StringBuffer is less efficient than StringBuilder.
 * StringBuffer was introduced in Java 1 while StringBuilder was introduced in Java 1.5
 * StringBuffer and StringBuilder are mutable
 * */
public class StringBufferDemo {

    public static void main(String[] args) {

        String str = "Pune";
        StringBuffer stringBuffer = new StringBuffer(str);
//        stringBuffer.append("Mumbai");
//        stringBuffer.indexOf();
//        stringBuffer.charAt();
        System.out.println(stringBuffer.reverse());


        StringBuilder stringBuilder = new StringBuilder("Qatar");
        System.out.println(stringBuilder.reverse());
    }
}
