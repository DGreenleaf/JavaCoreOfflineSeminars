package examplesM8.testing1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sergiy on 10/16/16.
 */
public class testing1 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("key", "value");

        map.put("key", "value");

        String res = map.get("key");

        System.out.println(res);
    }


}
