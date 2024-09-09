/**
 * Selection_Sort
 */
public class Selection_Sort {
    void Selectionsort(int arr[], int n){
        for(int i = 0 ; i < n - 1; i++){ // iterate until n-1
            int min = i;
            for(int j = i + 1; j < n; j++){ // start from i+1 to avoid unnecessary comparisons
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        Selection_Sort ob = new Selection_Sort();
        int arr[] = {64, 34, 25, 12, 22, 33};
        int n = arr.length;
        ob.Selectionsort(arr, n);
        for(int i = 0; i < n; i++){ 
            System.out.print(arr[i] + " ");
        }
    }
}