package test.hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashMapTest {

    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("K1", 0.1);
        map.put("K2", 0.2);
        map.put("K3", 0.3);
        map.put("K4", 0.4);
        System.out.println(map.get("K1"));
    }
}
