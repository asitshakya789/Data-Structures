public class ArrangingNumber {
    public static void arrange(int n, int arr[]){
        int right = n-1 ;
        int left = 0;
        int counter = 1 ;
        while (left<=right) {
            if(counter%2==1){
                arr[left] = counter;
                counter ++;
                left ++;
            }
            else{
                arr[right] = counter;
                counter++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[8]; // Initialize the array with a size
        int n = arr.length;
        arrange(n, arr);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}