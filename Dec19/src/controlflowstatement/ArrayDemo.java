package controlflowstatement;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        int[] num = {9,19,19,191};
        ;
        for(int i=0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }



        String[] city = new String[5];
        city[0]="Pune";
        city[1]="Mumbai";
        city[2]="Hyderabad";
        city[3]="Indore";
        city[4]="Nagpur";
        for(int i=0; i<city.length ; i++)
        {
            System.out.println(city[i]);
        }


    }

}
