package tcs;

import java.util.*;

public class MinWordReqToMakeStr {

    static ArrayList<String> list = new ArrayList<>();

    static void subSet(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            if (isPalindrome(processed))
                list.add(processed);
            return;
        }
        subSet(processed + unprocessed.charAt(0), unprocessed.substring(1));
        subSet(processed, unprocessed.substring(1));
    }

    static boolean isPalindrome(String str) {
        int s = 0, e = str.length() - 1;
        while (s <= e) {
            if (str.charAt(s++) != str.charAt(e--))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // find all substrings
        // add only those substrings which are palindromes
        subSet("", "aab");
        System.out.println(list);
    }
}
