import java.util.*;

public class MaxSubarray {

    public static void sumarray(int[] number) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                curr = 0;
                for (int k = start; k <= end; k++) {
                    curr += number[k];
                }
                if (max < curr) {
                    max = curr;
                }
            }
        }
        System.out.println("Max sum " + max);
    }

    public static void main(String[] args) {
        int[] number = {3, 4, 6, -1, 4, -6, 8, -3};
        sumarray(number);
    }
}