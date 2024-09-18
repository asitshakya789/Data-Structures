import java.util.Scanner;

public class LargestmongN {

    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){ // changed from i<=n to i<n
            System.out.println("Enter the element of " +i+" index");
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static int largest(int[] arr){
        int max =Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        int lar = largest(arr);
        System.out.println("The largest element is: " + lar);

    }
}