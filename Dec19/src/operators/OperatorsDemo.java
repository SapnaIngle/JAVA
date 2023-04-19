package operators;

/**
 * arithmetic = +,-,*,/,%
 * boolean = true false
 * ternary = ?
 * logical = &&, // NOT
 * bitwise = & /
 * unary = (post increment) a++, (post decrement) a--, (pre increment) ++a, (pre decrement)--a
 * relational = < >, <=, >=
 * assignment = = ==
 * shift = <<, >>
 */






public class OperatorsDemo {
     public static void main(String[] args) {

      int i = 100;
      int j = 20;

      System.out.println(i+j);
      System.out.println(i-j);
      System.out.println(i*j);
      System.out.println(i/j);
      System.out.println(i%j);

         System.out.println(++i); //i+1 = i
         System.out.println(--i); //i-1 = i
         System.out.println(i++); //

         System.out.println(i<j);
         System.out.println(i<<2); //i*2^2 = 10*4=40
         System.out.println(i>>2); //i/2^2 = 10/4=2

         System.out.println(i&j); // 1010
                                  // 1010
                                  // ------
                                  //   1010

         int r = 10;
         int t = 0;

         if(r>0 && t>0 ) {
         System.out.println("both are not zero");
     } else {
             System.out.println("t is 0, else");
         }

         if(r>0 || t>0){
             System.out.println("both are not zero");
         } else {
             System.out.println("in else");
         }

         // ternary operator

         String ot = r>0 || t>0?"both are not zero":"in else";
         System.out.println(ot);



         }
 }