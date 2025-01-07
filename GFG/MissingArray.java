package GFG;

public class MissingArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8};
        System.out.println(missingNumber(arr, arr.length));
    }

    public static int missingNumber(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return (n + 1) * (n + 2) / 2 - sum;
    }
}
