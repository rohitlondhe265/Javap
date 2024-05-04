package tcs;

import java.util.*;

public class SubsetOfArr {
    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int e : arr) {
            int n = outer.size();
            for(int i=0; i<n; i++) {
                List<Integer> list = new ArrayList<>(outer.get(i));
                list.add(e);
                outer.add(list);
            }
        }
        return outer;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(subset(arr));
    }
}
