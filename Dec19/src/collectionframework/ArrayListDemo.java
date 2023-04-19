package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * ArrayList maintain insertion order
 * It stores duplicate values
 * It uses dynamic array to store element
 * It grows by 50%
 * */
public class ArrayListDemo {

    public static void main(String[] args) {

//        int[] arr = new int[100];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 55;
//        arr[3] = 45;
//        System.out.println(arr[1]);

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = Arrays.asList(1,2,3,6,5);
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,6,4));
        List<Integer> list4 = new ArrayList<>(List.of(1,2,8,9));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);

//        List<Integer> list5 = new ArrayList<>(){{add(10),add(20);}};

    }
}
