package tcs;

import java.util.*;

public class GoodString {
    static int getNearest(int[] arr, int target) {
        int s = 0, e = arr.length - 1;
        while (s < e) {
            if (Math.abs(target - arr[s]) <= Math.abs(arr[e] - target)) {
                e--;
            } else {
                s++;
            }
        }
        return arr[s];
    }

    public static void main(String[] args) {
        String goodStr = "6*K4AQf]gpi";
        String name = "Nainika";
        int[] arr = new int[goodStr.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = goodStr.charAt(i) + 0;
        }
        Arrays.sort(arr);

        for (int i : arr) {
        System.out.print(i + " ");
        }
        System.out.println();
        for (char c : name.toCharArray()) {
        System.out.print(c + 0 + " ");
        }
        System.out.println();

        int ans = 0;
        for (int i = 0; i < name.length(); i++) {
            int target = name.charAt(i) + 0;
            int nearestSmaller = getNearest(arr, target);
            System.out.println(Math.abs(target - nearestSmaller));
            ans += Math.abs(target - nearestSmaller);
        }
        System.out.println(ans);
    }
}
