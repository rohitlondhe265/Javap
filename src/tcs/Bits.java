package tcs;

import java.util.Scanner;

public class Bits {

    // find number of numbers less than 7 that has exactly 2 ones(1) in it's binary
    // format
    // i/o : 7 2
    // o/p : 3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < m; i++) {
            String bits = m.toBinaryString(i);
            int currCount = 0;
            for (int j = 0; j < bits.length(); j++) {
                if(bits.charAt(j)=='1') currCount++;
            }
            if(currCount == n) count++;
        }
        System.out.println(count);
    }
}
