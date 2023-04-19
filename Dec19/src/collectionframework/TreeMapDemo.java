package collectionframework;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(25, "Pune");
        map.put(1, "Hyderabad");
        map.put(3, "Indore");
        map.put(6, "Rajasthan");
        map.put(8, "Mizoram");

        System.out.println(map);

        System.out.println(map.descendingMap());
        System.out.println(map.firstEntry()); // It is by default in treemap
        System.out.println(map.lastEntry());
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.pollFirstEntry());
        System.out.println(map.ceilingEntry(20));
        System.out.println(map.floorEntry(5));
        System.out.println(map.containsKey(25));
        System.out.println(map.ceilingKey(20));
        System.out.println(map.subMap(6,9));
        System.out.println(map.subMap(6,true, 8, true));

    }
}
