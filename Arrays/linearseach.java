import java.util.Scanner;
    public class linearseach {


    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want arr");
        int n = s.nextInt();
    
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){ // changed from i<=n to i<n
            System.out.println("Enter the element of " +i+" index");
            arr[i] = s.nextInt();
            
        
        }
        return arr;
    }
    public static int searchnums(int[] arr){
        int searchnum = 12;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == searchnum){
                return i ;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        int lar = searchnums(arr);
        System.out.println("The largest element is: " + lar);

    }
}

