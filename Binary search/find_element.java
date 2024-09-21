/**
 * find_element
 */
public class find_element {

    public static int findelement(int[] arr, int terget){

        for(int  i= 0 ;i <arr.length ; i++){
            if(arr[i] == terget){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,7};
        int terget = 7;
        int result = findelement(arr, terget);
        System.out.println(result);
    }
}