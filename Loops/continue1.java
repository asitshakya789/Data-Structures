import java.util.Scanner;

public class continue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the number : ");
            int num = sc.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println("The number is : "+num);
        }while(true);
    }
}
