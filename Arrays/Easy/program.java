import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter the arraybnumber you want to print = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i= 0 ;i<n;i++){
            System.out.print("Array of the index "+  i + " is ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    
}
