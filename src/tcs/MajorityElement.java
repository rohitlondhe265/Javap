package tcs;

import java.util.*;
import java.util.Map.Entry;

public class MajorityElement {
    public static void main(String[] args) {
        // occurs more than or equal to n/2 times in array
        int[] arr = {2,4,2,4,2,4};
        int maxFreq = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int e : arr) {
            map.put(e, map.getOrDefault(e, 0)+1);
        }
        for(Integer e : map.values()) {
            maxFreq = Math.max(maxFreq, e);
        }
        for(Integer e : map.keySet()) {
            if(map.get(e) == maxFreq) System.out.print(e + " ");
        }
        

        // Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }
        // for(Integer e : map.keySet()) {
        //     System.out.println(map.get(e));
        // }
    }
}
