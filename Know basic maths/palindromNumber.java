public class palindromNumber {
    public static void main(String[] args) {
        int n = 1331;
        int originalNumber = n; // store the original number
        int lastDigit = 0;
        int reversedNumber = 0;
        while (n > 0) {
            lastDigit = n % 10;
            n = n / 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
        }
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number");
        } else {
            System.out.println(originalNumber + " is not a palindrome number");
        }
    }
}