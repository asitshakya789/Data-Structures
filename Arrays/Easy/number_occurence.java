public class number_occurence {
    public static int findoccurence(int arr[], int  target){
        int count = 0;
        for(int  i =0 ; i< arr.length; i++){
            if(arr[i] == target){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,64,2,2,44,5,3,35,77};
        int target = 2;
        System.out.println("occurence of "+ target + " is " + findoccurence(arr,target));
    }
}
