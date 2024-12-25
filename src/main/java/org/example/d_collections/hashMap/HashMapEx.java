package org.example.d_collections.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Odin", 1);
        map.put("Dva", 2);
        map.put("Tri", 3);
        map.put("4", 4);

        System.out.println(map.containsKey("Odin"));
        System.out.println(map.isEmpty());

        for (Map.Entry<String, Integer> entry: map.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
