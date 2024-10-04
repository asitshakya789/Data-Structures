import java.util.*;

public class pairs {

    public static void printpair(int[] number){
        for(int i=0;i<number.length;i++){
            int curr = number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.println(curr + " " + number[j]);
            }
        }
    }

    public static void main(String[] args) {
        int[] number = {2, 4, 3, 5, 6, 7};
        printpair(number);
    }
}
