import java.util.Scanner;

public class user_break {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter a number");
            n = sc.nextInt();
            if(n%10==0)
                break;
        } while (true);
        System.out.println(n);
    }
}
