package tcs;

import java.util.*;

// input: n = 10, k = 15 (subarray with sum having k)
//         arr = [5,3,7,14,18,1,18,4,3,8]
// output: {1, 3}

public class SlidingWindow {
    static int[] findSum(int[] arr, int k, int n) {
        int[] ans = {0, Integer.MAX_VALUE};
        int s=0, e=0, currSum=0;
        while (e < n) {
            currSum += arr[e];
            while (currSum > k) {
                currSum -= arr[s++];
            }
            if (currSum == k && (e-s < ans[1]-ans[0])) { // second condition to get min window occurance
                ans[0] = s;
                ans[1] = e;
            }
            e++;
        }
        if (ans[1] == Integer.MAX_VALUE) {
            System.out.println("Not found");
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans[] = findSum(arr, k, n);
        System.out.println((ans[0]+1) + " " + (ans[1]+1));

    }
} 
