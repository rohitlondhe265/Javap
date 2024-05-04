package tcs;

import java.util.*;

public class NextShift12 {
    public static void main(String[] args) {
        // sliding window maximum
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        int[] ans = new int[n-k+1];
        for (int i = 0; i <= n-k; i++) {
            int currMax = 0;
            for (int j = 0; j < k; j++) {
                currMax = Math.max(currMax, arr[i+j]);
            }
            ans[i] = currMax;
        }
        for(int e : ans) System.out.print(e+" ");
    }
}
