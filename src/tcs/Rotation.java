package tcs;

public class Rotation {
    static void rotateOnce(int arr[]) {
        int curr = arr[arr.length - 1];
        int next = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = curr;
            curr = next;
            if (i < arr.length - 1) {
                next = arr[i + 1];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7,9,4,3,2 };
        for (int e : arr)
            System.out.println(e);
        int k = 3;
        int[] indices = { 0, 3 };
        k = k % arr.length;

        for (int i = 0; i < k; i++) {
            rotateOnce(arr);
        }

        for (int i = 0; i < indices.length; i++) {
            System.out.print(arr[indices[i]] + " ");
        }
    }
}
