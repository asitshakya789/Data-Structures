import java.util.Scanner;

public class example {

    public static void bubblesort( int[] arr){
    int n = arr.length;
        for(int i = 0 ; i< n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,7,78,98765,43,4,5,6};
        bubblesort(arr);
        int n = arr.length;
        for(int  i = 0 ; i< n ; i++){
             System.out.println(arr[i]);
        }
    }
}
