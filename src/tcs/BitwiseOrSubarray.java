package tcs;

import java.util.*;

public class BitwiseOrSubarray {
    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int e : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> list = new ArrayList<>(outer.get(i));
                list.add(e);
                outer.add(list);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        // perform bitwise or and return no. of distinct values on each subarray of
        // input array.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        List<List<Integer>> list = subset(arr);
        Set<Integer> set = new HashSet<>();
        for (List<Integer> l : list) {
            int sum = 0;
            for (Integer e : l) {
                sum |= e;
            }
            set.add(sum);
        }
        System.out.println(set.size() - 1);

    }

}

// static void subArrayOr(int[] arr, int start, ArrayList<Integer> list, HashSet<Integer> set) {
//     if(start >= arr.length) {
//         return;
//     }
//     for(int i=start; i<arr.length; i++) {
//         list.add(arr[i]);

//         System.out.println(list);
//         int result = 0;
//         for (int j = 0; j < list.size(); j++) {
//             result |= list.get(j);
//         }
//         set.add(result);

//         subArrayOr(arr, i+1, list, set);
//         list.remove(list.size()-1);
//     }
// }