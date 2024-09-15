import java.util.*;
public class ShellSort {
    public static void shellSort(int arr[]) {
        int n = arr.length;
        for (int gap = n / 2; gap >= 1; gap = gap / 2) {
            for (int j = gap; j < n; j++) {
                for (int i = j - gap; i >= 0; i = i - gap) {
                    if (arr[i + gap] > arr[i]) {
                        break;
                    } else {
                        int temp = arr[i];
                        arr[i] = arr[i + gap];
                        arr[i + gap] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 6, 4};
        shellSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}