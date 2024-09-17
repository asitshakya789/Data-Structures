public class linear_search {
    public static int linearsearch(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 7;
        int result = linearsearch(arr, n);
        if (result != -1) {
            for (int i = 0; i <= result; i++) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("Target value not found in the array.");
        }
    }
}