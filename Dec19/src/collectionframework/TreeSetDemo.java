package collectionframework;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(25);
        treeSet.add(40);
        treeSet.add(50);
//
//        System.out.println(treeSet);
//        System.out.println(treeSet.headSet(30, false));
//        System.out.println(treeSet.tailSet(30, true));
//        System.out.println(treeSet.first());
//        System.out.println(treeSet.last());
//        System.out.println(treeSet.floor(21));
//        System.out.println(treeSet.ceiling(21));
//        System.out.println(treeSet.higher(30));
//        System.out.println(treeSet.lower(20));
//        System.out.println(treeSet.pollFirst());
//        System.out.println(treeSet.pollLast());
//        System.out.println(treeSet.subSet(10,30));
        System.out.println(treeSet.subSet(10, true, 40, false));
        System.out.println(treeSet.descendingSet());

    }
}
