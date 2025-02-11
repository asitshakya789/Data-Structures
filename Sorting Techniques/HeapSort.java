public class HeapSort {

    public static void heapSort(int[] arr, int n, int i) {
        int r = 2 * i + 2;
        int l = 2 * i + 1;
        int large = i;
        if (l < n && arr[l] > arr[large]) {
            large = l;
        }
        if (r < n && arr[r] > arr[large]) {
            large = r;
        }

        if (large != i) {
            int temp = arr[i];
            arr[i] = arr[large];
            arr[large] = temp;

            heapSort(arr, n, large);
        }
    }

    static void createHeap(int arr[], int n) {
        int start = (n / 2) - 1;
        for (int index = start; index >= 0; index--) {
            heapSort(arr, n, index);
        }
    }

    static void printHeap(int arr[], int n) {
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        int n = arr.length;

        createHeap(arr, n);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapSort(arr, i, 0);
        }

        printHeap(arr, n);
    }
}