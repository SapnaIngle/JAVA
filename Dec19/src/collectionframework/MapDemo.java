package collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Iterating map using forEach and forMap.
 * */
public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Pune");
        map1.put(2, "Hyderabad");
        map1.put(3, "Indore");

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(5, "Nashik");
        map2.put(6, "Chandigarh");
        map2.put(7, "Lucknow");

        Map<Integer, String> map3 = new HashMap<>();
        map3.put(8,"Ahmedabad");
        map3.put(9, "Gujarat");
        map3.put(10, "Mumbai");

        List<Map<Integer, String>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);

        list.forEach(s-> {
            s.forEach((k,v) ->{
                System.out.println("key=>" + k + "" + "value=>" +v);
            });
        });

//        for(Map.Entry<Integer,String> m:map.entrySet()){
//            System.out.println(m.getKey()+ " " +m.getValue());
//        }





    }
}
