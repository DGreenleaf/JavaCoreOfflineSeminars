package examplesM8_2.maps;

import java.util.*;

/**
 * Created by Sergiy on 10/20/16.
 */
public class MapExample {
    public static void main(String[] args) {

        //List<String> list = new ArrayList<>();

        //String 1 = key
        //String 2 = value

        Map<String, Integer> map = new LinkedHashMap<>();

        System.out.println(map);

        map.put("Jan", 31);
        map.put("Feb", 28);
        map.put("Mar", 31);
        map.put("Apr", 30);
        map.put("Apr", 30);
        map.put("May", 31);

        System.out.println(map);

        System.out.println(map.get("Feb"));

        //dostaem iz mapi vse klu4i
        System.out.println(map.keySet());

        map.remove("Jan");
        System.out.println(map);

        //treemap - po poryadky sortiruet
        Map<String, Integer> map1 = new TreeMap<>();

        map1.put("Jan", 31);
        map1.put("Feb", 28);
        map1.put("Mar", 31);
        map1.put("Apr", 30);
        map1.put("Apr", 30);
        map1.put("May", 31);

        System.out.println(map1);

    }
}
