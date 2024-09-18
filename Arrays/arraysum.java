import java.util.Scanner;

public class arraysum {
    public static int sumarray(int[] arr){
        int res = 0;
        for(int i =0 ;i<arr.length;i++){
            res = res+arr[i];
        }
        return res ; 
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        int sum = sumarray(arr);
        System.out.println("'The sum  of the array" +sum);
    }



    
}
