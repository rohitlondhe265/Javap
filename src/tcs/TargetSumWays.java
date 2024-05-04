package tcs;

import java.util.*;

public class TargetSumWays {

    public static int helper(int[] arr, int target, int index, int currSum) {
        if(index == arr.length) {
            if(currSum == target) return 1;
            else return 0;
        }
        return helper(arr, target, index+1, currSum+arr[index])  + helper(arr, target, index+1, currSum-arr[index]);
    }
    public static int ways(int[] arr, int target) {
        return helper(arr, 4, 0, 0);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,0,0,4,6,2,1,1};
        System.out.println(ways(arr, 4));
    }
}