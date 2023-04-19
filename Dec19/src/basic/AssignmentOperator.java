package basic;

public class AssignmentOperator {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int num1 = 8;
        int num2 = 5;
        int num3 = 9;
        int sum = num1 + num2 + num3;
        System.out.println("The sum of these numbers is "+sum);

        int i1 = 7;
        int i2 = 5;
//        int result = i1 + i2;
//        int result = i1 * i2;
        int result = i1 / i2;  // here in this case it will give quotient, for remainder have to use %(modulus operator)
//        int result = i1 % i2; // it will give remainder
//        int result = i1 - i2;
        System.out.println(result);

        // adding by 2
        int t1 = 6;
//        t1 += 2;   // OR
//        t1 = t1+2;
//        t1 += 2;
//        t1 -= 2;
//        t1 *= 2;
//        t1 /= 2;
//        t1++;  // post-increment
//        t1--;  // decrement
//        ++t1;  // pre-increment
//        --t1;  // pre-decrement
        System.out.println(t1);

//        int res= t1++; // fetch the value and then increment
        int res = ++t1;  // increment and then fetch the value
        System.out.println(res);



    }
}

