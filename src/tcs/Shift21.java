package tcs;

import java.util.Scanner;

public class Shift21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        // print sum of cubes from m to n
        long ans = 0;
        for(int i=m; i<=n; i++) {
            ans += Math.pow(i, 3);
        }
        System.out.println(ans);
    }
}
