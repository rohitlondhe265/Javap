package tcs;

import java.util.Scanner;

public class NextShift11 {
    public static void main(String[] args) {
        // n 10 output => 550
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += n*i;
        }
        System.out.println(sum);
    }
}
