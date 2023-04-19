package controlflowstatement;

import java.util.Arrays;

public class ForDemo {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println("" + i);
        }

        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        for (int i : arr) {  // enhanced for loop
            System.out.println(i);
        }

        Arrays.asList(1458,258,344,544).forEach(System.out::println);


    /**
     * *****
     * *****
     * *****
     * number of rows=3
     * columns = 5
     * **/
    for(int i=1; i<=4; i++){
        for(int j=1; j<=5; j++){
            System.out.print(" *");
        }
        System.out.println();
        }


    }
}

