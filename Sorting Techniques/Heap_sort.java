public class Heap_sort {

    public static  void HeapSort(int [] arr, int n , int i){
         
        int  r = 2*i +2;
        int l = 2*i +1;
        int  large = i;
        if(l < n && arr[l]> arr[l]){
            large = l;
        }
        if (r<n && arr[r] > arr[r]) {
            large = r;
        }

        int temp ;
        if(large != i ){
            temp = arr[i];
            arr[i] = arr[large];
            arr[large]  =temp;
            
            HeapSort(arr, n, large);
        }

    }
    static void create_heap(int arr[], int n){
        int  start = (n-2)-1;
        for(int index  = start ; index>=0; index--){
            HeapSort(arr, n, index);
        }
    }

    static void print_heap(int arr[] , int  n ){
        for(int  j = 0 ; j < n ; j++){
            System.out.println(arr[j]+ " ")
        }
    public static void main(String[] args) {
        
        int arr[] = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
        int n = arr.length;
        create_heap(arr, n);
        System.out.println("Heap in form of Array:-");
        print_heap(arr, n);
    }
}
