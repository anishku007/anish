package org.arc.aie;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOccupancyOFetchCharacter {

    public static void main(String[] arg) {
        String str = "anvdsgght";
        char[] arr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : arr) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        Integer max = map.values().stream().mapToInt(v -> v).max().getAsInt();
        System.out.println(max);
        Set<Map.Entry<Character, Integer>> entry = map.entrySet();
        entry.forEach(e -> System.out.println(e.getKey() + "  " + e.getValue()));
    }
}
