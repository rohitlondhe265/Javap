package tcs;

public class GoldRoom {
    public static void main(String[] args) {
        int n = 10;
        int k = 15;
        int[] rooms = { 5, 3, 7, 14, 18, 1, 18, 4, 3, 8 };
        boolean isFound = false;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += rooms[j];
                if (sum == k) {
                    System.out.println((i + 1) + " " + (j + 1));
                    isFound = true;
                } else if (sum > k)
                    break;
            }
            if (isFound) break;
        }
    }
}
