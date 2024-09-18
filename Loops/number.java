import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Range = sc.nextInt();
        int counter = 1;
        while (counter<=Range) {
            System.out.println(counter + " ");
            counter ++;
        }
    }
}
