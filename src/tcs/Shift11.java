package tcs;

import java.util.*;

public class Shift11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            int currSum = 0;
            for(int j=i; j<n; j++) {
                currSum += arr[j];
                if (currSum == sum) {
                    for(int k=i; k<=j; k++) {
                        System.out.print(arr[k]);
                    }
                    System.out.println();
                }
            }
        }
    }
}