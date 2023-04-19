package practice;

/**
 * Type Conversion and Casting :--
 * Conversion of byte to integer
 * b = byte(a) ->It is called casting
 * Type casting is when we assign a value of one primitive data type to another type
 * Widening Casting(automatically)-> converting smaller type to larger type size(byte->short->char->int->long->float->double)
 * Narrowing Casting(manually)->Vice versa
 * **/
public class ConversionCasting {

    public static void main(String[] args) {
        //conversion of byte to int
        byte b = 127;
        int a=b;
        System.out.println(a);

        // casting int to byte
        // Bigger values of int gives remainder after run
        int i = 17;
        byte k = (byte) i;
        System.out.println(k);

        // float to int
        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);

        //type promotion
        byte a1 = 10;
        byte b2 = 20;
        int result = a1*b2;
        System.out.println(result);

        //double to int
        double d = 23;
        int d2 = (int) d;
        System.out.println(d2);

        //double to float
        double h = 54;
        float f1 = (float) h;
        System.out.println(f1);

        //float to double
        float f3 = 58.9f;
        double d3 = f3;
        System.out.println(d3);

        // int to float
        int p = 542;
        float hy = (float) p;
        System.out.println(hy);

    }
}
