import java.util.*;
public class Rotate_Array {
    public void rotate(int arr[], int n){
        int temp = arr[0];
        for(int  i = 0 ;i<n-1 ;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
    }
    public static void main(String[] args) {
        Rotate_Array obj = new Rotate_Array();
        int arr[] = {1, 2, 3, 4, 5};
        obj.rotate(arr, arr.length);
        // Print the rotated array
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}