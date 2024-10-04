import java.util.*;
public class binary {
    public static int binarysearch(int number[],int key ){
        int start = 0 ; 
        int end = number.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(number[mid]==key){
                return mid ;

            }if(number[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,53,5,3,4,52};
        int key = 5;
        int result = binarysearch(number,key);

        System.out.println("number at index  "+result);
    }
    
}
