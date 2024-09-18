import java.util.*;

public class KadansAlgoSumarray {

    public static void kadans(int[] number){
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        for(int i = 0; i < number.length; i++){
           current_sum += number[i];
           if(current_sum<0){
            current_sum = 0;
           }
           max_sum = Math.max(max_sum, current_sum);
        }
        System.out.println(max_sum);

    }

    public static void main(String[] args) {
        
        int[] number = {1, -2, 3, 10, -4, 7, 2};
        kadans(number);

    }
    
}