import java.util.Arrays;

public class Remove_Duplicates {
    public static int[] removeduplicate(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        Arrays.sort(arr);
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return Arrays.copyOf(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 2, 4, 6, 7, 9, 8, 4, 56, 3};
        int[] newArr = removeduplicate(arr);
        System.out.println("Number of elements after removing duplicates: " + newArr.length);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}