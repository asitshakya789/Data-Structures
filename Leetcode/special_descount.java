package Leetcode;

public class special_descount {

    public static int[] specialDiscount(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for(int  i= 0 ; i< n  ; i++){
            for(int  j = i+1 ; j< n ; j++){
                if(arr[j]<=arr[i]){
                    ans[i] = arr[i]-ans[j];
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {8,4,6,2,3};
        int[] ans = specialDiscount(arr);
        for(int i = 0 ; i< ans.length ; i++){
            System.out.println(ans[i]);
            }
            
    }
}