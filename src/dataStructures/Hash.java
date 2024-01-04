package dataStructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Hash {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Some");
        map.put(2, "here");
        for (Entry<Integer, String> e : map.entrySet()) {
            System.out.println("key: " + e.getKey() + " Value: " + e.getValue());
        }
        // for (Integer i : map.keySet()) {
        //     System.out.println("key: " + i + " Value: " + map.get(i));
        // }

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(13);
        set.add(18);
        Set<Integer> set2 = new HashSet<>();
        set2.add(13);
        set2.add(19);
        // union intersection and Subset
        set.addAll(set2);
        // set.retainAll(set2);
        // System.out.println(set.containsAll(set2));
        // System.out.println(set);
    }
}
