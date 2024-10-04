public class Sorted_012 {
    public static void sort012(int arr[]){
         int j =0 ;
         int i =0 ;
         int k = arr.length-1;
         while(i<=k){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;

            }else if(arr[i]==1){
                i++;
            }else{
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 0, 1,1,2,2,1,1,0,2,0,2};
        sort012(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
