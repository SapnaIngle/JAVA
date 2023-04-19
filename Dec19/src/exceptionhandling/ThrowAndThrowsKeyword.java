package exceptionhandling;

/**
 *  Difference between Throw and Throws
 * **/
public class ThrowAndThrowsKeyword {

    public static void main(String[] args) throws Exception {

        ThrowAndThrowsKeyword obj = new ThrowAndThrowsKeyword();
        obj.show();
    }


        public void show() throws Exception, ArithmeticException {    // declaring exception
            System.out.println("In Show");
            try{      // handling exception
                throw new Exception("Throwing Exception");
            } catch (Exception e){
                System.out.println(e);
            }

            throw new Exception("Throwing Exception");
        }

}

/**
 *                       Throw                                                       Throws
 *
 *    1. To throw exception explicitly                            1. To declare exception
 *
 *    2. Can throw only one exception at a time                   2. Can declare multiple exception at a time
 *
 *    3. Throw is used in method only                             3. Throws is used with method signature
 *
 *    4. Throw is used with object of class                       4. Throws is used with instance of class
 *
 * **/