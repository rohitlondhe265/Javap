package tcs;

import java.util.*;

public class PalindromePartitions {

    static List<List<String>> partion(String str) {
        List<List<String>> list = new ArrayList<>();
        partionHelper(str, list, 0, new ArrayList<>());
        return list;
    }

    static void partionHelper(String str, List<List<String>> list, int index, List<String> path) {
        if (index == str.length()) {
            list.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < str.length(); i++) {
            if (isPalindrome(str, index, i)) {
                path.add(str.substring(index, i + 1));
                partionHelper(str, list, i + 1, path);
                path.remove(path.size()-1);
            }
        }
    }

    static boolean isPalindrome(String str, int s, int e) {
        while (s <= e) {
            if (str.charAt(s++) != str.charAt(e--))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<String>> ans = partion("aabb");
        System.out.println(ans);
    }
}
