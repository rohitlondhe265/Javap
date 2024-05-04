package tcs;

import java.util.*;

public class Shift12 {
    public static int maze(int[][] arr, int r, int c, int m, int n) {
        if (r == m || c == n)
            return 0;
        if (arr[r][c] == 1)
            return 0;
        if (r == m - 1 && c == n - 1)
            return 1;
        return maze(arr, r + 1, c, m, n) + maze(arr, r, c + 1, m, n);
    }

    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 0 } };
        System.out.println(maze(arr, 0, 0, 3, 3));
    }
}
