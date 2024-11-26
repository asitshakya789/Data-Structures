public class matrix {

    public static int matrixmultiplication(int arr[][]  , int  n ){

        int sum = 0 ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + arr[i][j];
            }
        }
    }
    public static void main(String[] args) {

    }
}