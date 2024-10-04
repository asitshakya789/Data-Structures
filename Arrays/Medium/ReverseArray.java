import java.util.*;

public class ReverseArray {

    public static void reversearray(int[] number){
        int first = 0;
        int last = number.length-1;
        while (first<last) {
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] number = {3,4,65,2,5,2,5};
        reversearray(number);
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}