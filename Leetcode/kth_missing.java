package Leetcode;

public class kth_missing {

    public int kthMissing(int[] arr, int k) {
        int current = 1;
        int index = 0;
        int missingCount = 0;
        
        while (missingCount < k) {
            if (index < arr.length && arr[index] == current) {
                index++;
            } else {
                missingCount++;
                if (missingCount == k) {
                    return current;
                }
            }
            current++;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        kth_missing obj = new kth_missing();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        System.out.println(obj.kthMissing(arr, k));
    }
}