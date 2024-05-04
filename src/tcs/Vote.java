package tcs;

import java.util.*;

public class Vote {
    public static String solution(String[] votes, int n) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (votes[i] == votes[j])
                    count++;
            }
            map.put(count, votes[i]);
        }
        Iterator<Integer> it = map.keySet().iterator();
        int max = 0;
        while (it.hasNext()) {
            Integer k = it.next();
            max = Math.max(max, k);
        }
        return map.get(max);
    }

    public static void main(String[] args) {
        String[] arr = { "john", "ron", "con", "son", "john", "john", "son", "son", "son" };
        String s = solution(arr, arr.length);
        System.out.println(s);
    }
}
