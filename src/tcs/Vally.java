package tcs;

import java.util.Scanner;

public class Vally {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int steps = sc.nextInt();
        String path = sc.next();

        int vallys = 0;
        int sealevel = 0;
        for (int i = 0; i < steps; i++) {
            if(path.charAt(i)=='D') sealevel -= 1;
            else sealevel += 1;
            if(path.charAt(i)=='U' && sealevel == 0) vallys++;
        }
        System.out.println(vallys);
    }
}