package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class ArrayListMethods {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);


        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(50);
        list2.add(60);

//        list1.addAll(list2);
//        list1.removeAll(list2);
        list1.retainAll(list2);


//        System.out.println(list1.containsAll(list2));

        List<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(40);
        list3.add(2, 25);

        System.out.println(list3.contains(190));
        System.out.println(list3.get(1));
        System.out.println(list3.indexOf(30));
        System.out.println(list3.isEmpty());
        list3.remove(0);

        list3.remove(Integer.valueOf(30));
//        System.out.println(list3.set(2,25));
//        list3.clear();
        System.out.println(list3.subList(1,3));
        list3.clear();

        int[] arr = {1,2,3,4,5};
//        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Long> longs = LongStream.of(new long[] {1L, 2L, 3L}).boxed().
                collect(Collectors.toList());
//        List<Integer> list = new ArrayList<>(Arrays.asList(arr));





// linked list and vector
    }
}
