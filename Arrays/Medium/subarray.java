import java.util.*;
public class subarray {
    public static void subarrayprint(int number[]){
        int sum=0;
        for(int i =0 ;i<number.length; i++){
            int start = i ;
            for(int j = i;j <number.length ;j++){
                int end = j ;
                for(int k = start;k<=end;k++){
                    System.out.print(number[k]+" ");

                }
                sum ++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println(+sum);

        
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6,7,8,9,10};
        subarrayprint(number);
    }
    
}
