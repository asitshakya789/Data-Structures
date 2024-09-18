import java.util.Scanner;

public class EvenChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0 && number != 2) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}