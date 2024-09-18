import java.util.*;

public class LargestNumber {

    public static int largestnum(int[] number) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] number = {3, 54, 3, 32, 5};
        System.out.println("largest number "+ largestnum(number));
    }
}