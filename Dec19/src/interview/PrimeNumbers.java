package interview;

public class PrimeNumbers {

    public static void main (String[] args) {
        int num = 14;
        boolean b = false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                b = true;
                break;
            }
        }
        if(!b) {
            System.out.println(num + " " + "is a prime number.");
        }
        else {
            System.out.println(num + " " + "is not a prime number.");
        }
    }
}



