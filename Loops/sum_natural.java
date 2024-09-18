import java.util.Scanner;

public class sum_natural {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        int sum  =0 ;
        int i = 1;
        while (i<=number) {
            sum  = sum +i;
            i++;

            
        }
        System.out.println( "sum is "+ sum);
    }
}
