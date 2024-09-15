public class QuickSort {
    public static int partition(int arr[], int start, int end) {
        int pos = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < arr[end]) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            } 
        }
        // Swap the pivot element with the element at the pos index
        int temp = arr[pos];
        arr[pos] = arr[end];
        arr[end] = temp;
        return pos;
    }

    static void quicksort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = partition(arr, start, end);
        quicksort(arr, start, pivot - 1);
        quicksort(arr, pivot + 1, end);
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 1, 7};
        quicksort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}