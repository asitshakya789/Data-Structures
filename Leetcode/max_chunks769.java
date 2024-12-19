package Leetcode;

public class max_chunks769 {

    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int ch = 0;
        int cf = 0;
        for (int i = 0; i < n; i++) {
            cf = Math.max(cf, arr[i]);
            if (cf == i) {
                ch++;
            }

        }
        return ch;
    }

    public static void main(String[] args) {
        max_chunks769 obj = new max_chunks769();
        int[] arr = { 1, 2, 5, 6, 5, 0, 3, 2 };
        System.out.println(obj.maxChunksToSorted(arr));

    }
}