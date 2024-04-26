package tcs;

import java.util.*;

public class OddlyEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int oddSum = 0;
        int evenSum = 0;
        int k = 1;
        while (n > 0) {
            if (k % 2 == 0) {
                evenSum += n % 10;
                k++;
                n = n/10;
            } else {
                oddSum += n % 10;
                k++;
                n = n/10;
            }
        }
        System.out.println(Math.abs(evenSum-oddSum));
    }
}
