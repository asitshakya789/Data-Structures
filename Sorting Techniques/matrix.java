public class matrix {

    public static int matrixMultiplication(int arr[][], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = arr.length;
        int result = matrixMultiplication(arr, n);
        System.out.println("Sum of all elements in the matrix: " + result);
    }
}