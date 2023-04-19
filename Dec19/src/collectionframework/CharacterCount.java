package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args) {

        String str = "Sweet Home".replaceAll("", "").toLowerCase();

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i=0; i< str.length(); i++) {

            Character ch = str.charAt(i);

            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch, 1);
            }
        }

        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey()+ "" + entry.getValue());
        }
    }
    
}

    class CharacterCountInWords{

        public static void main(String[] args) {

            String str = "Welcome In Pune".replaceAll("", "").toLowerCase();
            String[] splited = str.split("\\s");

            Map<String, Integer> map = new HashMap<>();
            for( String ch: splited){

                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch) + 1);
                }else{
                    map.put(ch,1);
                }
            }
            System.out.println(map.entrySet());
        }
    }


