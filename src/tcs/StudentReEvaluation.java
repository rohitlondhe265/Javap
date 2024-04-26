package tcs;
import java.util.*;

// input : N = 5
//         M = [1,1,2,5,2]
//         disqualify students with same marks siting imidiate behind

//         marks update :  k = 2
//                         1 -> 3 , 4 -> 2

// output: for first re-evaluation ans is 5
//         for second ans is 3

public class StudentReEvaluation {
    static String fun(int x, int y, int[] arr) {
        arr[x-1] = y;
        int ans = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i]!=arr[i-1]) ans+=1;
        }
        return "No. of Students part of merit list are: " + ans;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] m = new int[n];
        for(int i=0; i<n; i++) {
            m[i] = sc.nextInt();
        }

        for(int i=0; i<k; i++) {
            // x: position and y: element to update in array m
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(fun(x, y, m));
        }
    }
}
